/*
 * This is the SNAKE LIST. It is an oop app. This app allows to list a snake list that contains a few snakes in basic configuration. 
 * It allows to find a snake by a name or by a picture of a part of a snake's body. It is posible to add your own snake 
 * or erase any snake.There are 4 classes. The Main class controls the List class where is logic for work with the Database class.  
 * In the Database class there is placed a database with snakes. Snakes are defined in the Snake class. 
 */
package cz.martin.theSnakeList;

import java.util.Scanner;

/**
 * @author mARTin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
       
        List list = new List();
        
        String selection="";
        System.out.println("The  sssSSSSssssSSSSssssSNAKE LIST");
         
        
        while(!selection.equals("6")){ 
            System.out.println("ssssSSSSssssSSSSssssSSSSssssSSSSssssSSSSssssSSSS:<");
            System.out.println("InSSssssSSSSsert your selection:   ");
            System.out.println("1. Show the list | 2. Find by a name | 3. Find by a part of the snakes picture | 4. Add a snake | 5. Erase a snake | 6. Exit the SNAKE LIST");
            selection= sc.nextLine();
                switch (selection){
                    case "1" -> list.printList();
                    case "2" -> list.findByName();
                    case "3" -> list.findByPic();
                    case "4" -> list.addRecord();
                    case "5" -> list.eraseRecord();
                    case "6" -> System.out.println("Thank you for your visssSSSsssSSSite:<");
                    default -> System.out.println("Invalid selection");
              }   
                System.out.println("\n");
        }
    }
}
