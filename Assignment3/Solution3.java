import java.util.Scanner;
public class Assignment3Task01 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int largest;
        
        if (num1>num2 && num1>num3) 
        {
        largest = num1;
        }
        else if (num2>num1 && num2>num3){
        largest = num2;
        }
        else {
        largest = num3;
        }
        System.out.println("Largest number = " + largest);
        
        sc.close();
}
}


import java.util.Scanner;
public class Assignment3Task02 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter numerical score: ");
        int num = sc.nextInt();
        
        String grade;
        
        if (num>=90 && num<=100){
        grade = "A";
        }
        else if (num>=85 && num<=89){
        grade = "A-";
        }
        else if (num>=70 && num<=84){
        grade = "B";
        }
        else if (num>=57 && num<=69){
        grade = "C";
        }
        else if (num>=50 && num<=56){
        grade = "D";
        }
        else if (num>=0 && num<50){
        grade = "F";
        }
        else { 
        grade = "Invalid";
        }
        System.out.println("Your grade is: " + grade);
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task03{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the first integer");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second integer");
        int num2 = sc.nextInt();
        
        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = sc.next();
        
        int result = 0;
        
        if (operator.equals("+")){
        result = num1 + num2;
        }
        else if (operator.equals("-")){
        result = num1 - num2;
        }
        else if (operator.equals("*")){
        result = num1 * num2;
        }
        else if(operator.equals("/")){
        result = num1 / num2;
        }
        else {
        System.out.println("Invalid operation output");
        }
      System.out.println("The operator " + operator + " gives " + result);
       
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task04 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter an integer number: ");
        int num1 = sc.nextInt();
        
        if (num1 % 5 == 0 && num1 % 7 == 0) {
        System.out.println("Divisible by Both");
        }
        else if (num1 % 5 != 0 && num1 % 7 == 0){
        System.out.println("Invalid: Divisible by 7 Only");
        }
        else if (num1 % 5 == 0 && num1 % 7 != 0){
        System.out.println("Invalid: Divisible by 5 Only");
        }
        else if(num1 % 5 != 0 && num1 % 7 != 0){
        System.out.println("No");
        }  
        sc.close(); 
    }
}


import java.util.Scanner;

public class Assignment3Task05 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter number of years: ");
        int num1 = sc.nextInt();
        
        if (num1 % 4 == 0){
        System.out.println(num1 + " is a leap year");
        }
        else if (num1 % 100 == 0 && num1 % 400 == 0){
        System.out.println(num1 + " is a leap year");
        }
        else {
        System.out.println(num1 + " is not a leap year");
        }
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task06 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter an integer number: ");
        int num1 = sc.nextInt();
        
        if (num1 < 0){
        System.out.println(num1 + " is negative");
        }
        else if (num1 == 0){
        System.out.println(num1 + " is zero");
        }
        else if (num1 > 0 && num1 % 2 == 0){
        System.out.println(num1 + " is positive and even");
        }
        else if(num1 > 0 && num1 % 2 != 0){
        System.out.println(num1 + " is positive and odd");
        }
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task07 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the value of X: ");
        int num1 = sc.nextInt();
        
        if (num1 < 0){
        System.out.println("Output: " + (2*num1));
        }
        else if (num1 >= 0 && num1 < 2){
        System.out.println("Output: " + (num1+1));
        }
        else if (num1 >= 2 && num1 < 5){
        System.out.println("Output: " + (num1*num1 - 1));
        }
        else if(num1 >= 5){
        System.out.println("Output: " + (3*num1*num1 + 2));
        }
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task08 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your student ID: ");
        int num1 = sc.nextInt();
        int div = num1 / 100000;
        int year = div / 10;
        int sessionnum = div % 10;
        String session;
        
        if (sessionnum == 1) {
            session = "Spring";
        }
        else if (sessionnum == 2) {
            session = "Fall";
        }
        else if (sessionnum == 3) {
            session = "Summer";
        }
        else {
        session = "Unknown";
        }
        System.out.println("Student Joined BRAC in " + session + " " + year);
        sc.close();
        
    }
}


import java.util.Scanner;

public class Assignment3Task09 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter total payment: ");
        int payment = sc.nextInt();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        int tax = 0;
        
        if (payment < 10000 && age > 17){
        tax = 0;
        }
        else if (age > 17 && payment <= 20000){
        tax = (payment * 5)/100;
        }
        else if (payment > 20000 && age > 17){
        tax = (payment * 10)/100;
        }
        else if (age < 18){
        tax = 0;
        }
        System.out.println("Your tax amounts in " + tax + " Tk");
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter the third number: ");
        float num3 = sc.nextFloat();
        
        float maximum, minimum;
        
        if (num1 > num2 && num1 > num3){
        maximum = num1;
        }
        else if (num2 > num1 && num2 > num3){
        maximum = num2;
        }
        else {
        maximum = num3;
        }
        
        if (num1 <= num2 && num1 <= num3){
        minimum = num1;
        }
        else if (num2 <= num1 && num2 <= num3){
        minimum = num2;
        }
        else {
        minimum = num3;
        }
        System.out.println("Maximum number is: " + maximum);
        System.out.println("Minimum number is: " + minimum);
        sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task11{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the value of first side: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the value of second side: ");
    int num2 = sc.nextInt();
    System.out.println("Enter the value of third side: ");
    int num3 = sc.nextInt();
    
    if (num1 == num2 && num1 == num3){
    System.out.println("This is a Equilateral triangle");
    }
    
    else if (num1 == num2 || num1 == num3 || num2 == num3){
    System.out.println("This is a Isosceles triangle");
    }
    
    
    else {
    System.out.println("This is a Scalene triangle");
    }
    sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task12{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the amount the customer need to pay(Taka): ");
    int num1 = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): ");
    int num2 = sc.nextInt();
    
    int hundred;
    int fifty;
    int twenty;
    int ten;
    int five;
    int two;
    int one;
    
    if (num2 > num1){
    int change = num2 - num1;
    System.out.println("The returned amount is " + change + " taka.");
    
    hundred = change / 100; 
    System.out.println("100 taka note: " + hundred);
    change = change - (hundred * 100);
    
    fifty = change / 50;
    System.out.println("50 taka note: " + fifty);
    change = change - (fifty * 50);
    
    twenty = change / 20;
    System.out.println("20 taka note: " + twenty);
    change = change - (twenty * 20);
    
    ten = change / 10;
    System.out.println("10 taka note: " + ten);
    change = change - (ten * 10);
    
    five = change / 5;
    System.out.println("5 taka coin: " + five);
    change = change - (five * 5);
    
    two = change / 2;
    System.out.println("2 taka coin: " + two);
    change = change - (two * 2);
    
    one = change / 1;
    System.out.println("1 taka coin: " + one);
    }
    
    else if (num1 > num2){
    int need = num1 - num2;    
    System.out.println("Please pay " + need + " taka more.");
    }
    
    else if (num1 == num2){ 
    int zero = 0;    
    System.out.println("The returned amount is " + zero + " taka.");
    }
    sc.close();
    }
}


import java.util.Scanner;

public class Assignment3Task13{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Input the 1st number: ");
    int num1 = sc.nextInt();
    System.out.println("Input the 2nd number: ");
    int num2 = sc.nextInt();
    System.out.println("Input the 3rd number: ");
    int num3 = sc.nextInt();
    
    if (num1 == num2 && num2 == num3){
    System.out.println("All numbers are equal");
    }
    else if (num1 == num2 || num2 == num3 || num1 == num3){
    System.out.println("Neither all are equal or different");
    }
    else{
    System.out.println("All numbers are different");
    }
    sc.close();
    }
}

