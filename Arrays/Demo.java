package Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //datatype [] arrayname=new datatype[size];

        Scanner s=new Scanner(System.in);
        int[] marks = new int[4];
        for (int i=0;i<4;i++)
        {
            System.out.println("Enter Element:");
            marks[i]=s.nextInt();
        }

        System.out.println("Entered Elements are:");
//        for(int i=0;i<4;i++)
//        {
//            System.out.println(marks[i]);
//        }
        for(int i:marks)    //for each
        {
            System.out.println(i);
        }
        /*marks[0]=150;
        marks[1]=145;
        marks[2]=150;
        marks[3]=165;*/

    }
}
