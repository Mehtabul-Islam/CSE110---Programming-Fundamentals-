public class Assignment04Task01a {
    public static void main (String [] args){
        
        int i = 24;
        while (i >=0 ) {
            System.out.print(i + ", ");
            i -= 6;
        }
        System.out.println(i);
    }
}

public class Assignment04Task01b {
    public static void main (String [] args){
        int i = -10;
        while (i <= 15) {
            System.out.print(i + ", ");
            i +=5;
        }
        System.out.println(i);
    }
}

import java.util.Scanner;

public class Assignment04Task02 {
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter the value of N: ");
    int N = sc.nextInt ();
    int sum = 0;
    
    for (int i = 1; i <= N; i += 1){
    System.out.println("Enter the values: ");
    int input = sc.nextInt();
    sum = sum + input;
    }
    double average = sum / N;
    System.out.println("The sum of " + N + " no: " + sum);
    System.out.println("The Average is: " + average);
    }
}

import java.util.Scanner;

public class Assignment04Task03 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            
            System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        if (num < 0){
        break;
        }
        else {
            System.out.println(num + " ^ " + num + " = " + num*num);
        }
        }
        
    }
}

import java.util.Scanner;

public class Assignment04Task04 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Divisors of " + num + " : ");
        while (i <= num){
            if (num % i == 0){
                System.out.println(i);
            }
            i += 1;
        } 
    }
}

import java.util.Scanner;

public class Assignment04Task05 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter an interger: ");
        int num = sc.nextInt ();
        
        int positive = 0;
        int negative = 0;
        int i = 1;
        
        while (i <= num) {
            System.out.println("Enter number " + i + " : ");
            int number = sc.nextInt();
            
            if (number >= 0)
            {
                positive ++;
            }
            else {
                negative ++;
            }
            i ++;
        }
        System.out.println(positive + " Non-negative Numbers");
        System.out.println(negative + " Negative Numbers");
    }
}

import java.util.Scanner;

public class Assignment04Task06 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input number of terms: ");
        int num = sc.nextInt();
        
        System.out.println("The odd numbers are: ");
        
        int i = 0;
        int number = 1;
        int sum = 0;
        
        
        while (i < num) {
            System.out.println(number);
            sum = sum + number;
            number = number + 2;
        i += 2;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + num + " terms is: " + sum); 
    }
}

import java.util.Scanner;

public class Assignment04Task07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            System.out.println("Enter Number: ");
            int i = sc.nextInt();
            num += 1;
            sum = sum + i;
            System.out.println("Sum = " + sum);
        }
    }
}

import java.util.Scanner;

public class Assignment04Task08 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a positive integer number: ");
        int i = sc.nextInt();        
        int num = 0;
        while (num <= i) {
            if (num % 5 == 0 && num % 3 != 0){
                System.out.println(num);
            }
            num++;
        }
    }
}

import java.util.Scanner;

public class Assignment04Task09 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter an interger number: ");
        int i = sc.nextInt();
        
        int count = 0;
        
        if (i == 0) {
            count = 1;
        }
        else {
            while (i > 0) {
                i = i / 10;
                count += 1;
            }
        }
        System.out.println("Total digits = " + count);
    }
}

import java.util.Scanner;
public class Assignment04Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an integer number: ");
        int i = sc.nextInt();
        int number = i;
        int numberOfDigits = 0;
        int digit = 0;
        while (number > 0){       
            numberOfDigits ++;                 
            number = number / 10;    
        }
        System.out.println(numberOfDigits);
        number = i;
        
        System.out.print("The number of digits of " + number + " are: "); 
        while (number > 0){
            digit = number / (int)Math.pow(10, numberOfDigits - 1);
            System.out.print(digit + ", ");
            number = number % (int)Math.pow(10, numberOfDigits - 1);
            numberOfDigits --;
        }
    }
}


import java.util.Scanner;
public class Assignment04Task11 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter an interger number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        
        while (i < num) {
            if (num % i == 0) {
                sum = sum + i;
            }    
            i++;
        }
        if (num == sum){
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }
        i = 1;
        int count = 0;
        
        while (i <= num){
            if (num % i == 0){
                count ++; 
            }
            i++;
        }
        if (count == 2) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}