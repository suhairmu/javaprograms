package StringBuffer;

//String Buffer is mutable (can change)
public class Demo1 {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("luminar ");
        StringBuffer sb1=new StringBuffer("luminar ");

        //System.out.println(sb==sb1);
        //System.out.println(sb.equals(sb1));
        System.out.println(sb.toString().equals(sb1.toString()));
    }
}