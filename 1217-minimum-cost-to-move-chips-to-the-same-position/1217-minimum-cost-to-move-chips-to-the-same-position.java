class Solution {
    public int minCostToMoveChips(int[] arr) {
        int odd = 0;
        int even = 0;
    
        for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    even++;
                }

                else{
                    odd++;
                }
        }return Math.min(odd, even);
    }    
}