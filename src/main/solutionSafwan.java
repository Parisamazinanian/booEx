package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solutionSafwan {
    public static void main(String[] args) {
        String str="There is no trap :)";
        System.out.println(findTheTrap(str));

    }
    public static String findTheTrap(String sourceText){

   /*//Solution 1
        // Create the pattern of regex:
        //find the word "trap" case insensitive
        Pattern p= Pattern.compile("trap");
        //Create the matcher instance
        Matcher m= p.matcher(sourceText.toLowerCase());

        //return m.find() ? "BOO!!!": "Relax, there is no trap.";
        *//*if (m.find()){
            System.out.println("BOO!!");
            return "BOO";
        }else {
            System.out.println("Relax, there is no trap.");
            return "Relax, there is no trap";*/

        /*//Solution 2
        String str=sourceText.toLowerCase();
        if(str.indexOf("trap") !=-1){
            System.out.println("BOO !!!");
            return "BOO!!";
        }else{
            System.out.println("Relax, there is no trap");
            return "Relax, there is no trap";*/

        //Solution 3: using contains

            if(sourceText.toLowerCase().contains("trap")){
                System.out.println("BOO!!");
                return "BOO";
            }else{
                System.out.println("Relax, there is no trap !!");
                return "Relax, there is no trap !!";
            }
    }
}
