import java.util.*;


public class array_pair {
    public static void main(String[] args) {
     int arr[]={2,4,5,6,7};
     pairs(arr);
    }

    public static void pairs(int arr[]){
        int t=0;
        for(int i=0;i<arr.length-1;i++){
            
            for (int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i] +","+arr[j]+")");
                t++;
            } 
            System.out.println("\n");
        }
        System.out.println("Total pairs : "+t);

    }
    
}
