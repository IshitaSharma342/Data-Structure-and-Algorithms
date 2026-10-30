Que)Find the second largest element in the Array
///First sort using any sorting algorithm(it will take n log n) and then use the loop as we know that after sorting the 
/// array the second largest number will be on the last second place so we will take using arr[n-2] but there are some excepation also
/// if the second last and last element is dame then we need to take the third last element..
//Brute Time complexity O(n log n + n) 
import java.util.*;
public class Task2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Array is");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
        Arrays.sort(arr);  //O(n log n);
        int large=arr[n-1]; ///arr[n-1];
        int second=arr[n-2] ///arr[n-2];
        for(int i=n-2;i>=0;i--){   //O(n)
            if(arr[i]!=large)
            second=arr[i];
        }
        System.out.print(second);
    }
}


//Aproach second(Better)-Fisrtfall find the largest element in the array the second largest as INT_MIN
//then check in array it is smaller then second largest update then but if it is largest then dont take it 
//Time Complexity=O(2n) means O(N) and Space Complexity is O(1);
public class Task2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest)
              largest=arr[i];
        }
        int slargest=Integer.INT_MIN;
        for(int i=0;i<n;i++){
          if(arr[i]>slargest && arr[i]!=largest)
            slargest=arr[i];
        }
        System.out.print(slargest);
    }
}
//optimal Lest take an array of 
public class Task2{
    public static class main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            elseif(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.print(slargest);
    }
}