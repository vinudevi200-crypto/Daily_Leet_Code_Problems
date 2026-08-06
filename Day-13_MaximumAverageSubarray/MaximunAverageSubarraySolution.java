class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int total=0;
      for (int i=0;i<k;i++){
         total += nums[i];
      }
      int sum=total;
      for(int i=k;i<nums.length;i++){
        total += nums[i] - nums[i-k];
        sum=Math.max(sum,total);
      }
      double avg= (double)sum/k;
      return avg;  
    }
}
