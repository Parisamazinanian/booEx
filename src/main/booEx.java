package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class booEx {

    public static void main(String[] args) {

        booEx("Hey, did you think there is a TRAP?");
        booEx("There is a trap.");
        booEx("This goes traaa!!!");

    }

    public static void booEx(String inputText ){
        //String str=sourceText.toLowerCase();
        Pattern p= Pattern.compile("trap");
        //Create the matcher instance
        Matcher m= p.matcher(inputText.toLowerCase());
        boolean result=m.find();
        // Find the matches and count them
        if (result){
            System.out.println("BOO!!");
        }else {
            System.out.println("Relax, there is no trap.");
        }

    }
}
