import java.util.*;
public class Task1{
    public static void main(String[] args){
        int arr={1,2,3,4,5,6};
        int i=0;
        int j=arr.length-1;
        if(arr[i]+arr[j]==10){
            System.out.print(arr[i] + ", "+ arr[j]);
        }
        else{
            return -1;
        }
    }
}