public class mergesort {

    public static int merge(int arr[],int l,int mid,int r){
        
    }
    public static int mergeSort(int arr[],int l,int r){
        if(l==r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String args[]){
        int ans=0;
        int arr[]={3,4,2,1,5,6,7,8,9,4,3,7,8,9,0};
        mergeSort(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
