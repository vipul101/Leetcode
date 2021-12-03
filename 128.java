class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length == 0) return 0;
        int res = 0,n = nums.length,curr=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        
        for(int i=0;i<n;i++){
            curr = 0;
            if(!set.contains(nums[i]-1)){
                int cur_num = nums[i]+1;
                while(set.contains(cur_num)){
                    curr++;
                    cur_num++;
                }
            }
            res = Math.max(curr,res);
        }
        return res+1;
    }
}
