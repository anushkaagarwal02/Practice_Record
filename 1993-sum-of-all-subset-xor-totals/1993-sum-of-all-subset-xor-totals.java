class Solution {
    public int subsetXORSum(int[] nums) {
        return cutie(nums,0,0);
    }
    int cutie(int nums[],int idx,int xor)
    {
        if(idx==nums.length)
        {
            return xor;
        }
        int in=cutie(nums,idx+1,xor^nums[idx]);
        int nic=cutie(nums,idx+1,xor);
        return in+nic;
    }
}