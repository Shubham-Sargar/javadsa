import java.util.*;
public class ReverseArraySwap {
    public static void reverse(int []arr){
        int left=0,right= arr.length - 1;
        while(left<right){
            int temp= arr[left];
            arr[right]= arr[left];
            arr[right]= temp;
        }
    }
    public static void main(String[]args){
        int arr[]= {1,2,3,4,5,6,7};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}
