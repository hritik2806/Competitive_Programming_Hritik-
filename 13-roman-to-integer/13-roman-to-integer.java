class Solution {
    public int romanToInt(String s) {
        int n=s.length();
       int i,sum=0;
       HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        sum=map.get(s.charAt(0));
        for(i=1;i<n;i++){
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                sum=sum+map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }
            else{
                sum=sum+map.get(s.charAt(i));
            }
        }
        return sum;
    }
}