package com.company;

import java.util.Scanner;

public class Main {

    public static Contacts contactsList = new Contacts(); //contactsList is the object of class Contacts in this case
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice=0;
        printInstructions();
        boolean quit=false;
        while(!quit)
        {
            System.out.println("Enter Your Choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactsList.printContact();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    modifyContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("Press");
        System.out.println("0 - To see choices");
        System.out.println("1 - To see contacts");
        System.out.println("2 - To add a contact");
        System.out.println("3 - To modify a contact");
        System.out.println("4 - To remove a contact");
        System.out.println("5 - To search a contact");
        System.out.println("6 - To quit the application");
    }
    public static void addContacts()
    {
        System.out.println("Enter the name of the contact you want to add: ");
        contactsList.addContact(scanner.nextLine()); //using the scanner input directly in a function
    }
    public static void modifyContacts(){
        System.out.println("Enter the name of the contact you wish to modify: ");
        String name=scanner.nextLine();
        String newName=scanner.nextLine();
        contactsList.modifyContact(name, newName);
    }


    public static void removeContacts()
    {
        System.out.println("Enter the name of the contact you wish to remove: ");
        contactsList.removeContact(scanner.nextLine());

    }
    public static void searchContacts()
    {
        System.out.println("Enter the name of the contact you want to search: ");
        String name=scanner.nextLine();
        if(contactsList.findContact(name)){
            System.out.println("Found " + name);
        }else
            System.out.println("Not Found");
    }
}
