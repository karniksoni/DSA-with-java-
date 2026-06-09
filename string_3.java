public class string_3 {
    public static String Substring(String str, int si, int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]){
        String str = " Hello world";
        System.out.println(Substring(str,0,7));
    }
}
