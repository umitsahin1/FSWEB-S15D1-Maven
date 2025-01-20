package org.example.mobile;


import java.util.List;


public class MobilePhone {
    private String myNumber;
    private static List<Contact> contacts;
    private Contact contact;

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = contacts;
    }


    public String getMyNumber() {
        return myNumber;
    }


    public List<Contact> getMyContacts() {
        return contacts;
    }


    public boolean addNewContact(Contact contact) {

        if (!contacts.contains(contact)) {
            contacts.add(contact);
            return true;
        }
        return false;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index >= 0) {
            contacts.set(index, newContact);
            return true;
        }
        return false;
    }


    public boolean removeContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            return true;
        }
        return false;

    }


    public int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }


    public int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public static void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}
