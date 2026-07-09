class Solution {
    public int maximumWealth(int[][] arr) {
        int ans=Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++){
            int sum=0;

            for(int col=0;col<arr[row].length;col++){
                sum=sum+arr[row][col];
            }

            while(sum>ans){
                ans=sum;
            }
        }return ans;


    }
}