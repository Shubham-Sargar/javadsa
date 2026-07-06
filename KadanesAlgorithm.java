
public class KadanesAlgorithm {
    public static int  ArraySubString(int nums[]){
        int current = nums[0];
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i], current + nums[i]);
            max= Math.max(max,current);

        }
        return max;
    }
    public static void main(String[]args){
        int nums[]= {-1,2,1,-3,4,3,6};
        int result = ArraySubString(nums);
        System.out.println(result);
    }
}
