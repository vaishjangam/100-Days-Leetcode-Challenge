class Solution {
    public int majorityElement(int[] nums) {
        int count = 0; 
        int ans = 0;

        for (int i=0; i<nums.length; i++){
            int num = nums[i];

            if(count == 0){
                ans = num;
            }

            if (num == ans){
                count++;
            }else{
                count--;
            }

        }
        return ans;
    }
}