package string;
import java.util.*;
public class palindrom {
    public static boolean checkpalindrom(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="racecar";
        boolean result = checkpalindrom(str);
        System.out.print("Print true if string is palindrom otherwise false: " + result);
    }
}
