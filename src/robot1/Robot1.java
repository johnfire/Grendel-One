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
        
import robot1.sensesstuff.CameraTest;
import robot1.movement.Movement;
import robot1.sensesstuff.senses;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Robot1 {
    private  static boolean newSight    = false;
    private  static boolean newHear     = false;
    private  static boolean newInternet = false;
    private  static boolean newAnalysis = false;
    private  static boolean talktalk    = false;
    private  static boolean saveit      = false;
    private  static boolean action      = false;
    private  static long thetime;

    /**
     * this is the main method of Robot1, that basically puts the whole
     * operation into operation. 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here    
        try {
            senses mysenses      = new senses();
            Movement myMovements = new Movement();
            robot1.analysis.analyseMaster myMasterAnalyser = new robot1.analysis.analyseMaster();
            Speech mySpeech      = new Speech();
            CameraTest myeye     = new CameraTest();

            Thread T1 = new Thread (mysenses);
            Thread T2 = new Thread (myMovements);
            Thread T3 = new Thread (myMasterAnalyser);
            Thread T4 = new Thread (mySpeech);

            T1.start();
            T2.start();
            T3.start();
            T4.start();

            while(true){
                
                mysenses.test();
                myMovements.testpi();
                //use sight
                //use hearing
                //on interrupt do something

                if (newSight == true){

                    // on analysis do something      

                    newSight = false; 
                }

                if (newHear  == true){

                   // on analysis do something             
                   newHear = false;  
                }

                if (newInternet == true){

                   // on analysis do something             
                   newInternet = false; 
                }

                if (newAnalysis ==true){
                   newAnalysis = false;
                   String saythis  = "";


                    if(talktalk == true){
                       talktalk = false;
                       mySpeech.saySentence(saythis);

                    }

                    if(saveit == true ){
                       saveit = false;
                       Memory newMemory = new Memory();
                       newMemory.setIDNumber(0);

                    }
                    
                    if(action == true){

                      action = false; 

                    }         
                } 
            }
            //mysenses.main(args);
            //myMovements.testpi();  
        } catch (Exception e) {
            // Handle error
            System.out.println( "Exception of some kind: " + e );
            // dump information about exactly where the exception occurred
            e.printStackTrace( System.err );   
            //shut down robot
        }
    } 
    
    
    public void setnewSight(){
        newSight = true;
        //long thetime;
        Robot1.thetime = System.currentTimeMillis();
            
    }
    
    public void setnewHear(){
        newHear =true;
        
    }
    
    public void setnewInternet(){
        newInternet = true;
        
    }
    
    public void setnewAnalysis(){
        newAnalysis = true;
        
    }
    
    public void settalktalk(){
        talktalk = true;
        
    }
    
    public void setSaveIt(){
        saveit = true;
        
    }
    
    public void setaction(){
        action = true;
        
    }
    
    public void clearnewSight(){
        newSight = false;
        
    }
    
    public void clearnewHear(){
        newHear =false;
        
    }
    
    public void clearnewInternet(){
        newInternet = false;
        
    }
    
    public void clearnewAnalysis(){
        newAnalysis = false;
        
    }
    
    public void cleartalktalk(){
        talktalk = false;
        
    }
    
    public void clearSaveIt(){
        saveit = false;
        
    }
    
    public void clearaction(){
        action = false;
        
    }
    
}
