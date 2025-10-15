import java.util.Scanner;
// Final version commit
public class Final01 {
    
    //(A)
    public static void evenChecker(int a)
    {
        if (a % 2 == 0)
        {
            System.out.println("Even!!");
        }
        else 
        {
            System.out.println("Odd!!");
        }
    }
    
    //(B)
    public static boolean isEven(int a)
    {
        if (a % 2 == 0)
        {
        return true;
        }
        else 
        {
        return false;
        }
    }
    
    //(C)
    public static boolean isPos(int a)
    {
        if (a >= 0)
        {
        return true;
        }
        else 
        {
        return false;
        }
    }
    
    //(D)
    public static void sequence(int a)
    {
        if (isPos(a))
        {
            if (isEven(a))
            {
                for (int i = 0; i <= a; i = i + 2)
                    System.out.print(i + " ,");
            }
            else 
            {
                for (int i = 0; i < a; i = i + 2)
                System.out.print(i + " ,");
            }
        }
        else
        {
            if (isEven(a))
            {
                a ++;
                for (int i = a; i < 0; i = i + 2)
                {
                System.out.print(i + ",");
                }
            }
            else 
            {
            for (int i = a; i < 0; i = i + 2)
                {
                System.out.print(i + ",");
                }
            }
        }
        System.out.println(); 
    }
    
    public static void main (String [] args){
    evenChecker(10);
    
    boolean result = isEven(11);
    System.out.println(result);
    
    boolean result1 = isPos(10);
    System.out.println(result1);
    
    sequence(10);
    }
}

import java.util.Scanner;
public class Final02 {
    
    //A
    public static double circleArea(int a)
    {
    return Math.PI * Math.pow(a, 2);
    }
    
    //B
    public static double sphereVolume(int a)
    {
    return (4.0/3.0) * Math.PI * Math.pow(a, 3);
    }
    
    //C
    public static void findSpace(int a, String b)
    {
    if(b.equals("circle"))
    {
    System.out.println(circleArea(a / 2));
    }
    else if(b.equals("sphere"))
    {
    System.out.println(sphereVolume(a / 2));
    }
    else
        System.out.println("Wrong Parameter");
    }
    
    public static void main (String [] args){
    
    double area = circleArea(5);
    System.out.println(area);
    
    double volume = sphereVolume(5);
    System.out.println(volume);
    
    findSpace(5, "sphere");

    }
}

import java.util.Scanner;
public class Final03 {
    
    //A
    public static boolean isPrime(int a)
    {
        for(int i = 2; i <= a; i++)
        {
            if (a % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main (String [] args){
        
        boolean check = isPrime(8);
        System.out.println(check);
        
    }
}


import java.util.Scanner;
public class Final04 {
    
    public static boolean isPerfect(int a)
    {
        int sum = 0;
        for (int i = 1; i < a; i++)
        {   
            if (a % i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == a)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public static void main (String [] args){
        
        boolean check = isPerfect(6);
        System.out.println(check);
        
    }
}

import java.util.Scanner;
public class Final05 {
   
    public static double calcTax(double a, double b)
    {
        if(a < 18)
        {
        return 0.0;
        }
        else if(b <= 10000)
        {
        return 0.0;
        }
        else if(b >= 10000 && b <= 20000)
        {
        return b * 0.07;
        }
        else 
        {
        return b * 0.14;
        }
    }
    
    public static void main (String [] args){
        
        double t = calcTax(20, 18000);
        System.out.println(t);

    }
}

public class FinalString01{ 
    public static void main(String[] args) {
        String course = "";
        int i = 2, j = 0, k = 18;
        course = "-->cse";
        while (i< 5) {  
            k--;
            j = k;
            while (j > 12 ) {
                if (j % 2 != 0) {
                    course += "<--";
                    course =  course + i + (j / 2);
                } else {
                    course += "-->";
                    course =  course + (i % 2) + j;
                }
                System.out.println(course);
                if (j == 14) {
                    course = "-->cse";
                }     
                --j;
            }
            i++;
        }
    }
}

import java.util.Scanner;
public class FinalString02{ 
    
    public static void modifyStrings(String S, String S1, String S2)
    {
    String result = "";
    int i = 0;
    int S1Length = S1.length();
    while(i <= S.length() - S1Length)
    {
        boolean match = true;
        for (int j = 0; j < S1Length; j++)
        {
            if (S.charAt(i + j) != S1.charAt(j))
            {
                match = false;
                break;
            }
        }
        if (match)
        {
        result = result + S2;
        i = i + S1Length;
        }
        else 
        {
        result = result + S.charAt(i);
        i++;
        }
    }
        while (i < S.length()) {
            result += S.charAt(i);
            i++;
        }

        System.out.println(result);
    
    
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
   
        System.out.print("Enter string S: ");
        String S = sc.nextLine();
        
        System.out.print("Enter string S1: ");
        String S1 = sc.nextLine();
        
        System.out.print("Enter string S2: ");
        String S2 = sc.nextLine();
        
        modifyStrings(S, S1, S2);

  }
}

//public class Main {
//    public static void modifyStrings(String S, String S1, String S2) {
//        String modifiedString = S.replace(S1, S2);
//        System.out.println(modifiedString);
//    }
//
//    public static void main(String[] args) {
//        
//        String S = "abababa";
//        String S1 = "aba";
//        String S2 = "a";
//        modifyStrings(S, S1, S2);  
//    }
//}

public class final04{
    public static void main(String [] args){
        boolean check = isHappyNumber(88);
        System.out.println(check);
    }

    public static boolean isHappyNumber(int num){
        
        while (num != 1 && num != 4){
            int sum =0;
            while (num>0){
                int digit = num%10;
                sum += digit * digit;
                num /= 10;
            }
            num =sum;

        }
        return num==1;
    }
}

import java.util.Scanner;
public class FinalString05{
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter binary Number: ");
        String binary = s1.next();
        int ans = toDecimal(binary);
        System.out.println(ans);
        System.out.println(toHex(ans));
        s1.close();
    }
    
    public static int toDecimal(String str){
        int decimal =0;
        int size = str.length();
        for (int i =0; i<size;i++){
            int num =str.charAt(i)-'0';
            decimal += num *(int)(Math.pow(2,(size-1-i)));
        }
        return decimal;      
    }
    public static String toHex(int ans){
        String hex = "";
        while(ans>0){
            int rem = ans%16;
            if(rem<10){
                hex = rem + hex;
            }
            else{
                hex = (char)(rem-10+'A') + hex;
            }
            ans = ans/16;
        }
        return hex;
    }
}

public class task09 {
    public static void main(String [] args){
        char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int[] studentScores = new int[7];
        getScores(studentGrades,studentScores);
    }
    public static void getScores(char[] ar1,int[]ar2){
        for (int i =0; i< ar2.length;i++){
            if(ar1[i]=='A'){
                ar2[i]=100;
            }
            else if (ar1[i]=='B'){
                ar2[i]=90;
            }
            else if (ar1[i]=='C'){
                ar2[i]=70;
            }
            else {
                ar2[i]=0;
            }
        }
        for (int j =0; j<ar2.length;j++){
            System.out.println(ar2[j]);
        }

    }
}

public class task11  {
    public static void main(String [] args){
        int ans = isVowel("The quick brown fox jumps over the lazy dog");
        System.out.println(ans);
        int ans2 = isConsonant("The quick brown fox jumps over the lazy dog");
        System.out.println(ans2);
        String [] arr1 ={"Bob", "Alice", "Max", "Marry", "Rosy"};
        int sumVowel = vowelSum(arr1);
        System.out.println("The total number of vowels in the array is: "+sumVowel);
        int sumConsonant = consonantSum(arr1);
        System.out.println("The total number of consonants in the array is: "+sumConsonant);
    }
    public static int isVowel(String s1){
        int vowel = 0;
        for (int i=0; i<s1.length();i++){
            char ch = (char)(s1.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
        }
        return vowel;
    }
    public static int isConsonant(String s1){
        int consonant = 0;
        for (int j=0; j<s1.length();j++){
            char ch1 = (char)(s1.charAt(j));
            if ((ch1>=65 && ch1<=90)||(ch1>=97 && ch1<=122)){
                if (ch1!='a'&&ch1!='e'&&ch1!='i'&&ch1!='o'&&ch1!='u'&&ch1!='A'&&ch1!='E'&&ch1!='I'&&ch1!='O'&&ch1!='U'){
                    consonant++;
                }
            }  
        }
        return consonant;
    }
    public static int vowelSum(String [] arr){
        int sum =0;
        for (int p =0; p<arr.length; p++){
            String x = arr[p];
            int res = isVowel(x);
            sum += res;
        }
        return sum;
    }
    public static int consonantSum(String [] arr){
        int sum1 =0;
        for (int q =0; q<arr.length; q++){
            String y = arr[q];
            int res1 = isConsonant(y);
            sum1+= res1;
        }
        return sum1;
    }
}