
package pkgif.pkgelse.statements;

// Import Scanner Here

import java.util.Scanner;




/**
 *
 * Name: Mariano Aguirre
 * Period: 2
 * Project Name: if else statements
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
    private static Scanner kb = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        
       question1();
       question2();
       question3();
       question4();
       question5();
       question6();
       question7();
       
               
        
    }
    
    
    public static void question1(){
        System.out.println("Enter a number: ");
        int number = kb.nextInt();
        if(number > 70)
            System.out.println("PASSING");
        else
            System.out.println("NOT PASSING");
    }
    
    public static void question2(){
        System.out.println("Enter a number: ");
        int number = kb.nextInt();
        if(number >= 50)
            System.out.println("GO");
        else
            System.out.println("STOP");
    }
    
    public static void question3(){
        System.out.println("Enter a number: ");
        int number = kb.nextInt();
        if(number%2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
    
    public static void question4(){
        System.out.println("Enter an int: ");
        int number = kb.nextInt();
        if(number%5 == 0)
            System.out.println("MULTIPLE OF 5");
        else
            System.out.println("NOT A MULTIPLE OF 5");
    }
    
    public static void question5(){
        System.out.println("Enter a number: ");
        int number = kb.nextInt();
        if(number < 10)
            System.out.println("ONE DIGIT");
        else if(number >= 100)
            System.out.println("THREE DIGITS");
        else
            System.out.println("TWO DIGITS");
    }
    
    public static void question6(){
        System.out.println("Enter a jersey number: ");
        int number = kb.nextInt();
        if(number == 12 || number == 71 || number == 80)
            System.out.println("That number is retired from the Seattle Seahawks!");
        else
            System.out.println("That number is good");
    }
    
    public static void question7(){
        System.out.println("Enter a state: ");
        String state = kb.nextLine();
        if(state.equals("Washington") || state.equals("Oregon") || state.equals("Idaho"))
            System.out.println("This state is in the PNW");
        else
            System.out.println("You should move to the PNW, its great here");
    }
    
    public static void question8(){
        
    }
    
    public static void question9(){
        
    }
    
    public static void question10(){
        
    }
    
}
