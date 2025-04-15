import java.util.*;

public class dectobin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
        while(true){
            int n=sc.nextInt();
            if(n==-1){
                System.out.println("invalid number");
            }
            if(n==0){
                System.out.println("bin=0");
            }else{
                System.out.print("binary: ");
                bin(n);
                System.out.println();
            }

        }
        
           
    }

    public static void bin(int n){
        if(n==0){
            return ;
        }
        bin(n/2);
        System.out.print(n%2);
        
    }
}
