#!/bin/bash

BASEDIR=$(dirname $0)
. $BASEDIR/_functions.sh

GIT_USERNAME=
VERSION=

function usage {
  cat << EOF

	${PRG} [-h] --git_username <GitUser> --version <VERSION> [--tag <TAG>]

	-h                                  - Usage info
	-u | --git_username <GitUser>       - BSI Git Username, SSH Key is used for authorisation
	-v | --version <VERSION>            - <VERSION> name
	-t | --tag <TAG>                    - <TAG> name (Optional / Default: <VERSION>)

	Example: ${PRG} -u sle -v 10.0.42

EOF
}

function get_options {
	# Loop until all parameters are used up
	while [ "$1" != "" ]; do
		case $1 in
			-u | --git_username )		shift
										GIT_USERNAME=$1
										;;
			-v | --version )			shift
										VERSION=$1
										;;
			-t | --tag )			shift
										TAG=$1
										;;
			-h | --help )				usage
										exit 7
										;;
			* )							break;;
		esac
		shift
	done
	_MAVEN_OPTS="$_MAVEN_OPTS $@"
}
get_options $*

if [[ -z "$GIT_USERNAME" ]]; then
	echo "[ERROR]:       <GitUser> missing"
	usage
	exit 7
fi
if [[ -z "$VERSION" ]]; then
	echo "[ERROR]:       <VERSION> missing"
	usage
	exit 7
fi
if [[ "$TAG" ]]; then
	_MAVEN_OPTS="$_MAVEN_OPTS -Dmaster_release_tagName=$TAG"
fi
_MAVEN_OPTS="$_MAVEN_OPTS -e -B"

mvn -f com.bsiag.scout.rt -P release.setversion -Dmaster_release_newVersion=$VERSION -N $_MAVEN_OPTS
processError

$BASEDIR/build.sh -Dmaster_unitTest_failureIgnore=false $_MAVEN_OPTS
processError

mvn -f com.bsiag.scout.rt -P release.checkin -Dbsi_gerrit_username=$GIT_USERNAME $_MAVEN_OPTS
processError

mvn -f com.bsiag.scout.rt -P release.tag -Dbsi_gerrit_username=$GIT_USERNAME -Dmaster_release_pushChanges=true $_MAVEN_OPTS
processError

git reset HEAD~1 --hard
