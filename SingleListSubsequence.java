// import java.util.*;
// public class subsequence {
//     public static void sequence(int ind,int[] arr,ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result){
//         if(ind==arr.length){
//             result.add(new ArrayList<>(current));
//             return;
//         }
//         current.add(arr[ind]);
//         sequence(ind+1, arr, current, result);
//         current.remove(current.size()-1);
//         sequence(ind+1, arr, current, result);
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3,4};
//         ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//         sequence(0,arr,new ArrayList<>(),result);
//         System.out.println();
//         for(ArrayList<Integer> sub : result){
//             System.out.println(sub);
//         }
//     }
    
// }

import java.util.*;

public class SingleListSubsequence {
    public static void sequence(int ind, int[] arr, ArrayList<Integer> current) {
        if (ind == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(arr[ind]);
        sequence(ind + 1, arr, current);

        // Backtrack: remove the last element and try excluding it
        current.remove(current.size() - 1);
        sequence(ind + 1, arr, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> current = new ArrayList<>();
        sequence(0, arr, current);
    }
}
