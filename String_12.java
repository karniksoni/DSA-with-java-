public class String_12 {
    public static boolean isPal(String str ){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());

    }
    public static void main(String args[]){
        String str = "ABCDCBA";
        System.out.println(isPal(str));
    }
}
