package FlowControls;
import java.util.Scanner;

// If and else
public class DecisionMaking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no=s.nextInt();
        if(no<0){
            System.out.println("-ve");
            }
        else{
            System.out.println("+ve");
        }
    }
}

/*
package FlowControls;
import java.util.Scanner;

// If and else
public class DecisionMaking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no=s.nextInt();
        if(no<0){
            System.out.println("-ve");
            }
        else if(no>0){
            System.out.println("+ve");
        }
        else{
            System.out.println("+ve");
        }
    }
}

 */
