class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0; //slow pointer

        for(int j = 1; j < nums.length; j++){  //j -> fast pointer
            if(nums[j] != nums[i]){  //compare unique elements
                i++;
                nums[i] = nums[j]; //assign unique element
            }
        }
        return i+1;
    } 
}