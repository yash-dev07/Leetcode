class Solution {
    public int maxDigitRange(int[] nums) { 
        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {

            int temp = num;
            int min = 9, max = 0;

            while (temp > 0) {
                int d = temp % 10;
                min = Math.min(min, d);
                max = Math.max(max, d);
                temp /= 10;
            }

            int range = max - min;

            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange) {
                sum += num;
            }
        }

        return sum;
    }
}