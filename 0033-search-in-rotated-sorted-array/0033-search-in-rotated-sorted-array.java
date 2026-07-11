class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;   


        while(start<=end){

            int mid=start+(end-start);

            if (arr[mid] == target) {
                     return mid;   //direct target hit hua to
            }

            else if(target > arr[mid] && target <= arr[end]){
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }return -1;
    }
}