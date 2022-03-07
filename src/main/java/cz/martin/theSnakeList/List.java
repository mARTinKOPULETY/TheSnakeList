/*
 * This is the List class. Here is placed logic for work with the database.
 */
package cz.martin.theSnakeList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mARTin
 */
public class List {
    
    
    private Database database;   
    private int id; 
    // the counter counts a number of cycles that  have  elapsesd to print a correct  output
    private int counter=0; 
    Scanner sc = new Scanner(System.in);  
    
    public List(){
       
        database= new Database();   
        id = 1 + database.size(); 
    }   
    
    
    public void addRecord(){ 
        //To get size of basic size of the Snake List and assign a new id number to a new snake
       // id= 1 + database.size();    
        System.out.println("Create a snake's name and press Enter. ");       
        String name = sc.nextLine();
        name=name.toLowerCase();
        System.out.println("Create the "+name+"'s picture and press Enter. ");
        String pic = sc.nextLine();
        database.addRecord(name, pic, id);
        System.out.println("");
        System.out.println("The snake " + name + " is added.");
        // increase the id by one to make a unique number
        id++;
    }  

   
    public void eraseRecord(){
        System.out.println("Write the snake's name that should be erased:");
        String name = sc.nextLine();
        // makes new ArrayList of the Snake eraseByName that  loads the original database
        ArrayList<Snake> eraseByName = database.findRecords();
        Iterator<Snake> itr =eraseByName.iterator();
        System.out.println("");
        while(itr.hasNext()){     
           Snake  snake = itr.next(); 
           //checking of the snakes name if  it is in the database
             if(!snake.getName().equals(name) ) {
                 counter++;
                 if(counter == database.size()){
                 System.out.println("The snake \"" +name +"\" is not in The SNAKE LIST.");   
                 }
        }  else
         System.out.println("The snake \"" +name +"\" is erased.");         
        }
         //  reset the counter for next use
        counter =0;
        database.eraseRecord(name);
    }    
    public void printList(){
        System.out.println("");
        // a teplate of  the Snake list header
        templSnakeList();
       ArrayList<Snake>records =  database.findRecords();
       for(Snake w:records){
           System.out.println(w);
       }          
        System.out.println("");
    }
    
 
    
    public void findByName(){
        System.out.println("Insert a name of a snake.");
        String findByName = sc.nextLine();
        findByName=findByName.toLowerCase();
        System.out.println(""); 
        ArrayList<Snake>recordsByName = database.findRecords();
        Iterator<Snake> itr =recordsByName.iterator();
        while(itr.hasNext()){     
             Snake snake = itr.next();    
             if(snake.getName().contains(findByName)){                 
               counter++;
              if(counter == 1){
                  System.out.println("The result of searching for by the name \""+ findByName + "\" is: "); 
                 templSnakeList();                   
              }
            System.out.println(snake);          
           }        
        }         
        System.out.println("");
       if(counter == 0){ 
       System.out.println("This \""+ findByName +"\" snake's not in The SNAKE LIST. If you want you can add it." ); 
       System.out.println("");
       }
       counter = 0;  
    }
    
    public void findByPic(){
        System.out.println("Insert a part of a snake's picture.");
        String findByPic = sc.nextLine();   
        System.out.println("");
        ArrayList<Snake> recordsByPic =database.findRecords();  
        Iterator<Snake> itr = recordsByPic.iterator();
        while(itr.hasNext()){
            Snake snake = itr.next();
            if(snake.getPic().contains(findByPic)){
                counter++;
                if(counter == 1) {
                   System.out.println("The result of searching for by the 3picture \""+ findByPic + "\" is: ");
                   templSnakeList();
                }
                System.out.println(snake);              
            }
        }
        if(counter == 0){
             System.out.println("There is no snake that looks like \""+ findByPic+"\". You can add it."); 
        }
        System.out.println("");  
        counter = 0;   
     }    
    
    //method that prints the header  of  the SnakeList
    public void templSnakeList(){
        System.out.println("ID NAME           PICTURE ");
    }
    
}
