class Solution {
    public int search(int[] nums, int target) {
        return s(nums,nums.length-1,0,target);
        
    }
    public static int s(int[] nums,int l,int f,int target)
    {
        if(f>l)
        {
            return -1;
        }
        int m=f+(l-f)/2;
        if(nums[m]==target)
        {
        return m;
        }
        if(nums[f]<=nums[m])
        {
            if(target>=nums[f] & target<=nums[m])
            {
                return s(nums,m-1,f,target);
            }
            else
            {
                return s(nums,l,m+1,target);
            }
        }
        if(target>=nums[m] & target<=nums[l])
        {return s(nums,l,m+1,target);}
        return s(nums,m-1,f,target);
    }
}