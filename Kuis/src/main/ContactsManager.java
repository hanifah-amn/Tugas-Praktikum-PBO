/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class ContactsManager {
    // Fields
    Contact[] myFriends;
    private int friendsCount;
    
    //Constructor
    ContactsManager(){
        //No 3.b
        myFriends = new Contact[500];
        friendsCount = 0;
    }
    
    void addContact(Contact contact){
        //No 3.c
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    
    Contact searchContact(String searchName){
        //No 3.d
        int i;
        for(i=0; i<friendsCount; i++){
            if(searchName.equalsIgnoreCase(myFriends[i].getName())){
                break;
            }
        }
        return(myFriends[i]);
    }
}
