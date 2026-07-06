class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        for(int i = 0 ; i < k  ; i++){
           int currentNum = nums[n - 1 - i];
            long effectiveMul = Math.max(1,mul);
            sum += (long) currentNum * effectiveMul;
            mul--;
        }       
        return sum;
}
}