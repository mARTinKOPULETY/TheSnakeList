/*
 * This  is the Database  class. Here is logic for  database administration
 */
package cz.martin.theSnakeList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mARTin
 */
public class Database {
    private ArrayList<Snake> snakeList ;
   
    public Database(){
        snakeList = new ArrayList<>();
        
        //basic configuration of  the SNAKE LIST
        snakeList.add(new Snake("adder","wwwwwwww:<",1));
        snakeList.add(new Snake("anaconda","/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\:<",2));
        snakeList.add(new Snake("cobra","WWWWWWWWW(8):<",3));
        snakeList.add(new Snake("slow worm","-----:<",4));
        snakeList.add(new Snake("mamba","wWwWwW:<",5));
        snakeList.add(new Snake("rattlesnake","\"\"oooooooOOOooo:<",6));
      
       
    }
    
    //returns a size of a snakeList to List can create new snake with the original id
    public int size(){
      return snakeList.size();
  }
    
    public void addRecord(String name, String pic, int id){
       snakeList.add(new Snake(name, pic, id));
    }
    
    
    public void eraseRecord(String name){
            Iterator<Snake> itr =snakeList.iterator();
        while(itr.hasNext()){
             Snake remove = itr.next();
             if(remove.getName().equals(name)){
                itr.remove();
                }
        }
    }
   
  //create new arraylist  where are  stored snakes that uses List
   public ArrayList<Snake> findRecords(){      
          ArrayList<Snake> foundRecords = new ArrayList<>();
          for(Snake w:snakeList){
              foundRecords.add(w);
          }
          return foundRecords;         
   }
   
  
   
   
   
}
