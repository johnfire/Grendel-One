/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.senses;

/**
 *
 * @author christopher-rehm
 */

import java.util.Timer; 
import java.util.TimerTask;


public class senses extends TimerTask implements Runnable {
    
    int counter1 = 0;
    int counter2 = 0;
    
    boolean sightOn = false;
    boolean hearingOn = false;
    boolean internetOn = false;
    
    @Override  
    public void run() {  
        // The logic of task/job that is going to be executed.
        // Here we are going to print the following string value  
        System.out.format("in senses This is being printed every 3/4 sec. %d%n ", counter1);  
        counter1 = counter1 + 1;
        for(int i=1; i<1000000; i++){
              counter2++;
        }
    }  
/**
 *the next method runs the sight object and causes it to make pictures, 
 * do basic analysis and return results for further processing.
 */

    public static void runSight(){
        
       
    }  
 
/**
 * 
 */    
       
    public static void stopSight(){
        
    }
    
/**
 *the next method runs the hearing object and causes it to make pictures, 
 * do basic analysis and return results for further processing.
 * 
 */

    public static void runHearing(){
        
       
    } 
    
/**
 * 
 */    
       
    public static void stopHearing(){
        
    }
    
/**
 *does the same for the internet connection.
 * 
 */
    
    public static void runInternet(){
        
       
    } 
    
/**
 * 
 */    
       
    public static void stopInternet(){
        
        
    }
    
/**
 *simply our main function. does nothing at this time. 22-9-2015
 * 
 */   
    
    public static void main(String[] args) { 
        
    }
    
/**
 *
 * send a notice to brain that we have new info
 */    
    
    public static void sendBrainMessage(){
        
    }
    
/**
 *
 * get notice from brain and follow instruxtions
 */    
    
    public static void recieveBrainMessage(){
        
    }
    
/**
 *test routine. simply prints stuff out from the various routines. 
 * 
 */   
    
    public static void test (){
        
        // Create an instance of our task/job for execution  
        senses taskSenses = new senses();
        Sight taskSight = new Sight();
        Hearing taskHearing = new Hearing();

        // We use a class java.util.Timer to   
        // schedule our task/job for execution  
        Timer timer1 = new Timer();  
        Timer timer2 = new Timer();
        Timer timer3 = new Timer();
        // Let's schedule our task/job to be executed every 1 second  
        timer1.scheduleAtFixedRate(taskSenses,0, 750);
        timer2.scheduleAtFixedRate(taskSight, 0, 1000);  
        timer3.scheduleAtFixedRate(taskHearing, 0, 500);
        // First parameter: task - the job logic we   
        // created in run() method above.  
        // Second parameter: 0 - means that the task is   
        // executed in 0 millisecond after the program runs.  
        // Third parameter: 1000 - means that the task is   
        // repeated every 1000 milliseconds         
    }       
}  
   
  
      
   
      
        