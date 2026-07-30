class Solution {
    public int numberOfSteps(int x) {
        return helper( x,0);
    }static int helper(int x,int count){
        if(x==0){
            return count;
        }

        if(x%2==0){
            return helper(x/2,count+1);
        }
        return helper(x-1,count+1);
    }
}