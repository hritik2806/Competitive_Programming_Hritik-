class Solution {
    int max;
    String res="";
    public String longestPalindrome(String s) {
        int n=s.length();
        int i;
        String ans="";
        for(i=0;i<n;i++){
            ans=expand(s,i,i); 
        }
        
        for(i=0;i<n-1;i++){
            ans=expand(s,i,i+1); 
        }
        return ans;
    }
    
    String expand(String s , int p1 , int p2){
        int n=s.length();
        
         while(p1>=0&&p2<n&&s.charAt(p1)==s.charAt(p2)){
             p1--;
             p2++;
         }    
        
      int len=p2-p1-1;
        if(len>max){
            max=len;
            res=s.substring(p1+1,p2);
        }
    return res;
    }
    
}