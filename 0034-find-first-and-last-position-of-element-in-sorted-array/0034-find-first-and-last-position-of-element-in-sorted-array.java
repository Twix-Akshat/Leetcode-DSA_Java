class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }

    public int first(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(mid == 0 || arr[mid-1] != target){
                    return mid;
                }
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public int last(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                if(mid == arr.length-1 || arr[mid+1] != target){
                    return mid;
                }
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}