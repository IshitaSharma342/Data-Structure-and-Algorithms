Que) Find the largest element in the array
///Brute///First need to Sort Either by quick,insertion,merge etc. then give the last
// element in array ///Time COmplexity will be o(n log n); 
import java.util.*;
public class Task1{
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
    Arrays.sort(arr);
    System.out.print(arr[n-1]);
    
}

}

//Optimal- Take first element as the largest number then use the loop; Time Complexity is O(n)

import java.util.*;
public class Task1{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int largest=arr[0];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Array is");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
    
    for(int i=0;i<n;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
    System.out.print(largest);

    }
}



