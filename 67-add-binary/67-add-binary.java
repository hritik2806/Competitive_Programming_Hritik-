class Solution {
    public String addBinary(String A, String B) {
                int x=0,y=0;
        int n=A.length();
        int m=B.length();
        int i=n-1;
        int j=m-1;
        int carry=0,sum=0;
         StringBuilder C=new StringBuilder();
        while(carry!=0||i>=0||j>=0){
            x=0;
            if(i>=0&&A.charAt(i)!='0'){
                x=1;
             }
            y=0;
            if(j>=0&&B.charAt(j)!='0'){
                y=1;
             }
        
           C=C.append((x+y+carry)%2);
           carry=(x+y+carry)/2;
           i--;
           j--;
        }
         C.reverse();
    return C.toString();
        
    }
}