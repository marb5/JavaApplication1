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
    }
    
}
