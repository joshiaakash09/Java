package Week_Two.JavaBasics;

import java.util.Scanner;

/*
Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then
print "Digit" and for other characters print "Special Character"

Logic:
For capital alphabets 65 – 90
For small alphabets 97 – 122
For digits 48 – 57
 */
public class CharVariable {

    //method to check char

    public static void charCheck(char input){
        //check for alphabet
        if ((input >= 65 && input <= 90) || (input >= 97 && input <=122)) {
            System.out.println("Alphabet");
        } else  if (input >= 48 && input <=57){
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        } }

    public static void main(String[] args) {
        char input = 'c';
        charCheck(input);
    }
}
