/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.senses;

/**
 * still in development :-)
 *
 * @author christopher-rehm
 */
import java.util.TimerTask;

public class Sight extends TimerTask {

    private int counter = 0;
    private int counter2 = 0;
    private long numberofimages = 0;
    private int picdelay = 0;

    @Override
    public void run() {
        // The logic of task/job that is going to be executed.  
        // Here we are going to print the following string value  
        System.out.format("in Sight This is being printed every 1 sec. %d%n ", counter);
        counter = counter + 1;
    }

    /**
     *
     * @param numberOfImages
     * @param delayInterval
     */
    public void takePics(long numberOfImages, int delayInterval) {
        numberofimages = numberOfImages;
        picdelay = delayInterval;

        robot1.analysis.analyse sightAnalyser = new robot1.analysis.analyse();

        try {
            // Create a new RaspiStill object.
            RaspiStill camera = new RaspiStill();
            // Loop through the number of images to take.
            for (long i = 0; i < numberofimages; ++i) {
                // Capture the image.
                camera.TakePicture(System.currentTimeMillis() + ".jpg", 800, 600);
                // Pause after each photo.
                sightAnalyser.findMovement();
                Thread.sleep(picdelay);
            }
        } catch (Exception e) {
            // Exit the application with the exception's hash code.
            System.exit(e.hashCode());
        }
    }

    /**
     *
     */
    public void changenumofpics(long x) {
        numberofimages = x;
    }
    
    public void changedelay(int x){
       picdelay = x;  
    }
    
    public long getnumberofremainingpics(){
        return numberofimages;
    }
    
    public int getpicdelay(){
        return picdelay;
    }

    public void stopPics() {
        numberofimages = 0;

    }
}
