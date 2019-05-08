package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Kdiff {

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int num = 0;
        int repetionNum =0;
        for(int i=0; i< nums.length -1; i++){
            for(int j= i+1; j <nums.length; j++) {

                if (nums[i] + k == nums[j]) {
                    num += 1;
                    break;
                }

                if(nums[i] == nums[j]){
                    repetionNum = 1;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        findPairs(nums, 2);
    }
}
