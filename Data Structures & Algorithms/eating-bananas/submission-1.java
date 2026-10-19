class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) if (pile > right) right = pile;
        int res = right;
        while (left <= right) {
            int speed = left + (right - left) / 2;
            long totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile + speed - 1L) / speed;
            }
            if (totalHours <= h) {
                res = speed;
                right = speed - 1;
            } else {
                left = speed + 1;
            }
        }
        return res;
    }
}


