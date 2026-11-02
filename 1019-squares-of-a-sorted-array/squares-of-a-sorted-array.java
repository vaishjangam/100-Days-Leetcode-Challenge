class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int pos = nums.length-1;
        int[]result = new int[nums.length];
        while(left<=right){
        int leftsquare = nums[left]*nums[left];
        int rightsquare = nums[right]*nums[right];

        if(leftsquare > rightsquare){
            result[pos] = leftsquare;
            left++;
        }else{
            result[pos] = rightsquare;
            right--;
        }
         pos--;
        }
        return result;
    }
}