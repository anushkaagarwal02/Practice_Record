class Solution {
    public void moveZeroes(int[] arr) 
   {     int j=-1;
   int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int k=j+1;k<n;k++){
            if(j==-1){
                break;
            }
            if(arr[k]!=0){
             
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}