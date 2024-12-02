package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class AddressBookMain {
    public static void main(String[] args)
    {
        PersonContact contact = new PersonContact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book program ");

        System.out.println("Enter first Name");
        String firstName = sc.nextLine();
        contact.setFirstName(firstName);


        System.out.println("Enter last Name");
        String lastName = sc.nextLine();
        contact.setLastName(lastName);

        System.out.println("Enter Address");
        String address = sc.nextLine();
        contact.setAddress(address);

        System.out.println("Enter city");
        String city = sc.nextLine();
        contact.setCity(city);

        System.out.println("Enter state");
        String state = sc.nextLine();
        contact.setState(state);

        System.out.println("Enter zip");
        int zip = sc.nextInt();
        contact.setZip(zip);

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email Id");
        String emailId = sc.next();
        contact.setEmailID(emailId);


        AddressBook addressBook = new AddressBook();
        ArrayList<PersonContact> contacts = new ArrayList<>();
        contacts.add(contact);

        System.out.println(Arrays.toString(contacts.toArray()));
    }
}
