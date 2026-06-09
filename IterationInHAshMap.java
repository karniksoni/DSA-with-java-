import java.util.*;
public class IterationInHAshMap {
public static void main(String[] args){
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("india", 100);
    hm.put("China" ,150);
    hm.put("US", 50);
    hm.put("Indonesia", 6);
    hm.put("Nepal", 5);

    //iteration
    Set<String> key = hm.keySet();
    System.out.println(key);

    for (String K : key) {
        System.out.println("key=" + K + ",value=" + hm.get(K));
    }
}


}
