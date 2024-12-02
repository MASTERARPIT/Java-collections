import java.util.*;

public class intersection {
    public static ArrayList<Integer> intersect(int arr1[],int arr2[]){

        int n=arr1.length;
        int m=arr2.length;
        int min=Math.min(n,m);
        int val[]=new int[min];
        for(int i=0;i<min;i++){
            val[i]=0;
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j] && val[j]==0){
                    res.add(arr2[j]);
                    val[j]=1;
                    break;
                }
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};  // both arrays are sorted
        int arr2[]={1,3,5,6,7,8,9};
        System.out.println(intersect(arr1,arr2));
    }
}

