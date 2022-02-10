//https://github.com/imTempie
//Hello if you are reading this, have a good day!
package com.company;
import java.util.*;
import javax.swing.JOptionPane; // import JOptionPane for GUI
import java.lang.Math; // import math package
import java.lang.reflect.Array;

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

    public static void ifName(){
        while(true) {
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("What's your name?");
            String name4 = scanner6.nextLine();

            if (name4.equals("tempie")) {
                System.out.println("nice this works");
            } else {
                System.out.println("Something aint right...");
            }
        }
    }

    public static void randomNum(){
        Random random = new Random();

        int randomNum = random.nextInt(6)+1; // this will generate a random number, 1-6
        // double randomNum = random.nextDouble(); this will generate a number between 0 and 1
        // boolean randomNum = random.nextBoolean(); this will generate either true or false randomly
        System.out.println(randomNum);
    }

    public static void ifAge(){
        int age = 77;

        if(age >= 75){
            System.out.println("Ok Boomer!");
        }
        else if(age >= 18){
            System.out.println("You are of age.");
        }
        else if(age >= 13){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are too young.");
        }
    }

    public static void switchTest(){
        // switch = statement that allows a variable to be tested for equality against a list of values

        String day = "Saturday";

        switch (day){
            case "Sunday": System.out.println("It is Sunday!");
                break;
            case "Monday": System.out.println("It is Monday!");
                break;
            case "Tuesday": System.out.println("It is Tuesday!");
                break;
            case "Wednesday": System.out.println("It is Wednesday!");
                break;
            case "Thursday": System.out.println("It is Thursday!");
                break;
            case "Friday": System.out.println("It is Friday!");
                break;
            case "Saturday": System.out.println("It is Saturday!");
                break;
            default: System.out.println("That isn't a day of the week!");
        }

    }

    public static void logicalOperator(){
        // Logical operators are used to connect two or more expressions
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of a condition

        int temp = 25;

        if(temp > 30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp <=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){ // To use ! operator (NOT) if(!response.equals("q") && !response.equals("Q")){

            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still in the game");
        }
        scanner.close();
    }

    public static void whileLoop(){
        // while loop executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name:    ");
            name = scanner.nextLine();

        }
        System.out.println("Hello "+name);
        scanner.close();
    }

    public static void forLoop(){
        // for loop executes a block of code a limited amount of times

        for(int i = 0; i <=10; i++){    // This for loop will print 0-10
            System.out.println(i);
        }

        for(int i = 10; i <= 10 && i >=0;i--){      // This for loop will print 10-0
            System.out.println(i);
        }
    }

    public static void nestedLoops(){
        // nested loop = a loop inside of a loop
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }

    public static void array1(){

        // array = used to store multiple values in a single variable

        String[] cars = {"Camaro", "Corvette", "Porsche", "BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[0]);

    }

    public static void array2(){

        // array = used to store multiple values in a single variable

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Porsche";

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

    }

    public static void array2D1(){

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Porsche";
        cars[0][2] = "Mustang";

        cars[1][0] = "Fiesta";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "Corvette";

        for (int i = 0; i < cars.length; i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }
    }

    public static void array2D2(){
        String[][] cars = {
                {"Camaro","Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-15e"},
                {"Ferrari","Lambo","Tesla"}
        };

        for (int i = 0; i < cars.length; i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]+" ");
            }
        }
    }

    public static void stringMethods(){

        String name = "tempie";

        boolean  result = name.equalsIgnoreCase("Tempie"); //.equalsIgnoreCase will ignore caps.
        System.out.println("Does name equal Tempie: "+result);

        int resultLength = name.length();
        System.out.println("Name length: "+resultLength);

        char resultLetter = name.charAt(0);
        System.out.println("First letter "+resultLetter);

        int resultIndexOf = name.indexOf("m");
        resultIndexOf++;
        System.out.println("m is at: "+resultIndexOf);

        boolean resultEmpty = name.isEmpty();
        System.out.println("Is name empty: "+resultEmpty);

        String resultToUpperCase = name.toUpperCase();
        System.out.println("Name in uppercase: "+resultToUpperCase);

        String resultToLowercase = name.toLowerCase();
        System.out.println("Name in lowercase: "+resultToLowercase);

        String resultReplace = name.replace('t','T');
        System.out.println("Replaced 't' with 'T': tempie to: "+resultReplace);

        String name2 = "  tempie    ";
        String nameTrim = name2.trim();
        System.out.println("Trimmed version of '  tempie    ': "+nameTrim);
    }

    public static void wrapperClasses(){

        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        // Primitive    //wrapper
        //----------    //-------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Tempie";

        if(a==true){
            System.out.println("This is true");
        }

    }

    public static void arrayList(){

        // Arraylist = a resizeable array
        //             Elements can be added and removed after compilation phase
        //             store reference data types

        // If you want to store integers, you must use wrapper class 'Integer' not int.
        ArrayList<String> food = new ArrayList<String>();

        food.add("potato");
        food.add("burger");
        food.add("hotdog");


        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        food.set(0, "sushi");

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        food.remove(0);

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        food.clear(); //clears the array
    }

    public static void arrayList2D(){
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomato");
        produceList.add("pepper");
        produceList.add("beef");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("water");
        drinkList.add("milk");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList); //to show all lists
        System.out.println(groceryList.get(0)); //to show one list from the lists
        System.out.println(groceryList.get(0).get(0)); //to show one item from one list

    }

    public static void forEachLoop(){

        // for-each = traversing technique to iterate through all the elements in an array/collection
        //            less steps, more readable
        //            less flexible

        // String[] animals = {"cat", "dog", "rat", "tiger"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("tiger");

        for(String i : animals){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        // Put whatever function here
        // e.g. roundNum(); or minNum();

    }

}
