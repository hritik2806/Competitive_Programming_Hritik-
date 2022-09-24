class Solution {
    public String reverseWords(String s) {
      String[] arr = s.replaceAll("\\s+"," ").split(" "); 
    
    String ans = "";
    for(String str : arr){
            ans = str +" "+ans;  
    }
    return ans.trim();//use trip to remove any spaces at begin or end
}
    }
