import java.util.*;
public class kmpalgo {

    public int[] computeLPS(String pattern,int m){

        int lps[]=new int[m];
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                i++;
            }
        }
    }
    return lps;
    }


    ArrayList<Integer> search(String string,String pattern){
        ArrayList<Integer> result=new ArrayList<>();
        int n=string.length();
        int m=pattern.length();
        int lps[]=computeLPS(pattern,m);
        int i=0;int j=0;
        while(i<n){
            if(j<m && pattern.charAt(j)==string.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                result.add(i-j);
                j=lps[j-1];
            }
            else if(i<n && (j==0 || pattern.charAt(j)!=string.charAt(i))){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        kmpalgo kmp=new kmpalgo();
        String string="abcdabcdaabc";
        String pattern = "abc";
        ArrayList<Integer> result=kmp.search(string,pattern);
        System.out.println(result);
    }
}
