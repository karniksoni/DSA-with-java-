public class String_11 {
    public static void main(String args[]){
        String s1 = "geekforgeeks";
        String s2 = "for";

        int res = s1.compareTo(s2);
        if(res == 0){
            System.out.println("same");
        }
        if(res > 0){
            System.out.println("S1 greater");
        }
        if(res < 0){
            System.out.println("s1 Smaller");
        }
    }
}
