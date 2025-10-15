import java.util.Scanner;
public class Assignment07Task01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        //(a)
        
        System.out.println("N = ");
        int N = sc.nextInt();
        int [] array = new int[N];
        
        for (int a = 0; a < array.length; a++)
        {
            System.out.println("Enter a number: ");
            array [a] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        
        for (int a = 0; a < array.length; a++)
        {
            System.out.println(a + ": " + array[a]);
        }
        
        //(b)
        
        int [] array1 = new int [N+1];
        System.out.println("Enter another number: ");
        int num = sc.nextInt();
        int last = array1.length - 1;
        array1[last] = num;
        
        for(int a = 0; a < array.length; a++)
        {
            array1[a] = array[a];
        }
        System.out.println("After resizing the array: ");
        
        for (int a = 0; a < array1.length; a++)
        {
            System.out.print(array1[a] + " ");
        }
    }
}


import java.util.Scanner;
public class Assignment07Task02 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter array length: ");
        int num = sc.nextInt();
        int [] arr = new int [num];
        
        for(int a = 0; a < arr.length; a++){
            System.out.print("Enter a number: ");
            arr[a] = sc.nextInt();
        }
        System.out.println("Before removing duplicates: ");
        
        for (int a = 0; a < arr.length; a++)
        {
        System.out.print(arr[a] + " ");
        }
        
        for (int a = 0; a < arr.length; a++) 
        {
            for (int b = a + 1; b < arr.length; b++)
            {
                if (arr[a] == arr[b] && arr[a] != 0) 
                {
                    arr[b] = 0;
                }
            }
        }
        System.out.println();
        System.out.println("After replacing duplicates with 0: ");
        
        for(int a = 0; a < arr.length; a++)
        {
        System.out.print(arr[a] + " ");
        }
    }
}


import java.util.Scanner;
public class Assignment07Task03 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter array length: ");
        int num = sc.nextInt();
        int [] arr = new int [num];
        int [] arr1 = new int [num];
        
        for(int a = 0; a < arr.length; a++){
            System.out.print("Enter a number: ");
            arr[a] = sc.nextInt();
        }
        
        //a
        
        System.out.println("Reversed using a new array: ");
        
        for (int a = 0; a < arr.length; a++)
        {
            arr1[a] = arr [arr.length - 1 - a];
            System.out.print(arr1[a] + " ");
        }
        
        //b
        
        System.out.println();
        System.out.println("Reversed the original array: ");
        int a = 0;
        int b = arr.length - 1;
        
        while (a < b) {
            
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        
        for(int c = 0; c < arr.length; c++)
        {
            System.out.print(arr[c] + " " );
        }
        System.out.println();
    }
}


import java.util.Scanner;
public class Assignment07Task04 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array length: ");
        int num = sc.nextInt();
        int [] arr = new int [num];
        
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print("Enter a number: ");
            arr[a] = sc.nextInt();
        }
        System.out.println("Original array: ");
        
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
        System.out.println("After modifying: ");
        
        for (int a = 0; a < arr.length; a++)
        {
            if(arr[a] > 0)
            {
                arr[a] = 1;
            }
            else 
            {
                arr[a] = 0;
            }
            System.out.print(arr[a] + " ");
        }
    }
}


import java.util.Scanner;
public class Assignment07Task05 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int [] arr = new int [N];
        
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print("Enter a number: ");
            arr[a] = sc.nextInt();
        }
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int index = -1;     
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == num) {
                index = a; 
                break; 
            }
        }

        
        if (index != -1) 
        { 
            System.out.println(arr[index] + " is at index " + index);
        } 
        else 
        {
            System.out.println("Element not found");
        }
        
    }
}



import java.util.Scanner;
public class Assignment07Task06 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int N = sc.nextInt();
        double [] arr = new double [N];
                
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print("Enter a number: ");
            arr[a] = sc.nextDouble();
        }
        
        //(a)
        
        double maximum = arr[0];
        int index = 0;
        for (int a = 0; a < arr.length; a++)
        {
            if(arr[a] > maximum)
            {
        maximum = arr[a];
        index = a;
            }
            }
        System.out.println("Maximum element " + maximum + " found at index " + index);
        
        //(b)
        
        double minimum = arr[0];
        int index1 = 0;
        for (int a = 0; a < arr.length; a++)
        {
            if(arr[a] < minimum)
            {
        minimum = arr[a];
        index1 = a;
            }
            }
        System.out.println("Minimum element " + minimum + " found at index " + index1);
        
        //(c)
        
        double sum = 0;
        int index2 = 0;
        for (int a = 0; a < arr.length; a++)
        { 
        sum = sum + arr[a];
        index2 = a;
            }
           
        System.out.println("Summation: " + sum);
        
        //(d)
        
        double avg = sum/arr.length;
        System.out.printf("Average: %.2f%n", avg);
        
    }
}


import java.util.Scanner;
public class Assignment07Task07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("N = ");
        int N = sc.nextInt();
        int [] arr = new int [N];
        
        for(int a = 0; a < arr.length; a++) 
        {
            System.out.print("Enter a number: ");
            arr[a] = sc.nextInt();
        }
        System.out.println("Input array: ");
        
        for(int a = 0; a < arr.length; a++)
        {
            System.out.print(arr[a] + " ");
        }
        int count = 0;
        
        for(int a = 0; a < arr.length; a++)
        {
            for(int b = a + 1; b < arr.length; b++)
            {
                if(arr[a] == arr[b])
                {
                    arr[b] = 0;
                }
            }
        }
        
        for(int a = 0; a < arr.length; a++)
        {
            if(arr[a] != 0)
            {
                count = count + 1;
            }
        }
        System.out.println();
        System.out.println("New array: ");
        
        int [] arr2 = new int[count];
        int l = 0;
        
        for(int a = 0; a < arr.length; a++)
        {
            if(arr[a] != 0)
            {
                arr2[l] = arr[a];
                l++;
            }
        }
        
        for(int c = 0; c < count; c++)
        {
            System.out.print(arr2[c] + " ");
        }
        System.out.println();
    }
}


import java.util.Scanner;
public class Assignment07Task08 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the length of array 1: ");
        int num1 = sc.nextInt();
        int [] arr1 = new int [num1];
        
        for(int a = 0; a < arr1.length; a++)
        {
            System.out.print("Please enter the elements of the arr1 ");
            arr1[a] = sc.nextInt();
        }
        System.out.println("Please enter the length of array 2: ");
        int num2 = sc.nextInt();
        int [] arr2 = new int [num2];
        
        for(int a = 0; a < arr2.length; a++)
        {
            System.out.print("Please enter the elements of the arr2 ");
            arr2[a] = sc.nextInt();
        }
        int count = 0;
        
        for(int a=0; a < arr2.length; a++)
        {
            for(int b = 0; b < arr1.length; b++)
            {
                if(arr2[a] == arr1[b])
                {
                    count=count+1;
                }
            }
        }
        if(count == num2)
        {
            System.out.print("Array 2 is a subset of Array 1.");
        }
        else
        {
            System.out.print("Array 2 is not a subset of Array 1.");
        }
        System.out.println();
    }
}