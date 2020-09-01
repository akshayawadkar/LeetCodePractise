public class _134 {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {

            int n = gas.length;

            int start = 0;
            int extra = 0;
            int lacking = 0;


            for(int i = 0; i < n; i++){

                extra = extra + gas[i] - cost[i];

                if(extra < 0){
                    start = i + 1;
                    lacking = lacking + extra;
                    extra = 0;
                }

            }

            return extra + lacking >= 0 ? start : -1;
        }
    }
}
