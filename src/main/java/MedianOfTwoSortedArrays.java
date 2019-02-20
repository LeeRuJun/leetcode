import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 思路： 复制数组的高效方法请使用： System.arraycopy()
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] num3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, num3, 0, nums1.length);
        System.arraycopy(nums2, 0, num3, nums1.length, nums2.length);
        Arrays.sort(num3);
        int length = nums1.length + nums2.length;
        if (length % 2 == 0) {
            return (double) (num3[length / 2] + num3[length / 2 - 1])/2;
        } else {
            return (double) num3[(length - 1) / 2];
        }
    }
}
