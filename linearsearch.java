public class linearsearch{
    public static int LinearSearch(int[] num, int key){
        for(int i =0;i<num.length;i++){
            if(key == num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            int num[] = {5,10,50,31,12,30}; // 6 elements 
            int key = 1000;
            int index = LinearSearch(num, key);
            if(index == -1){
                System.out.println("Not found");
            }   
            else {
                System.out.println("key is found at " + index );
            }         
            
        
            
    }
}
