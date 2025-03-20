// https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int initialAltitude=0;
      
        for(int i=0;i<gain.length;i++){
            initialAltitude += gain[i];
            max= Math.max(initialAltitude, max);
        }
        return max;
    }
    
}
