public class _354 {
    class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            return solve(envelopes);
        }

        private int solve(int[][] arr) {

            Arrays.sort(arr, (a, b) -> {
                if(a[0] == b[0]){
                    return b[1] - a[1];
                }
                return a[0] - b[0];
            });


//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}

            int n = arr.length;
            int[] dp = new int[n];
            int result = 0;

            for(int i = 0; i < n; i++) {
                int max = 0;
                for(int j = 0; j < i; j++) {

                    if(arr[i][1] > arr[j][1]) {
                        max = Math.max(max, dp[j]);
                    }

                }

                dp[i] = max + 1;

                result = Math.max(result, dp[i]);
            }


            return result;
        }
    }
}
