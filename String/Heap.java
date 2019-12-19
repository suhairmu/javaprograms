package String;

public class Heap {
    public static void main(String[] args) {
        String s1=new String("luminar");
        String s2= new String("luminar");
        //if(s1==s2)
        if(s1.equals(s2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }
}

// in case of string == means reference comparison (location)