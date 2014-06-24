import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Height{
    
    public static int height(int n){
        int theight;
        for(int i=0; i<n; i++){
            if(i%2 ==0){
                theight+=1;
            }else{
                theight*=2;
            }
        }
        return theight;
     }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
    
        int T;
        T = in.nextInt();
        for(int i=0;i<T;i++){
            System.out.println(height(in.nextInt()));
        }
    }
    
}