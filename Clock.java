/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockrunner;

/**
 *
 * @author abdul
 */
public class Clock {
    //declaring hours, minutes and seconds variables
    String hours, minutes, seconds;
    //constructor to initialize the variables
    public Clock(String hours, String minutes, String seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    // method to display the time in 24 hour Format
    public void display(){
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }
}

    

