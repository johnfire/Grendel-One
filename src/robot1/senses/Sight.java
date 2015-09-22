/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.senses;



/**
 * still in development :-)
 * @author christopher-rehm
 */

import java.util.TimerTask;

public class Sight extends TimerTask {
    
    int counter = 0;
    int counter2 = 0;
    
    @Override  
    public void run() {  
        // The logic of task/job that is going to be executed.  
        // Here we are going to print the following string value  
        System.out.format("in Sight This is being printed every 1 sec. %d%n ", counter);  
        counter = counter + 1; 
        for(int i=1; i<1000000; i++){
              counter2++;
        }
        
    }   
    
/**
 * 
 * @param numberOfImages
 * @param delayInterval 
 */   
    
    public void takePics(long numberOfImages, int delayInterval) {
        
       
        robot1.analysis.analyse sightAnalyser = new robot1.analysis.analyse();
        
        try {
        // Create a new RaspiStill object.
        RaspiStill camera = new RaspiStill();
        // Loop through the number of images to take.
        for (long i = 0; i < numberOfImages; ++i){
            // Capture the image.
            camera.TakePicture("image" + i + ".jpg",800,600);
            // Pause after each photo.
            sightAnalyser.findMovement();
            Thread.sleep(delayInterval);
        }
        } catch (Exception e){
            // Exit the application with the exception's hash code.
            System.exit(e.hashCode());
        }     
    }  

/**
 * 
 */
    
    public void stopPics(){
        
    }
}
