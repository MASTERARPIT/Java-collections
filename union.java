import java.util.*;

public class union{
    public static ArrayList<Integer> unionseq(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=0;
        ArrayList<Integer> Union=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1)!=arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else {
                if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            
                if(Union.get(Union.size()-1)!=arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            
        }
        while(j<m){
            if(Union.get(Union.size()-1)!=arr2[j]){
                Union.add(arr2[j]);
            }
            j++;

        }
        return Union;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,3,5,6,7,8,9};

        System.out.println(unionseq(arr1,arr2));
    }
}