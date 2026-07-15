class Solution {
    public int maximumCount(int[] arr) {
        int pos=0;
        int neg=0;
        int zero=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero=zero+1;
            }
             if(0>arr[i]){
                neg++;
            }
            if(arr[i]>0 && arr[i]!=0){
                pos++;
            }
        }return Math.max(pos, neg);
    }
}