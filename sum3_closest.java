import java.util.*;

public class sum3_closest{
    public static int threesum(int arr[],int n){
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        int Final = arr[0]+arr[1]+arr[2];
        int sum=0;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            
            while(j<k){
                sum=arr[i]+arr[j]+arr[k];
                if(sum==n){
                    return n;
                }
                else if(sum<n){
                    j++;
                }
                else{
                    k--;
                }

                int diff = Math.abs(sum-n);
                if(diff<minDiff){
                    Final= sum;
                    minDiff=diff;
                }

            }
            

        }
        return Final;
    }
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(threesum(arr,n));

    }
}