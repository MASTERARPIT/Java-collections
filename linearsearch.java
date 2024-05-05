import java.util.*;

public class linearsearch {
    
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,7,8,9,12};
        int key =6;
        int index=linearsearch(arr,key);

        if(index == -1){
            System.out.println("no value found");
        }
        else{
            System.out.println("key is at index : "+index);
        }
    }
    public static int linearsearch(int arr[],int key){

        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
}
