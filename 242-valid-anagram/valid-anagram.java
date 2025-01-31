class Solution {
    public boolean isAnagram(String s, String t) {
       String str1=s.toLowerCase();
       String str2=t.toLowerCase();
        if(str1.length()==str2.length()){
            char str1chararr[]=str1.toCharArray();
            char str2chararr[]=str2.toCharArray(); 
            Arrays.sort(str1chararr);
            Arrays.sort(str2chararr);
            if(Arrays.equals(str1chararr,str2chararr)){
                return true;
            }
        }
        return false;
    }
}