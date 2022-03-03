package com.company;

import java.util.ArrayList;

public class Contacts {
    public static ArrayList<String> contactsList=new ArrayList<String>(); //declaring the arrayList contactsList
    public static void printContact(){
        System.out.println("You have " + contactsList.size() + " contacts in your phone");
        for(int i=0;i<contactsList.size();i++)
        {
            System.out.println((i+1) + ". " + contactsList.get(i));
        }
    }
    public void addContact(String contact){
        contactsList.add(contact);
    }
    public void modifyContact(String currentName, String newName){
        int position=findContactPosition(currentName);
        if(position>=0){
            modifyContact(position, newName);
        }
    }
    public void modifyContact(int position, String newName){
        contactsList.set(position, newName);
        System.out.println("The contact " + (position+1) + " has been modified");
    }
    public void removeContact(String contact){
        int position=findContactPosition(contact);
        if(position>=0){
            removeContact(position);
        }
        System.out.println("Contact: " + contact + " deleted.");
    }
    public void removeContact(int position){
        contactsList.remove(position);
    }
    public int findContactPosition(String contact){
        return contactsList.indexOf(contact);
    }
    public boolean findContact(String contact){
        int position=findContactPosition(contact);
        if(position>=0){
            return true;
        }
        return false;
    }
};
