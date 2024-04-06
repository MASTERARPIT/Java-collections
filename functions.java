import java.util.*;

public class functions {


    // ADD

    // public static void sum(int a,int b){
    //     int add = a+b;

    //     System.out.println(add);

    // }


    public static void fact(int n){

        int fcat=1;
        if(n==0){

            System.out.println("1");
        }
        else{
            for(int i=n;i>=1;i--){

                fcat= fcat*i;
            }
            System.out.println(fcat);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        

        fact(n);
        
    }
    
    
}
