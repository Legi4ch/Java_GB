package Homework3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    protected  HashMap<String, HashSet<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void newContact(String name, String phone) {
        HashSet<String> phones = phoneBook.getOrDefault(name, new HashSet<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public void getContact(String name) {
        System.out.println("У " + name + " номер(а) " + phoneBook.getOrDefault(name, new HashSet<>()));
    }
}
