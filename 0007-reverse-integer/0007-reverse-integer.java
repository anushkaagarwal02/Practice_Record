class Solution {

    public int reverse(int x) { 
     long rem=0;
       while(x!=0)
        {
           rem=rem*10+x%10;
          x=x/10;

        }
        return(rem < Integer.MIN_VALUE || rem > Integer.MAX_VALUE) ? 0 : (int) rem;
        
    }
}