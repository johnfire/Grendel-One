/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.sensesstuff;

/**
 *
 * @author christopher-rehm
 */

import java.util.TimerTask;

public class Hearing extends TimerTask {
    
    private int counter = 0;
    robot1.analysis.analyse myHearing = new robot1.analysis.analyse();
    
    @Override  
    public void run() {  
      
        // The logic of task/job that is going to be executed.
        // Here we are going to print the following string value  
        System.out.println("--> THREAD 1 in hearing This is being printed every .5 sec." + counter);  
        counter = counter + 1;    
    } 
    
/**
 * 
 */
    public void listen() {
        boolean newSound = false;
        String theSound  = "";
        
        if(newSound == true){
            
        }        
    }  
}
