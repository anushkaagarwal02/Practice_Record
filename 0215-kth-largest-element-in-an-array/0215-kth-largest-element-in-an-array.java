class Solution {
    public int findKthLargest(int[] nums, int k)
    {Arrays.sort(nums);  

int z=nums.length;
return nums[z-k];
}
}