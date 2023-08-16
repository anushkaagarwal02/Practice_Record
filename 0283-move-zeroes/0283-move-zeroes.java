class Solution {
    public void moveZeroes(int[] nums) 
    {
      ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {   if(nums[i]!=0)
            a.add(nums[i]);
        }
        for(int i=0;i<a.size();i++)
        {
            nums[i]=a.get(i);
        }
            for(int i=a.size();i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}