import java.util.Scanner;
// Final version commit
public class Assignment06Task01 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input string: ");
        String s1 = sc.nextLine();
        String s2 = "";
        
        for (int i = 0; i < s1.length(); i++)
        {
            char c1 = s1.charAt(i);
            
            if (c1 >= 'a' && c1 <= 'z')
            {
                c1 = (char) (c1 - 32);
            }
            
            s2 = s2 + c1;
        }
        
        System.out.println(s2);
    }
}


import java.util.Scanner;

public class Assignment06Task02 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        
        String revs1 = "";
        
        for (int i = s1.length() - 1; i >= 0; i--)
        {
        revs1 = revs1 + s1.charAt(i);
        }
        if (s1.equals(revs1))
        {
        System.out.println("true");
        }
        else
            System.out.println("false");
    }
}


import java.util.Scanner;

public class Assignment06Task03 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        
        System.out.println("Character to split on: ");
        char s2 = sc.next().charAt(0);
        
        String s3 = "";
        
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (s2==ch)
            {
                System.out.println(s3);
                s3 = "";
                
            }
            else 
            {
                s3 = s3 + ch;
            }
        }
        System.out.println(s3); 
    }
}


import java.util.Scanner;

public class Assignment06Task04 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        
        String s2 = "";
        int length = s1.length();
        
        for (int i = length - 1; i >= 0; i --)
        {
        s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}


import java.util.Scanner;

public class Assignment06Task05 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
            {
                vowelCount ++;
            }
            else if (ch  > 'a' && ch <= 'z' || ch  > 'A' && ch <= 'Z')
            {
                consonantCount ++;
            }
        }
        if (vowelCount > 0 && consonantCount > 0){
            if (vowelCount % 3 == 0 && consonantCount % 5 == 0)
            {
                System.out.println("Aaarr! Me Plunder!!");
            }
            else 
                System.out.println("Blimey! No Plunder!!");
        }
        
    }
}


import java.util.Scanner;

public class Assignment06Task06 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            char ch = s1.charAt(i);
            if (ch == ' ')
            {
                System.out.print(s2 + " ");
                s2 = "";
            }
            else 
                s2 = ch + s2;
        }
        
        System.out.println(s2);
    }
}


import java.util.Scanner;

public class Assignment06Task07 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input 1: ");
        String s1 = sc.nextLine();
        System.out.println("Input 2: ");
        String s2 = sc.nextLine();
        String r = "";
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            int j;
            for (j = 0; j < s2.length(); j++)
            {
                if (ch == s2.charAt(j))
                {
                    break;
                }
            }
            if (j == s2.length())
            {
                r = r + ch;
            }
        }
        for (int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            int j;
            for (j = 0; j < s1.length(); j++)
            {
                if (ch == s1.charAt(j))
                {
                    break;
                }
            }
        if (j == s1.length())
        {
            r = r + ch;
        }
        }
        System.out.println(r.toUpperCase());
    }
}


import java.util.Scanner;

public class Assignment06Task08 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input: ");
        String s1 = sc.nextLine();
        String output = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i ++)
        {
            char ch = s1.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                if (count == 0) 
                {
                    if(ch >= 'A' && ch <= 'Z')
                    {
                        ch = (char) (ch + 32);
                    }
                    output = output + ch;
                    count ++;
                }
                else if (count % 2 != 0)
                {
                    if (ch >= 'a' && ch <= 'z')
                    {
                        ch = (char) (ch - 32);
                        
                    }
                    output = output + ch;
                    count ++;
                }
                else if(count % 2 == 0){
                    if(ch >= 'A' && ch <= 'Z'){
                        ch = (char)(ch + 32);
                    }
                    output = output + ch;
                    count++;
                }
            }  
            else{
                output = output + ch;
            }
        }
        System.out.println(output);
    }
}


import java.util.Scanner;

public class Assignment06Task09 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a password: ");
        String s1 = sc.nextLine();
        
        int upperC = 0;
        int lowerC = 0;
        int digitC = 0;
        int specC = 0;
        
        if (s1.length() < 8)
        {
            System.out.println("False");
            sc.close();
            return;
        }
        for (int i = 0; i < s1.length(); i++)
        {
        char ch = s1.charAt(i);
        if (ch >= 'A' && ch <= 'Z')
        {
        upperC ++;
        }
        else if (ch >= 'a' && ch <= 'z')
        {
        lowerC ++;
        }
        else if (ch >= '0' && ch <= '9')
        {
        digitC++;
        }
        else
        {
        specC ++; 
        }
        }
        if (upperC > 0 && lowerC > 0 && digitC > 0 && specC > 0)
        {
        System.out.println("True");
        }
        else 
            System.out.println("False");
    }
}