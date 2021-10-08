package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeVowel {
    public static void main(String[] args) {
        vowelRemove("I have never seen a thin person drinking Diet Coke.");

    }
    public static void vowelRemove(String sourceText ){
        String str=sourceText.toLowerCase();
        //Create a pattern
        //String str=sourceText.toLowerCase();
        Pattern p= Pattern.compile("[aeiou]");
        //Create the matcher instance
        Matcher m= p.matcher(str);
        // Find the matches and count them
        if(m.find()){
            System.out.println(str.replaceAll("[aeiou]",""));
        }else {
            System.out.println("Everything is fine, No vowels");
        }

        }
}
