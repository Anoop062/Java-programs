class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0,h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l; 
    }
}
