class Solution {
    public int singleNumber(int[] nums){
        int seen_one=0,seen_two=0;
        for(int x:nums)
        {
            seen_one=(seen_one^x)&(~seen_two);
            seen_two=(seen_two^x)&(~seen_one);
        }
        return seen_one;
    }
}
