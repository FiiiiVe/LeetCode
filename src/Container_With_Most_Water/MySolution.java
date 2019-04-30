package Container_With_Most_Water;

public class MySolution {
    public static void main(String[] args) {
        int i = maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(i);
    }

    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i != j; ) {
            int min = height[i] < height[j] ? height[i] : height[j];
            if (min * (j - i) > max) {
                max = min * (j - i);
            }
            if (min == height[i]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
