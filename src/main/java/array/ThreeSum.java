package array;

import java.util.Arrays;
import java.util.List;

/**
 * 双指针遍历
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 2){
            return null;
        }

        Arrays.sort(nums);
        for(int i=0; i<nums.length - 3;i++){
            if(nums[i] > 0){// 剪枝處理
                break;
            }

            int target = -nums[i];
            int left = i+i;
            int right = nums.length - 1;
            while (left < right){
                int  sum =  nums[left] + nums[right];
                if(sum == target){
                    List<Integer> list = Arrays.asList(nums[left], nums[i], nums[right]);
                }else if(sum > target){
                    right --;
                }else
                left ++;

            }
        }
        return null;
    }
}
