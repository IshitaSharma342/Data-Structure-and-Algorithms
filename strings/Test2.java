import java.util.*;
public class Test2.java{
    public static void main(String[] args){
        String s="racecar";
        int i=0;j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}