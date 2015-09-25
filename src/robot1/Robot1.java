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
    private static boolean newSight    = false;
    private static boolean newHear     = false;
    private static boolean newInternet = false;
    private static boolean newAnalysis = false;
    private static boolean talktalk    = false;
    private static boolean saveit      = false;
    private static boolean action      = false;
    private static long thetime;

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

            System.out.println("--> THREAD 0 starting threads 1 to 4 ");
            T1.start();
            T2.start();
            T3.start();
            T4.start();

            while(true){
                System.out.println("!!> Sys Time "+ System.currentTimeMillis());
                System.out.println("--> THREAD 0 starting do loop of main brain ");
                mysenses.test();
                myMovements.testpi();
                myMasterAnalyser.waitForWork();
                
                //use sight
                //use hearing
                //on interrupt do something

                if (newSight == true){
                    System.out.println("--> THREAD 0 got new sight processing");
                    // on analysis do something      

                    newSight = false; 
                }

                if (newHear  == true){
                    System.out.println("--> THREAD 0 ");

                    // on analysis do something             
                    newHear = false;  
                }

                if (newInternet == true){
                    System.out.println("--> THREAD 0 ");
                    // on analysis do something             
                    newInternet = false; 
                }

                if (newAnalysis ==true){
                    System.out.println("--> THREAD 0 ");
                    newAnalysis = false;
                    String saythis  = "";


                    if(talktalk == true){
                        System.out.println("--> THREAD 0 ");
                        talktalk = false;
                        mySpeech.saySentence(saythis);

                    }

                    if(saveit == true ){
                        System.out.println("--> THREAD 0 ");
                        saveit = false;
                        Memory newMemory = new Memory();
                        newMemory.setIDNumber(0);

                    }
                    
                    if(action == true){
                        System.out.println("--> THREAD 0 ");

                        action = false; 

                    }         
                } 
            }  
        } catch (Exception e) {
            // Handle error
            System.out.println( "!! THREAD 0!!  !!! Exception of some kind: " + e );
            // dump information about exactly where the exception occurred
            e.printStackTrace( System.err );   
            //shut down robot
        }
    } 
    
    
    public void setnewSight(){
        System.out.println("--> THREAD 0 ");
        newSight = true;
        //long thetime;
        Robot1.thetime = System.currentTimeMillis();
            
    }
    
    public void setnewHear(){
        System.out.println("--> THREAD 0 ");
        newHear =true;
        
    }
    
    public void setnewInternet(){
        System.out.println("--> THREAD 0 ");
        newInternet = true;
        
    }
    
    public void setnewAnalysis(){
        System.out.println("--> THREAD 0 ");
        newAnalysis = true;
        
    }
    
    public void settalktalk(){
        System.out.println("--> THREAD 0 ");
        talktalk = true;
        
    }
    
    public void setSaveIt(){
        System.out.println("--> THREAD 0 ");
        saveit = true;
        
    }
    
    public void setaction(){
        System.out.println("--> THREAD 0 ");
        action = true;
        
    }
    
    public void clearnewSight(){
        System.out.println("--> THREAD 0 ");
        newSight = false;
        
    }
    
    public void clearnewHear(){
        System.out.println("--> THREAD 0 ");
        newHear =false;
        
    }
    
    public void clearnewInternet(){
        System.out.println("--> THREAD 0 ");
        newInternet = false;
        
    }
    
    public void clearnewAnalysis(){
        System.out.println("--> THREAD 0 ");
        newAnalysis = false;
        
    }
    
    public void cleartalktalk(){
        System.out.println("--> THREAD 0 ");
        talktalk = false;
        
    }
    
    public void clearSaveIt(){
        System.out.println("--> THREAD 0 ");
        saveit = false;
        
    }
    
    public void clearaction(){
        System.out.println("--> THREAD 0 ");
        action = false;
        
    }
    
}
