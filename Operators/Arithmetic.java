package Operators;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

// A.O (+,-,*,/,%)
public class Arithmetic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Roll number: ");
        int roll=s.nextInt();
        System.out.println("Roll Number is "+roll);

        System.out.println("Enter marks in subject1: ");
        int sub1=s.nextInt();

        System.out.println("Enter marks in subject2: ");
        int sub2=s.nextInt();

        int total=sub1+sub2;
        int substraction=sub1-sub2;
        int product=sub1*sub2;
        int division=sub1/sub2;
        int remainder=sub1%sub2;

        System.out.println("Total Marks is "+total);
        System.out.println("Total Marks is "+substraction);
        System.out.println("Total Marks is "+product);
        System.out.println("Total Marks is "+division);
        System.out.println("Total Marks is "+remainder);
    }

}
