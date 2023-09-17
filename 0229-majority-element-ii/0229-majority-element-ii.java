class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        
        int c1=0;
        int c2=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && nums[i]!=max2)
            {
                c1=1;
                max1=nums[i];
            }
        else if(c2==0 && nums[i]!=max1)
            {
                c2=1;
                max2=nums[i];
            }
           else if(max1==nums[i])
            {
                c1++;
            }
           else  if(max2==nums[i])
            {
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max1) c1++;
            if(nums[i]==max2) c2++;
        }
        int m=(int)(nums.length/3)+1;
        if(c1>=m)
        list.add(max1);
        if(c2>=m)
        list.add(max2);
        //Collections.sort(list);   
        return list;
        }
    
}