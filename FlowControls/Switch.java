package FlowControls;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 for add, 2 for sub, 3 for mul");
        int opt = s.nextInt();
        switch (opt){
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Substraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
