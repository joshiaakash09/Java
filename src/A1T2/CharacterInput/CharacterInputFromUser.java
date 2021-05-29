package A1T2.CharacterInput;

import java.util.Scanner;

public class CharacterInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only character to print: ");

        char c = sc.next().charAt(0);

        if (c == 'r' ||c == 'R' || c == 'a' || c == 'A' ||
                c == 'n' || c == 'N' || c == 'd' || c == 'D'
                || c == 'o' || c == 'O' || c == 'm' || c == 'M'){
            System.out.println("FOUND");

        } else{
            System.out.println("NOT FOUND");
        }
    }
}
