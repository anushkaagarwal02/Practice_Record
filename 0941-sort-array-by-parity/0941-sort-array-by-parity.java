class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] a = new int[nums.length];
        int lft = 0;
        int rgt = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                a[lft++] = nums[i];
            else
                a[rgt--] = nums[i];
        }
        return a;
    }
}