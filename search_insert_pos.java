import java.util.*;;

public class search_insert_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_size=sc.nextInt();

        int[] arr = new int[arr_size];

        for(int i=0;i<arr_size;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

    

        System.out.println(search(arr,target));
        

    }


    public static int search(int[] arr,int target){

        
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low <= high){
            mid=low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){

                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
    
}
