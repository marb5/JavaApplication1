package javaapplication1;

/**
 *
 * @author Marcin
 */
public class JavaApplication1 {
    
    public static void main(String[] args) {
        String firstName = "Marcin";
        int a = 2;
        int b = 7;
        int c;
        float f = 1.23f;
        double d = 45.67890;
        //byte, short, long
        //char
        final double NUMBER_PI = 3.14; //const final unchangeable variable

        c = a + b;

        System.out.println("Cześć " + firstName + "!");
        System.out.println("Liczba: " + c);
        System.out.println("Liczba pi: " + NUMBER_PI);

        //casting
        System.out.println(b / a);
        System.out.println(b / (double)a);

        int result1 = b / (int)f;
        double result2 = b / f;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(1.0 / 5);

        /*
        0 - false 1 - true
        ~ - not
        & - and
        | - or
        ^ - XOR
        x << 1 - 1 bit left shift
        x >> 2 - 2 bit right shift
        */

        if (a > b)
            System.out.println("a > b");
        else if (a < b)
        {
            System.out.println("a < b");  
        }
        else
        {
            System.out.println("a == b");
        }
       
        int num = 4; 
        switch (num)
        {
            case 1:
                System.out.println("Pierwszy przypadek");
                break;
            case 2:
                System.out.println("Drugi przypadek");
                break;
            default:
                System.out.println("Inny przypadek");
        }
        
        String conditionalOperator = num == 4 ? "tak" : "nie";
        System.out.println(conditionalOperator);
    }
    
}
