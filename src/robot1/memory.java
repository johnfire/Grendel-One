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
    
   private static String name = "";
   private static long idNumber = 0;
   private int memValue = 0;
   private static long time = 0;
   
   
  
   public void settime(){
       time =  System.currentTimeMillis();
   }
   public void recordMemory(){
       //record something as a specific memory
       
   }
   
   public void showMemory(){
       //public access to the memory
       
   }
   
   public void eraseMemory(){
       
      //erase memory. needs to be protections here.... 
       
   }
   
   public boolean setIDNumber(long theNumber){
       idNumber = theNumber;
       return true;
   }
   
   public boolean setName(String myName){
       name = myName;
       return true;
   }
   
   public void raiseValue (){
       memValue++;
   }
   
   public void lowerValue (){
       memValue--;
   }
  
}
