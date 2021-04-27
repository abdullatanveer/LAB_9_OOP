/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomStringTokenizer;

/**
 *
 * @author abdul
 */
  import java.util.*;
public class CustomStringTokenizer {

    //method to override the  countTokens of StringTokenizer class
    public static int countTokens(StringTokenizer s){
        int count=s.countTokens();
        int  finalCount=0;
        String temp;
        boolean flag;
        double NValue;
        // for iterating through each token in  string
        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();
            //check if current token is a numeric value or not
            try{
                NValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException ex){
                flag=false;
            }
            //counting the token only if it is not a numeric value
            if(!flag) {
                finalCount++;
            } else {
            }
        }
        return finalCount;
    }
    
        public static void main(String[] args) {
            // token with numeric value
        StringTokenizer str1 = new StringTokenizer("ali has 2 cars");
        // token without numeric value
        StringTokenizer str2 = new StringTokenizer("ali has no car");
                // Counting the tokens of string 1 
        int count = countTokens(str1);
        System.out.println("total number of tokens in string 1: "+ count);
        // Counting the tokens of string 2
        count = countTokens(str2);
        System.out.println("total number of tokens in string 2: "+ count);
        }
}
    

