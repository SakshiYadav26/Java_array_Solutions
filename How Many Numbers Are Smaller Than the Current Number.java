// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(element > nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
        
    }
}
