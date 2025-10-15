import java.util.Scanner;
// Final version commit
public class Assignment05Task01 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        int num1 = sc.nextInt();
        
        int prime = 1;
        
        for (int i = 2; prime <= num1; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count ++;
                }
            }
            if (count == 2)
            {
                System.out.println(i);
                prime ++;
            }
        }
        
    }
}


import java.util.Scanner;
public class Assignment05Task02 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
         System.out.print("The value of N: ");
        int num1 = sc.nextInt();

        
        if (num1 <= 0) {
            System.out.println("Invalid");
            return;
        }

        int y = 0;

        
        for (int i = 1; i <= num1; i++) {
            int sum = (i * (i + 1)) / 2; 
            y -= sum;
        }

        
        System.out.println("The value of y: " + y);
        
    }
}


import java.util.Scanner;
public class Assignment05Task03 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            
            
            
            System.out.println("Enter an even integer number: ");
            int num1 = sc.nextInt();
            
            if (num1 % 2 != 0)
            {
                break;
            }
            int count = 0;
            for (int i = 1; i <= num1; i++)
            {
                if (num1 % i == 0)
                {
                    count ++;
                }
            }
            System.out.println(num1 + " has " + count + " divisors ");
        }
        
    }
}


import java.util.Scanner;
public class Assignment05Task04 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Number of test cases: ");
        int num1 = sc.nextInt();
        
        for (int i = 1; i <= num1; i++)
        {
        System.out.println("Input: ");
        int num2 = sc.nextInt();
        
        System.out.println("Input: ");
        int num3 = sc.nextInt();
        
        if (num2 % 2 == 0)
        {
        num2++;
        }
        
        int sum = 0;
        int countnum = 0;
        
        for (int j = 1; countnum < num3; j++)
        {
        sum = sum + num2;
        num2 = num2 + 2;
        countnum ++;
        }
        System.out.println(sum);
        }
        
    }
}


import java.util.Scanner;
public class Assignment05Task05 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Column Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Row Number: ");
        int num2 = sc.nextInt();
        
        for (int j = 1; j <= num2; j++)
        {
            for (int i = 1; i <= num1; i++)
            {
                System.out.print(i + " ");
                
            }
            System.out.println("");
        }    
    }
}


import java.util.Scanner;
public class Assignment05Task06 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++)
        {
            for (int j = i; j <= num; j++)
            {
            System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
            System.out.print(j);
            }
        System.out.println("");
        }
        
    }
}


import java.util.Scanner;
public class Assignment05Task07 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++)
        {
            for (int j = i; j <= num; j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++)
            {
            System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++)
            {
            System.out.print(j + " ");
            }
        System.out.println("");
        }                  
    }
}


import java.util.Scanner;
public class Assignment05Task08 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Starting Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ending Number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Armstrong numbers: ");
        
        for (int i = num1; i <= num2; i++)
        {
            
            int temp = i;
            int sum = 0;
            int x = 0;
            while (temp > 0)
            {
                x = temp % 10;
                temp = temp / 10;
                sum = sum + x*x*x;
            }
            if (i == sum){
                
                System.out.println(i);
            }
        }
        sc.close();
    }
}
