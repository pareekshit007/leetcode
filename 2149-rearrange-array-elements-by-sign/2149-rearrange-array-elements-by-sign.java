class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int p = 0;
        int neg = 0;
        for(int num : nums){
            if(num>0){
                positive[p++] = num;
            }else{
                negative[neg++] = num;
            }
        }
            int[] ans = new int[n];
            int index = 0;
            for(int i = 0 ; i < n/2 ; i++){
                ans[index++] = positive[i];
                ans[index++] = negative[i];

            } 
            return ans;
        }
    }
