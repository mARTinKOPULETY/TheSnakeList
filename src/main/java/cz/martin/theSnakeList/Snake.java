/*
 *This is the Snakes class. Here is a text representatiation of a snake object.
 */
package cz.martin.theSnakeList;



/**
 *
 * @author mARTin
 */
public class Snake {
    private String name;
    private String pic;
    private int id;
    
    public Snake(String name, String pic, int id){
        this.name=name;
        this.pic=pic;
        this.id=id;
    }
    
  /**The text  representation of a snake  makes  a template of  the  snake  list. 
   * It defines  a grid how columns for text are  wide  to look it like a table.
   */
 @Override
  public String toString(){
                String blankSpaceId= "";
                String idString=Integer.toString(id);
                //defines wide of a column for the id 
                int lengthBlankSpaceId =3 - idString.length();               
                for (int i = 0; i < lengthBlankSpaceId; i++) {
                    blankSpaceId= blankSpaceId+ " ";
                }
                String blankSpaceName = "";
                //defines wide of acolumn for the name
                int lengthBlankSpaceName =15 - name.length();               
                for (int i = 0; i < lengthBlankSpaceName; i++) {
                    blankSpaceName= blankSpaceName+ " ";
                }
                
      
      return String.format(id + blankSpaceId +name + blankSpaceName + pic);
      
  }
  

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
}
