import java.util.Arrays;

public class MakeArrayZero {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int out = 0;
        while(i<nums.length){
            if(nums[i]==0){
                i++;
            }else{
                out++;
                int a = nums[i];
                for(int j=i; j<nums.length; j++){
                    nums[j] = nums[j]-a;
                }
            }
        }
        return out;
    }
}
