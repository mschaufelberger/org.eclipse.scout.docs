/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.contacts.shared.contact;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.contacts.shared.template.AbstractAddressBoxData;
import org.eclipse.scout.contacts.shared.template.AbstractEmailFieldData;
import org.eclipse.scout.contacts.shared.template.AbstractPhoneFieldData;
import org.eclipse.scout.contacts.shared.template.AbstractPictureBoxData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.contacts.client.contact.ContactForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ContactFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public ContactFormData() {
  }

  public AddressBox getAddressBox() {
    return getFieldByClass(AddressBox.class);
  }

  public Comments getComments() {
    return getFieldByClass(Comments.class);
  }

  public Company getCompany() {
    return getFieldByClass(Company.class);
  }

  /**
   * access method for property ContactId.
   */
  public String getContactId() {
    return getContactIdProperty().getValue();
  }

  /**
   * access method for property ContactId.
   */
  public void setContactId(String contactId) {
    getContactIdProperty().setValue(contactId);
  }

  public ContactIdProperty getContactIdProperty() {
    return getPropertyByClass(ContactIdProperty.class);
  }

  public DateOfBirth getDateOfBirth() {
    return getFieldByClass(DateOfBirth.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public EmailWork getEmailWork() {
    return getFieldByClass(EmailWork.class);
  }

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public GenderGroup getGenderGroup() {
    return getFieldByClass(GenderGroup.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public Mobile getMobile() {
    return getFieldByClass(Mobile.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public PhoneWork getPhoneWork() {
    return getFieldByClass(PhoneWork.class);
  }

  public PictureBox getPictureBox() {
    return getFieldByClass(PictureBox.class);
  }

  public Position getPosition() {
    return getFieldByClass(Position.class);
  }

  public static class AddressBox extends AbstractAddressBoxData {

    private static final long serialVersionUID = 1L;

    public AddressBox() {
    }
  }

  public static class Comments extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Comments() {
    }
  }

  public static class Company extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Company() {
    }
  }

  public static class ContactIdProperty extends AbstractPropertyData<String> {

    private static final long serialVersionUID = 1L;

    public ContactIdProperty() {
    }
  }

  public static class DateOfBirth extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;

    public DateOfBirth() {
    }
  }

  public static class Email extends AbstractEmailFieldData {

    private static final long serialVersionUID = 1L;

    public Email() {
    }
  }

  public static class EmailWork extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public EmailWork() {
    }
  }

  public static class FirstName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public FirstName() {
    }
  }

  public static class GenderGroup extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public GenderGroup() {
    }
  }

  public static class LastName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public LastName() {
    }
  }

  public static class Mobile extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Mobile() {
    }
  }

  public static class Phone extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Phone() {
    }
  }

  public static class PhoneWork extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public PhoneWork() {
    }
  }

  public static class PictureBox extends AbstractPictureBoxData {

    private static final long serialVersionUID = 1L;

    public PictureBox() {
    }
  }

  public static class Position extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Position() {
    }
  }
}
