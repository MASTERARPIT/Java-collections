import java.util.*;

public class Spiral {

    public static void spiralmatrix(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;


        while(startrow <= endrow && startcol<=endcol){


            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
    
    
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
            }

            for(int j=endcol-1;j>=startcol;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }

            for(int i=endrow-1;i>startrow;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
       
    }
    public static void main(String[] args){
        int arr[][]={ {1,3,4},{5,6,7},{8,9,8} };
        spiralmatrix(arr);
    }
}
