class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int left = 1, right = 0;
        // for (int pile : piles) if (pile > right) right = pile;
        // int res = right;
        // while (left <= right) {
        //     int speed = left + (right - left) / 2;
        //     long totalHours = 0;
        //     for (int pile : piles) {
        //         totalHours += (pile + speed - 1L) / speed;
        //     }
        //     if (totalHours <= h) {
        //         res = speed;
        //         right = speed - 1;
        //     } else {
        //         left = speed + 1;
        //     }
        // }
        // return res;
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        while(l < r){
            int mid = l+(r-l)/2;
            if(canFinish(piles,mid,h)){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
}


    public boolean canFinish(int[] piles, int mid, int h){
        long hours = 0;
        for(int pile : piles){
            hours += (pile + mid - 1L) / mid;
        }
        return hours <= h;
    }
}