package Median_of_Two_Sorted_Arrays;

public class MySolution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int len = nums1.length + nums2.length;
        Integer mid1 = null;
        Integer mid2 = null;
        for (int k = 0; k <= len / 2; k++) {
            if (i >= nums1.length) {
                if (k == len / 2 - 1) mid1 = nums2[j];
                else if (k == len / 2) mid2 = nums2[j];
                j++;
            } else if (j >= nums2.length) {
                if (k == len / 2 - 1) mid1 = nums1[i];
                else if (k == len / 2) mid2 = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                if (k == len / 2 - 1) mid1 = nums1[i];
                else if (k == len / 2) mid2 = nums1[i];
                i++;
            } else {
                if (k == len / 2 - 1) mid1 = nums2[j];
                else if (k == len / 2) mid2 = nums2[j];
                j++;
            }

        }
        if (len % 2 == 1) {
            return mid2;
        } else {
            return (double) (mid1 + mid2) / 2;
        }
    }
}
