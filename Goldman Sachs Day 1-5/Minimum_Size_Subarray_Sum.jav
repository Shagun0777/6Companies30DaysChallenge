class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0 , j = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int cm = 0;
        
        while(j < n){
            if(j < n && cm >= target){
                cm += nums[j++];
            }
            
            while(j < n && cm < target){
                cm += nums[j++];
            }
            
            if(cm >= target){
                
                while(i< j && cm - nums[i] >= target){
                    cm -= nums[i++];
                }
                
                min = Math.min(min , j- i);
            }
            
            
        }
        
        if(min == Integer.MAX_VALUE) return 0;
        
        return min ;
             
    }
}