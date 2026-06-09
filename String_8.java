public class String_8{
    public static void main (String args[]){
        String s1 = "geeks";
        String s2 = "geeks";
        String s3 = new String("geeks");

        if(s1 == s2){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        if( s1 == s3){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}