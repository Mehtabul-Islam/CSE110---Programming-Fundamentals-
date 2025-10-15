//TASK-01
public class Task01 {
    public static void main (String [] args){
        
        int hungry = 10;
        System.out.println(hungry);//VALID
        
        int 2AB = 10; 
        System.out.println(2AB);//invalid 
        
        int 312.2 = 10; 
        System.out.println(312.2);//invalid
        
        int MOBILE = 10; 
        System.out.println(MOBILE);//VALID
        
        int  “Ans” = 10; 
        System.out.println( “Ans”);//invalid
        
        int $30 = 10; 
        System.out.println($30);//VALID
        
        int Yes/No = 10; 
        System.out.println(Yes/No);//invalid
        
        int student-id  = 10; 
        System.out.println(student-id);//invalid
        
        int A+3 = 10; 
        System.out.println(A+3);//invalid
        
        int ‘X’ = 10; 
        System.out.println( ‘X’);//invalid
        
        int return = 10; 
        System.out.println(return);//invalid
    }
}

//TASK-02
public class Task02 {
    public static void main (String [] args){
        //TASK 2.1
        int number = 66;
        System.out.println("The value of number is: " + number);
        //TASK 2.2
        int num1 = 66;
        int num2 = 99;
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        //TASK 2.3
        int product1 = num1 * num2;
        double division1 = (double) num1 / num2;
        System.out.println("Product of num1 and num2 is = " + product1);
        System.out.println("Division of num1 and num2 is = " + division1);
        //TASK 2.4
        double dub1 = 66.6;
        System.out.println("The value of double number is: " + dub1);
        double dub2 = 99.7;
        double sum2 = dub1 + dub2;
        System.out.println("Double Sum2 = " + sum2);
        double product2 = dub1 * dub2;
        double division2 = (double) dub1 / dub2;
        System.out.println("Product of dub1 and dub2 is = " + product2);
        System.out.println("Division of ndub1 and dub2 is = " + division2);
        //TASK 2.5
        int num3 = 21;
        double num4 = 22.2;
        System.out.println("The value of int number is: " + num3); 
        System.out.println("The value of double number is: " + num4);
        double product3 = num1 * dub1;
        System.out.println("Product of num1 and dub1 is = " + product3); //int num1 * double dub1
        double division4 = num1 / dub1;
        System.out.println("Division of num1 and dub1 is = " + division4);//int num1 / dub1
        //TASK 2.6
        String st1 = "Lab Assesment";
        System.out.println("Value of my string is = " + st1);
        String st2 = " is average";
        String sumst = st1 + st2;
        System.out.println("The summation of my string is = " + sumst);
    }
}

//TASK-03
public class Task03 {
    public static void main (String [] args){
        double radius = 4.0; //Beshardho
        double circumference = 2 * 3.1416 * radius; //Poridhi
        double area = 3.1416 * radius * radius; //Khetrofol
        
        System.out.println("With a radius of " + radius + " units:");
        System.out.println("Circumference: " + circumference + " units");
        System.out.println("Area: " + area + " square units");     
    }
}

//TASK-04
public class Task04{
    public static void main (String [] args){
        int num = 1234;
        int lastdgts = num%100; // % = last digits, / = first digits
        System.out.println("The last 2 digits of that number is = " + lastdgts);
    }
}

//TASK-05
public class Task05{
    public static void main (String [] args){
        int inch = 1000; 
        double meter = 0.0254;
        double conversion = inch * meter;
        System.out.println(inch + " inch is " + conversion + " meters " );
    }
}

//TASK-06
public class Task06{
    public static void main (String [] args){
        //Task a - third variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a; //temp = 10 as a = 10
        a = b; // a = 20 as b = 20 before swapping
        b = temp; // b = 10 as temp = 10
        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
            
        //Task b
        int c = 10;
        int d = 20;
        System.out.println("Before swapping: ");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        c = c + d; //Now, c = 30
        d = c - d; //Now, d = 10
        c = c - d; //Now, c = 20
        System.out.println("After swapping: ");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

//TASK-07
public class Task07{
    public static void main (String [] args){
        int minutes = 3456789;
        int minutesInYear = 60 * 24 * 365;
        int years = minutes / minutesInYear; //Through this we find the round figured number of years
        int remainingminutes = minutes % minutesInYear; //minutes left after covering round figured years
        int days = remainingminutes / (60 * 24); //converting the remaining minutes in days
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days " );
    }
}

//TASK-08
public class Task08{
    public static void main (String [] args){
        int a = 2;
        int b = 5;
        int c = 8;
        int d = ((2 * b) * ((c - a) / 3)  + 7);
        System.out.println("The value of d = " + d);
    }
}

//TASK-09
public class Task09{
    public static void main (String [] args){
        int n = 5;
        System.out.println(n + " x 1 = " + (n *1 ));
        System.out.println(n + " x 2 = " + (n *2 ));
        System.out.println(n + " x 3 = " + (n *3 ));
        System.out.println(n + " x 4 = " + (n *4 ));
        System.out.println(n + " x 5 = " + (n *5 ));
        System.out.println(n + " x 6 = " + (n *6 ));
        System.out.println(n + " x 7 = " + (n *7 ));
        System.out.println(n + " x 8 = " + (n *8 ));
        System.out.println(n + " x 9 = " + (n *9 ));
        System.out.println(n + " x 10 = " + (n *10));        
    }
} 

//TASK-10
public class Task10 {
    public static void main (String [] args){
        int n = 100;
        int a = 1;
        int L = 100;
        int sum = (n * (a + L) / 2);
        System.out.println("Sum of the first 100 positive numbers is : " + sum);
    }
}

//TASK-11
public class Task11 {
    public static void main (String [] args){
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(a * a + b * b); //Given equation iot get c
        double sinA = a/c;
        double sinB = b/c;
        double cosA = b/c;
        double cosB = a/c;
        System.out.println("Sin values of angle A and B : ");
        System.out.println("SinA = " + sinA);
        System.out.println("SinB = " + sinB);
        System.out.println("Cos values of angle A and B : ");
        System.out.println("CosA = " + cosA);
        System.out.println("CosB = " + cosB);     
    }
}

//TASK-12
public class Task12 {
    public static void main (String [] args){
          int student_ID = 24301400;
          int lastTwoDigits = student_ID % 100;
          int lastDigit = lastTwoDigits % 10;
          int secondLastDigit = lastTwoDigits / 10;
          System.out.println(lastDigit);
          System.out.println(secondLastDigit);
    }
}

//TASK-13
public class Task13 {
    public static void main (String [] args){
         int distanceInMeters = 1400;
         double distanceKM = distanceInMeters/1000.0;
         double distanceMILE = distanceInMeters/1609.0;
         int hours = 5;
         int minutes = 56;
         int seconds = 23;
         double totalHours = hours + ((double) minutes / 60) + ((double) seconds / (60 * 60)); 
         double velocityKM = distanceKM / totalHours;
         double velocityMILE = distanceMILE / totalHours;
         System.out.println("Your velocity in km/h is " + velocityKM);
         System.out.println("Your velocity in mile/h is " + velocityMILE);         
    }
}

//TASK-14
public class Task14{
    public static void main(String [] args){
        double a = 8.0;
        double b = 3.0;
        double c = Math.sqrt((a/2)*(a/2) + b*b);//as a/2 divides a in half in order to apply pythagoras.
        double circumference = 6 * c;
        double area = (3 * Math.sqrt(3) / 2) * c * c;
        System.out.println("Circumference of the hexagon is: " + circumference);
        System.out.println("Area of the hexagon is : " + area);
    }
}
