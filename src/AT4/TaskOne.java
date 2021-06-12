package AT4;

public class TaskOne {
    public static void main(String[] args) {
       String sr = "This is a new world.";
       String [] Str = sr.split(" ");

       String shortest = Str[0];
       String longest = "";

       for (String s1 : Str){
           if (s1.length()<shortest.length()){
               shortest = s1;
           }else if (s1.length()>longest.length()){
               longest = s1;
           }
       }
        System.out.println("Shortest word = "+ shortest);
        System.out.println("Longest word is = "+longest );

    }
}
