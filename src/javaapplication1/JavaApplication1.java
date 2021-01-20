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
        
        int[] tab = new int[5];
        
       //tab = new int[5];
        
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;        
        
        System.out.println(tab[0]);
        
        int[] tab2 = {10, 20, 30, 40, 50, 60};
        
        System.out.println(tab2[tab2.length-1]);
        
        int[][] tab3 = new int[2][2];
        
        tab3[0][0] = 1;
        tab3[0][1] = 2;
        tab3[1][0] = 3;
        tab3[1][1] = 4;
        
        System.out.println(tab3[1][0]);
        
        System.out.println("tab elements:");
        int i = 0;
        while(i < tab.length)
        {           
            System.out.println(tab[i]);

            i++;
        } 
        i = 0;
        System.out.println("tab2 elements:");
        do
        {
            System.out.println(tab2[i]);
            i++; 
        } while(i < tab2.length);
        System.out.println("tab3 elements:");
        for(int j = 0; j < tab3.length; j++)
        {   
            for(int k = 0; k < tab3[j].length; k++)
            { 
                System.out.print(j + " ");
                System.out.print(k + " ");
                System.out.println(tab3[j][k]);           
            }
        }
        System.out.println("tab elements (enhanced for loop):");
        for(int el: tab)
        {
            System.out.println(el);
        }
        System.out.println("odd numbers from 0 to 10:");
        for (int j = 0; j < 10; j++)
        {
            if (j % 2 == 0)
                continue; 
            System.out.println(j);
        }
        System.out.println("break if j == 7");
        for (int j = 0; j < 10; j++)
        {
            System.out.println(j);
            if (j == 7)
                break; 
        }
    }
    
}
