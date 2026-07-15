class Solution {
    public int countNegatives(int[][] arr) {
        int ans=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(0>arr[row][col]){
                        ans=ans+1;
                }
            }
        }return ans;
    }
}