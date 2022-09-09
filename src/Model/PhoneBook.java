package Model;

import Model.Contact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>();


    public List<Contact> getContacts(){
        return contacts;
    }
    public void addContact(Contact ct){
        if(contacts.contains(ct)) updateContact(ct);
        else contacts.add(ct);
    }
    public void removeContact(Contact ct){
        contacts.remove(ct);
    }

    public void updateContact(Contact ct){
        int i = contacts.indexOf(ct);
        if(i!=-1) contacts.set(i,ct);
        else addContact(ct);
    }
}
