import java.util.Scanner;
// Final version commit
public class problem1 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total distance travelled:");
        int distance = sc.nextInt();
        System.out.println("Enter amount of fuel spent:");
        double fuel = sc.nextDouble();
        double consumption = distance / fuel;
        System.out.printf("%.3f km/l%n", consumption);
    }
}

import java.util.Scanner;
public class problem2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code number:");
        int code = sc.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        String item = "";
        double price = 0;
        if(code == 1){
            item = "Hot Dog";
            price = 4.00;
        }
        else if(code == 2){
            item  = "X-Salad";
            price = 4.50;
        }
        else if(code == 3){
            item = "X-Bacon";
            price = 5.00;
        }
        else if(code == 4){
            item = "Toast";
            price = 2.00;
        }
        else if(code == 5){
            item ="Soda";
            price = 1.50;
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println("Item: "+ item);
        System.out.println("Quantity: "+ quantity);
        System.out.printf("Total: $ %.2f" , price * quantity );
    }
}

import java.util.Scanner;
public class problem3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first abscissa:");
        double aa = sc.nextDouble();
        System.out.println("Enter the first ordinate");
        double bb = sc.nextDouble();
        System.out.println("Enter the second abscissa:");
        double xx = sc.nextDouble();
        System.out.println("Enter the second ordinate:");
        double yy = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(xx-aa,2)+Math.pow(yy-bb,2));
        double slope = (yy-bb)/(xx-aa);
        System.out.printf("Distance :%.4f %n", distance);
        System.out.printf("Slope :%.4f %n", slope);
        if (slope > 0){
            System.out.println("The slope is Positive");
        }
        else if(slope == 0){
            System.out.println("The slope is Zero.");
        }
        else {
            System.out.println("The slope is Negative.");
        }
    }
}

import java.util.Scanner;
public class problem4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = sc.nextDouble();
        System.out.println("Enter B:");
        double b = sc.nextDouble();
        System.out.println("Enter C:");
        double c = sc.nextDouble();

        double discri = Math.pow(b,2)-(4*a*c);
        double root = Math.sqrt(discri);
        double div = 2*a;
        double ans1 = (-b + root) / div;
        double ans2 = (-b - root) / div;
        if (discri < 0 || div == 0 ){
            System.out.println("Impossible to calculate.");

        } 
        else {
            System.out.printf("Root#1 = %.5f %n" , ans1);
            System.out.printf("Root#2 = %.5f %n" , ans2);
        }
    }
}

import java.util.Scanner;
public class problem5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value :");
        int first = sc.nextInt();
        System.out.println("enter change :");
        int change = sc.nextInt();
        System.out.println("enter the last value :");
        int last = sc.nextInt();

        for (int i = first; i<=last; i+=change){
            if (i+change>last){
                System.out.println(i);
            }
            else {
                System.out.print(i+ ", ");
            }
        }
    }
}

import java.util.Scanner;
public class problem6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer n:");

        int n = sc.nextInt();
        double sum = 0.0;
        double y = 1.0;
        for (int i = 1; i<=n ; i++){
            if (i%4==0){
                y = 1.0/-i;
            }
            else {
                y = 1.0/i;
            }
            sum += y;
        }
        System.out.printf("%.4f%n",sum);
    }
}

import java.util.Scanner;
public class problem7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer N:");

        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i<=n ; i++){
            if (i%2==0){
                sum-= 2*i+1;

            }
            else {
                sum += 2*i+1;
            }
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;
public class problem8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer N:");

        int n = sc.nextInt();
        System.out.println("Collatz sequence: ");
        System.out.print(n+", ");
        while (n !=1 ){
        
            if (n%2==0){
                n = n/2;
                
            }
            else if(n%2 != 0){
                n = 3*n+1;
                
            }
            
            if (n==1){
                System.out.println(n);
            }  
            else {
                System.out.print(n+", ");
            }
        }
    }
}

import java.util.Scanner;
public class problem9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int count=0;
        while (num >  0){
            num = num/10;
            count++;
        }
        System.out.println(count);
        while (count != 0 ){
            int div = (int)Math.pow(10,count-1);
            num = temp/div;
            sum +=  num;
            temp = temp % div;
            count--;
        }
        System.out.println("The sum is  "+ sum);
        

        if (sum % 2 == 0){
            System.out.println("The sum is even. ");
        }
        else if (sum %2 != 0 ){
            System.out.println("The sum is odd");
        }
    }
}

import java.util.Scanner;
public class problem10{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary number.");
    int binary = sc.nextInt();
    
    int decimal = 0;
    int power = 0;
    while(binary!= 0){
      int lastDigit = (int)(binary%10);
      decimal = decimal + lastDigit * (int)Math.pow(2,power);
      power++;
      binary = binary /10;
    }
    System.out.println(decimal);
  }
}

import java.util.Scanner;
public class problem11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many inputs do you want to provide? ");
    int input = sc.nextInt();
    System.out.println("Enter the numbers: ");
    int even =0;
    int sum = 0;
    int average = 0;
    int max = 0;
    int min = 0;
    for ( int i = 1; i<= input ; i++){
      int numbers = sc.nextInt();
      
      if (numbers %2 == 0 && numbers > 0){
        even++;
        if (even == 1){
         max = numbers;
         min = numbers;
        }
        else{
          if (numbers > max){
            max = numbers;
          }
          if (numbers< min){
            min = numbers;
          }
        }
        sum += numbers;
        average = sum / even;
      }
      if (even ==0){
        average = 0;
      }
    }
    System.out.println("Max: " +max);
    System.out.println("Min: "+min);
    System.out.println(average);
  }
}

import java.util.Scanner;
public class problem12{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers: ");
    int even =0;
    int sum = 0;
    int average = 0;
    int max = 0;
    int min = 0;
    while (true){
      
      int numbers = sc.nextInt();
      if (numbers == 0){
        break;
      }
      else {
        if (numbers %2 == 0 && numbers > 0){
        even++;
        if (even == 1){
         max = numbers;
         min = numbers;
        }
        else{
          if (numbers > max){
            max = numbers;
          }
          if (numbers< min){
            min = numbers;
          }
        }
        sum += numbers;
        average = sum / even;
        
        }
      
        if (even ==0){
          average = 0;
        }
      }
    }
    System.out.println("Max: " +max);
    System.out.println("Min: "+min);
    System.out.println(average);
  }
}