/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.movement;

/**
 *
 * @author christopher-rehm
 */
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christopher-rehm
 */

public class Movement implements Runnable {
    static int servos = 2;
   
/**
 * 
 */
    @Override
    public void run(){
        
    }
    
    public static void executeRoutine (int idNumber){
        
    }
    
/**
 * 
 */
    
    public static void moveNeck(int amount){
        
    }
    
/**
 * 
 * @param amount 
 */
    public static void moveEyes(int amount){
        
    }
 
/**
 * 
 * @param xCoord
 * @param YCoord
 * @param ZCoord
 * @param handpos 
 */
    public static void moveArm(int xCoord,int YCoord,int ZCoord, boolean handpos){
        
    }
 
/**
 * moves the body somehwere based on diection and speed and distance
 */
    public static void moveWheels(boolean direction, int speed, int distance) {
        
        
    }

/**
 *runs the warning light and test the connection
 */
    public static void testpi(){

        Timer timer = new Timer();
        //try {
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "MyLED", PinState.HIGH);

        // set shutdown state for this pin
        pin.setShutdownOptions(true, PinState.LOW);

        while (true){
            System.out.println("--> GPIO state should be: ON");

            try {
                Thread.sleep(333);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movement.class.getName()).log(Level.INFO, null, ex);
            }

            // turn off gpio pin #01
            pin.low();
            System.out.println("--> GPIO state should be: OFF");

            try {
                //timer.wait(5000);
                Thread.sleep(333);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movement.class.getName()).log(Level.INFO, null, ex);
            }
            // toggle the current state of gpio pin #01 (should turn on)
            pin.toggle();
            System.out.println("--> GPIO state should be: ON");

            //timer.wait(5000);
            //Thread.sleep(333);
            // toggle the current state of gpio pin #01  (should turn off)
            //pin.toggle();
            //System.out.println("--> GPIO state should be: OFF");

            //timer.wait(5000);
            //Thread.sleep(333);
            // turn on gpio pin #01 for 1 second and then off
            //Future<?> pulse = pin.pulse(1000, true); // set second argument to 'true' use a blocking call
        }
        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        // gpio.shutdown();
            
    }
    
    
     
}
     
