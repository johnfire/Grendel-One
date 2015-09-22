 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1;

/**
 *
 * @author christopher-rehm
 */
public class memory {
    
   String name = "";
   private static int idNumber = 0 ;
   
   public void recordMemory(){
       
   }
   
   public void showMemory(){
       
   }
   
   public void eraseMemory(){
       
   }
   
   public boolean setIDNumber(int theNumber){
       idNumber = theNumber;
       return true;
   }
   
   public boolean setName(String myName){
       name =myName;
       return true;
   }
  
}
