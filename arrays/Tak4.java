Que)Removing the Duplicate from the array for brute force using the sets(As it takes only the unique elements) and then loop after that
//Time Complexity=O(N Log N +N);
public class Task4{
    public static void main(String[] args){
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int index=0;
        for(auto i:arr){
            arr[index]=i;
            index++;
        }
    }
}
public class Task4{
    public static void main(String[] args){
     int arr[] = {1, 2, 2, 3, 4, 4, 5};
     int n=arr.length;
     int i=0;
     for(int j=1;j<n;j++){
        if(arr[j]!=arr[i])
        {
            arr[i+1]=arr[j];
            i++;
        }
     }
     return i+1;
        
    }
}