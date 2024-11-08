import java.util.*;

public class sum4 {

    public List<List<Integer>> sumquad(int[] arr , int target){
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k = j+1;
                int l = n-1;
                long sum = (long)arr[i]+arr[j]+arr[k]+arr[l];
                while(k<l){
                    if(sum==target){
                        result.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                        while(k<l && arr[k]== arr[k-1]){
                            k++;
                        }
                        while(k<l && arr[l]== arr[l+1]){
                            l--;
                        }
    
    
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
                
            }

        }
        return new ArrayList<>(result);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,-2,-2,1,2,3,4,5,6,-8,5};
        int target = 8;
        System.out.println(sumquad(arr,target));
    }
}
