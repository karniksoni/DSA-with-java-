public class recursion {
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " "); 
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;

    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n+snm1;
        return sn;
    }
    // printing the fibonnaci series of nth number
    public static int fib(int n){
        //base case 
        if(n == 0 || n == 1){
            return n;
        }
        //main operation
        int fn1 = fib(n-1);
        int fn2 = fib(n-2);
        int fn = fn1 + fn2;

        return fn;
    }
    //check if the array is sorted or not 
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);

    }
    //write a program to find the first occurence of the element if the array
    public static int firstOccur(int arr[] , int key , int i ){
        if(i == arr.length - 1){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
    //a program to find the last occurence
    public static int lastoccur(int arr[], int key, int i){
        
        if(i == arr.length ){
            return -1;
        }
        int isfound = lastoccur(arr,key,i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    //printing the power of x time complexity - O(n)
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xn1 = power(x,n-1);
        // int xn = x * xn1;
        // return xn;
        return x * power(x, n-1);
    }
    //optimized solution of power of x time complexity - O(logn)
    public static int poweropti(int x , int n){
        if(n==0){
            return 1;
        }
        int halfpower = poweropti(x,n/2) * poweropti(x,n/2);

        // if n is odd
        if(n%2!=0){
            halfpower = x * halfpower;
        }
        return halfpower;
    }

    
    public static void main(String[] args){
        // int arr[] = {1,2,4,6,5,7,5,6};
        
        System.out.println(poweropti(2,5));
    }
}
