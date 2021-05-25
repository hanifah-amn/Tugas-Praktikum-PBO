/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();
        
        Contact lisa = new Contact("Lisa","lisa@gmail.com", "081234567890");
        myContactsManager.addContact(lisa);
        
        Contact putri = new Contact("Putri","putri@yahoo.com", "0813 5790 2468");
        myContactsManager.addContact(putri);
        
        Contact aliyah = new Contact("Aliyah","aliyah@gmail.com", "0812 4680 3579");
        myContactsManager.addContact(aliyah);
        
        Contact mega = new Contact("Mega","mega@gmail.com", "081567234890");
        myContactsManager.addContact(mega);
        
        Contact yashmine = new Contact("Yashmine","yashmine@outlook.com", "081234590123");
        myContactsManager.addContact(yashmine);
        
        
        //searchContact
        Scanner input = new Scanner(System.in);
        String name, repeat;
        
        do{
            System.out.print("Search name: ");
            name = input.next();
            
            System.out.println("Looking for " + name + "'s contact ...");
            Contact searchContact = new Contact("","","");
            searchContact = myContactsManager.searchContact(name);
            if(searchContact!=null){
                System.out.println("Name\t\t: " + searchContact.getName());
                System.out.println("Phone number\t: " + searchContact.getPhoneNumber());
                System.out.println("E-mail\t\t: " + searchContact.getEmail());
            }
            else System.out.println("Contact not found!");
            
            System.out.print("\nSearch again? (y/n) ");
            repeat = input.next();     
        }
        while("y".equalsIgnoreCase(repeat));
    }
}
