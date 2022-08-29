class Solution {
    public boolean canArrange(int[] arr, int k) {
           int i,j;
        int B=k;
        long count=0;
        int n=arr.length;
        int m=1000*1000*1000+7;
        long rem[]=new long[B];
        for(i=0;i<n;i++){
            rem[(arr[i]%B+B)%B]++;
            }
            long ans=rem[0]*(rem[0]-1)/2;
             i=1;
             j=B-1;
            while(i<j){
                if(rem[i]!=rem[j])
                 return false;
                i++;
                j--;
                
            }
        if(i == j){
            if((rem[i] & 1) == 1){
                return false;
            }
        }
        
     
      
            return true;
 
                
    }
}