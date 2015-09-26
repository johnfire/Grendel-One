/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot1.analysis;

/**
 *
 * @author christopher-rehm
 */
public class analyseMaster implements Runnable  {
    int[] myprocesses = new int[1000];
    
    @Override
    public void run(){
        while(true){
            try{
                this.waitForWork();
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Thread 3 analyser caught time out ");  
      
            }
        }   
    } 
    
/**
 * 
 */
    
    public void addJob(){
        System.out.println("--> THREAD 3 add job to be analysed ");
        
    }
    
    
    public void waitForWork(){
        System.out.println("--> THREAD 3 The analyser is waiting for work");
    }
}
