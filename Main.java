//https://github.com/imTempie
//Hello if you are reading this, have a good day!

package com.company;
import java.util.Scanner; // import scanner package
import javax.swing.JOptionPane; // import JOptionPane for GUI
import java.lang.Math; // import math package

public class Main {

    public static void pr(String x){
        System.out.println(x);
    }


    public static void prLn(String x){
        System.out.println("\n"+x);
    }

    public static void dataTypes(){
        //
        // DATA TYPES
        //

        int x = 18;
        long y = 1108231230127361239L; // Must have 'L' at the end
        byte z = 127; // Max 127 for byte data type
        float w = 3.141f; // Float must have 'f' at the end. Float is less precise than double
        double r = 3.1415; // Double doesn't need 'f'. Much more precise (more digits)
        boolean k = false;
        char symbol = '@';
        String name = "Tempie";

        System.out.println("Int: "+x);
        System.out.println("Long Number: "+y);
        System.out.println("Byte: "+z);
        System.out.println("Float: "+w);
        System.out.println("Double: "+r);
        System.out.println("Boolean: "+k);
        System.out.println("Symbol: "+symbol);
        System.out.println("Hello "+name);
        System.out.println();

    }

    public static void swapVar(){
        //
        //SWAP TWO VARIABLES
        //

        String temp;
        String one = "Water";
        String two = "Milk";

        temp = one;
        one = two;
        two = temp;

        System.out.println("One: "+one);
        System.out.println("Two: "+two);
    }

    public static void userInput(){
        //
        // TAKE USER INPUT
        //

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name2 = scanner.nextLine(); // Name2 will equal the next line inputted by the user
        System.out.println("How old are you?");
        byte age = scanner.nextByte(); // Could also use 'int'
        scanner.nextLine(); // Clear Scanner
        System.out.println("What's your favourite food?");
        String food = scanner.nextLine(); // food will equal the next link inputted by the user

        System.out.println("Hello "+name2+", You are "+age+" years old.");
        System.out.println("You like "+food);

        scanner.close();
    }

    public static void expressions(){
        //
        // EXPRESSIONS
        //

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / % (% = modulus, gives remainder, e.g 10 % 6 = 4)

        int friends = 10;

        // friends = friends + 3; (gives 13)
        // friends = friends - 3; (gives 7)
        // friends = friends * 2; (gives 20)
        // friends = friends / 2; (gives 5)
        // friends = friends % 6; (gives 4)
        // friends ++; (gives 11)
        // friends --; (gives 9)

        // If we want to divide 10 by 3 to get 3.333 instead of 3 (because of int)
        // we do
        // double friends - 10;
        // friends = (double) friends / 3;

        System.out.println(friends);
    }

    public static void gui(){

        String name3 = JOptionPane.showInputDialog("Enter your name");
        int age3 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double height3 = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm)"));

        JOptionPane.showMessageDialog(null, "Hello "+name3+", you are "+age3+" years old and you are "+height3+"cm tall.");

    }

    public static void hypotenuse(){
        System.out.println("|~~~ Hypotenuse Calculator (only works on right-angled triangles ~~~|");

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("What is the length of side A");
        double sideA = scanner2.nextDouble();

        scanner2.nextLine();

        System.out.println("What is the length of side B");
        double sideB = scanner2.nextDouble();

        System.out.println("The length of the hypotenuse is: "+Math.sqrt((sideA*sideA)+(sideB*sideB)));
        
        scanner2.close();
    }

    public static void maxNum(){
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("What is number 1?");
        double x1 = scanner3.nextDouble();
        scanner3.nextLine();

        System.out.println("What is number 2?");
        double x2 = scanner3.nextDouble();

        double x3 = Math.max(x1, x2);

        System.out.println("The larger number is: "+x3);
        
        scanner3.close();

    }

    public static void minNum(){
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("What is number 1?");
        double x1 = scanner4.nextDouble();
        scanner4.nextLine();

        System.out.println("What is number 2?");
        double x2 = scanner4.nextDouble();

        double x3 = Math.min(x1, x2);

        System.out.println("The smaller number is: "+x3);
        scanner4.close();
    }

    public static void roundNum(){
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("What number do you want to round?");

        double roundNum = scanner5.nextDouble();
        double roundNumTemp = roundNum;
        double roundNumTemp2 = roundNumTemp;
        double roundedNumUp = Math.ceil(roundNum);
        double roundedNumDown = Math.floor(roundNumTemp2);
        System.out.println(roundNumTemp+" rounded up = "+roundedNumUp);
        System.out.println(roundNumTemp2+" rounded down = "+roundedNumDown);
        scanner5.close();
    }

    public static void main(String[] args) {

        // Put whatever function here

    }
}
