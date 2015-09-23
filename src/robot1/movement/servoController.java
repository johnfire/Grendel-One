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


public class servoController {
    private int idNumber = 0;
    private int position = 90;
    private int range = 180;
    
    
    public void setidNumber(int id){
        idNumber = id;
    }
/**
 * sets the left right up down status of a servo object
 * @param side 
 */   
    public void setPlusMinus(Boolean side ){
        
        
    }
   
/**
 * moves the servo by amount  
 */
    
    public void moveIt(int amount){
      robot1.memory newmemory = new robot1.memory();
      newmemory.settime();
      newmemory.setIDNumber(System.currentTimeMillis());
              
               //pi4j code operates servo
      newmemory.saveMemory();
    }
}
