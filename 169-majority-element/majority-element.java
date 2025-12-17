class Solution {
    public int majorityElement(int[] nums) {
        int majorElem = nums[0];
        int count = 1;
        
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == majorElem){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                majorElem = nums[i];
                count = 1;
            }
        }

    return majorElem;

    }
}