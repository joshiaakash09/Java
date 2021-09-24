package Week_one.Assignment_One;
/*
Describe what happens if, in HelloWorld.java, you omit -

the ;        => compile error - ; missing
the first "  => compile error - cant resolve the symbol, coma or bracket expected
the second " => compile error - Illegal line end in string literal, coma or bracket expected
the first {  => compile error - 'class' or 'interface' expected
the second { => compile error - cant resolve the symbol println, coma or bracket expected
the first }  =>compile error - reached end of file while parsing
the second } =>compile error - reached end of file while parsing
 */
public class OmitThree {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
