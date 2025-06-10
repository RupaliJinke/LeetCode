class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int haylen=haystack.length();
        int neelen=needle.length();
        int haypoint=0;
        int neepoint=0;
        while(haypoint<haylen){
            if(haystack.charAt(haypoint) == needle.charAt(neepoint)){
                if(neelen==1){
                    return haypoint;
                }
                haypoint++;
                neepoint++;
            }
            else{
                haypoint-=neepoint-1;
                neepoint=0;
            }
            if(neepoint==neelen){
                return haypoint-neepoint;
            }
        }
        return -1;
    }
}