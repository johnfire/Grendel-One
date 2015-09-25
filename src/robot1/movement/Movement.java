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
//private static int servos = 2;

public class Movement implements Runnable {
    
    int servos = 2;
    servoController[] servo = new servoController[servos];
    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();
    // provision gpio pin #01 as an output pin and turn on
    final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "MyLED", PinState.HIGH);

        
    
   
/**
 * 
 */
    
    @Override
    public void run(){
      while(true){
          try {
              this.setupServos();
              System.out.println("--> THREAD 2 i have just initialized the servos");
              this.testpi();
          } catch (InterruptedException ex) {
              Logger.getLogger(Movement.class.getName()).log(Level.INFO, null, ex);
          }
      }
    }
    
    public boolean setupServos(){
        for (int i = 0; i < servos; i++){
             servo[i] = new servoController();   
             servo[i].setidNumber(i);
        }
        return true;
    }
    
    
    public void executeRoutine (int idNumber){
        
    }
    
/**
 * 
 */
    
    public void moveNeck(int amount){
        
        servo[1].moveIt(amount);
        
    }
    
/**
 * 
 * @param amount 
 */
    
    public void moveEyes(int amount){
        
     servo[0].moveIt(amount);
        
    }
 
/**
 * 
 * @param xCoord
 * @param YCoord
 * @param ZCoord
 * @param handpos 
 */
    public void moveArm(int xCoord,int YCoord,int ZCoord, boolean handpos){
        
    }
 
/**
 * moves the body somehwere based on diection and speed and distance
 */
    public void moveWheels(boolean direction, int speed, int distance) {
            
    }
    
    public void initialisepi() {
        

        
    }

/**
 *runs the warning light and test the connection
 */
    
    public void testpi() throws InterruptedException{
       
        System.out.println("--> THREAD 2 entering loop");
        System.out.println("<--Pi4J--> THREAD 2 GPIO Control Example ... started.");
        
        // set shutdown state for this pin
        pin.setShutdownOptions(true, PinState.LOW);
        
        System.out.println("--> THREAD 2 GPIO state should be: ON");
        Thread.sleep(333);
        
        // turn off gpio pin #01
        pin.low();
        System.out.println("--> THREAD 2 GPIO state should be: OFF");
        Thread.sleep(333);
        
        // toggle the current state of gpio pin #01 (should turn on)
        pin.toggle();
        System.out.println("--> THREAD 2 GPIO state should be: ON");

        //timer.wait(5000);
        Thread.sleep(333);
        // toggle the current state of gpio pin #01  (should turn off)
        pin.toggle();
        System.out.println("--> THREAD 2 GPIO state should be: OFF");

        //timer.wait(5000);
        Thread.sleep(333);
        System.out.println("--> THREAD 2 leaving movement operation");
        // turn on gpio pin #01 for 1 second and then off
        //Future<?> pulse = pin.pulse(1000, true); // set second argument to 'true' use a blocking call
        
        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        gpio.shutdown();        
    }     
}
     
