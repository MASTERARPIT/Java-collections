// import java.util.*;

import java.util.ArrayList;

public class mergesort {
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> res=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                res.add(arr[left]);
                left++;
            }else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            res.add(arr[left]);
            left++;
        }
        while (right<high){
            res.add(arr[right]);
            right++;
        }
        for(int i=low;i<high;i++){
            arr[i]=res.get(i-low);
        }
    }
    public static void mergeSort(int arr[],int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String args[]){
        int arr[]={3,4,2,1,5,6,7,8,9,4,3,7,8,9,0};
        // Arrays.sort(arr);
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
