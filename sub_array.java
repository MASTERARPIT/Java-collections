import java.util.*;

public class sub_array {

    public static int subarray(int arr[]){
        int minSum=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr = curr + arr[i];
            if(curr<0){
                curr=0;

            }
            minSum=Math.max(curr,minSum);
        }
        return minSum;
    }



    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subarray(arr));
       
    }

}