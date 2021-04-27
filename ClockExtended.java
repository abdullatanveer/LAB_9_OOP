/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockrunner;


public class ClockExtended extends Clock {

    public ClockExtended(String hours, String minutes, String seconds) {
            
        super(hours, minutes, seconds);
    }
       //override method to display 24 hours format
    @Override
    public void display(){
        
        System.out.println("24 Hour Format:");
        super.display();
        System.out.println("12 Hour Format:");
        //conversion of  24 hour formate into 12 hour formate
        int hour1 = (int)hours.charAt(0) - '0';
        int hour2 = (int)hours.charAt(1)- '0';
        int totalhour = hour1 * 10 + hour2;
        
        String x;
        if(totalhour < 12)
            x="AM";
        else
            x="PM";
        totalhour %= 12;
        if (totalhour == 0) {
            System.out.print("12");
            System.out.print(":"+minutes+":"+seconds);
        }
        else{
            System.out.print(totalhour);
            System.out.print(":"+minutes+":"+seconds);
        }
        System.out.println(" "+x);
    }
    }


    

