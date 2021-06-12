package AT4;

import java.util.Scanner;

public class TaskOneFindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, word="", longword="", smallword="";
        int len, longlen=0, wordlen=0, smallen;
        Character ch;

        System.out.println("Enter a sentence");

        input=sc.nextLine().trim();
        input=input+" ";

        len = input.length();
        smallen = len;

        for (int i=0; i<len; i++){
            ch = input.charAt(i);
            if (ch == ' '){
                wordlen = word.length();
                if (wordlen>longlen){
                    longlen = wordlen;
                    longword = word;
                }
                if (wordlen<smallen){
                    smallen = wordlen;
                    smallword = word;
                }
                word="";
            } else{
                word=word+ch;
            }
        }
        System.out.println("The longest word is :"+longword);
        System.out.println("The length of the word is :"+longlen);
        System.out.println("The shortest word is :"+smallword);
        System.out.println("The length of the word is :"+smallen);
    }
}
