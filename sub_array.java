import java.util.*;

public class sub_array {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        subarray(arr);
    }

    public static void subarray(int arr[]){
        int total=0;
        
        // int sum=0;
        for (int i=0;i<arr.length;i++){
            int a = i;
            for(int j=i;j<arr.length;j++){
                int k = j;
                for(int l=a;l<=k;l++){
                    
                    System.out.print(arr[l]+" ");
                   
                }
                
                // System.out.println(sum);
                total++;
                System.out.println("");
            }
            
        }
        System.out.println("\n"+total);
    }
}
