public class _376 {
    class Solution {
        public int wiggleMaxLength(int[] nums) {

            if(nums.length == 0){
                return 0;
            }

            int up = 1, down = 1;

            for(int i = 1; i < nums.length; i++){
                if(nums[i] > nums[i - 1]){
                    up = down + 1;
                }else if(nums[i] < nums[i - 1]){
                    down = up + 1;
                }
            }

            return Math.max(up, down);
        }
    }

    public int wiggleMaxLength(int[] nums) {

        if(nums.length < 2){
            return nums.length;
        }

        int n = nums.length;

        int[] up = new int[n];
        int[] down = new int[n];

        up[0] = 1;
        down[0] = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            }else if(nums[i] < nums[i - 1]){
                down[i] = up[i - 1] + 1;
                up[i] = up[i - 1];
            }else{
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }

        return Math.max(up[n - 1], down[n - 1]);
    }


}
