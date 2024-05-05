import java.util.*;


public class stringsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = maxstr(s);
        System.out.println(result);
    }
    public static int maxstr(String s){

        
        // int sum=0;
        // for(int i=0 ; i < s.length()-1; i++){
        //     sum = sum + Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        // }
        // return sum;

        
        // int ans=0;
        int sum=0;
        
        int arr[]=new int[s.length()];
        for(int i=0; i < s.length();i++){
            arr[i]=(int)s.charAt(i);
        }
        for(int i=0;i<arr.length-1;i++){
          int   ans=(arr[i]-arr[i+1]);
            if(ans<0){
                ans = ans * -1;
            }
            sum=sum+ans;
            
               
        }
            return sum;
        
    }
    
}
