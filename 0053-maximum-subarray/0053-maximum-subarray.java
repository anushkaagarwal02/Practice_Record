class Solution {
    public int maxSubArray(int[] a) {
		  int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<a.length;i++)
        {
            cs+=a[i];
          ms= Math.max(ms, cs);
          cs = Math.max(cs, 0);
        }
       return ms;
    }
}


