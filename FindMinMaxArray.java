import java.util.ArrayList;
// geeks for geeks question for xperate preparation
public class FindMinMaxArray {
    public static ArrayList<Integer> FindMinMAx(int arr[]) {
        int min = Integer.MAX_VALUE;;
        int max = Integer.MIN_VALUE;

        for(int num:arr){
            if(num < min)  min= num;
            if(num>max) max = num;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }

    public static void main(String[]args){
        int arr[]={3,5,7,9,2};
        ArrayList<Integer> result=FindMinMAx(arr) ;
        System.out.println(result.get(0)+" "+result.get(1));



    }
}
