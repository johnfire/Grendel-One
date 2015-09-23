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

public class Speech implements Runnable{
    
    String aVocal = "";
    
    @Override
    public void run(){
        
    }
 
    
    /**
     * this method takes the phrase or sentence and uses the hardware to say the phrase.
     * @param theSentence 
     */
    
    public synchronized void saySentence(String theSentence){
        
        //send sentence out via audio channel
        //write code for this.
                
    }   
}
