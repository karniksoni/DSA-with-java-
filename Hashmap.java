import java.util.*;
public class Hashmap {
    public static void main(String args[]){
        //create a hashMap
        HashMap<String, Integer> hm = new HashMap<>();
        //Put operation in HashMap
        hm.put("india", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

    //     //get operation in HashMap
    //    int population = hm.get("india");
    //    System.out.println(population);

    //    //containsKey operation in hashMap
    //    System.out.println(hm.containsKey("india"));
    //    System.out.println(hm.containsKey("indonesia"));

    //    //remove operation in HashMap
        //    System.out.println(hm.remove("india"));
        // //    System.out.println(hm);
        //    hm.remove("indonesia");
        //    System.out.println(hm);

        //size operation in HashMap
        System.out.println(hm.size());

        //isEmpty operations in HashMap
        System.out.println(hm.isEmpty());

           
    }
}
