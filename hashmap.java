import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,7,7,6,5,9,2,1,3,10};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm);
    }
    
}
