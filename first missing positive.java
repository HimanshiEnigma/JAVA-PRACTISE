class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] > 1)
            return 1;
            
        int temp =1;
        for(int i=0;i<nums.length;i++){
          if(nums[i] == temp)
            temp++;
        }
        return temp;
    }
    
}
