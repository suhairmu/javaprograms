package String;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1= "luminar";
        String s2= "luminar";
        // here memory of both reference indicates to same location because of same content
        if(s1==s2)
        //if(s1.equals(s2))
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