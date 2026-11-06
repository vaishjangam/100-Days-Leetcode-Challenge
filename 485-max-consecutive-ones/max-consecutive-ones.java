class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCnt = 0;
        int maxCnt = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                currCnt++;
                maxCnt = Math.max(currCnt, maxCnt);
            }else{
                currCnt = 0;
            }
        }
        return maxCnt;
    }
}