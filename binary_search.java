public class binary_search {
    
    
    /// ARRAY SHOULD BE SORTED FOR BINARY SEARCH
    
    
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,12};
        int key = 5;
        int value = binary(arr,key);
        if(value==-1){
            System.out.println("now value found");
        }else{
            System.out.println("value is at index : "+value);
        }
    }

    public static int binary(int arr[],int key){
        int start=0;
        int last = arr.length-1;

        while(start <= last){

            int mid =(start+last)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else{ 
                last = mid-1;
            }
        }
       return -1;


    }
    
}
