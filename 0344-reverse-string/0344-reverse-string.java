class Solution {
    public void reverseString(char[] s) {
          int start = 0;
          int end = s.length - 1;

        rev(s, start, end);
    }static void rev(char[]s,int start,int end){
        if(start>=end){
            return;
        }

        if(start!=end){
                   swap(s, start, end);
        }
         rev(s,start+1,end-1);
    } static void swap(char[] s, int a, int b) {

        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}