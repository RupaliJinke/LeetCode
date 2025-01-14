class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int n=height.length;
        int lp = 0;
        int rp =n-1;
        while(lp<rp){
            int w =rp-lp;
            int h =Math.min(height[lp],height[rp]);
            int currwater=w*h;
            maxwater=Math.max(maxwater,currwater);
            if(height[lp]<height[rp])
                lp++;
            else
                rp--;
             }
        return maxwater;
    }
    }