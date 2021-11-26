class Solution {
    public void sortColors(int[] nums) {
        int left = 0,temp;
        int mid = 0;
        int right = nums.length-1;
        while(mid<=right){
            switch(nums[mid]){
                case 0:
                    temp = nums[left];
                    nums[left++] = nums[mid];
                    nums[mid++] = temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[right];
                    nums[right--] = nums[mid];
                    nums[mid] = temp;
                    break;
            }
        }
    }
}
