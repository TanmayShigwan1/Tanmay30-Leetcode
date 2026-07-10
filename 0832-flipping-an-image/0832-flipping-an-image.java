class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {

     
        for (int row = 0; row < arr.length; row++) {
            int left = 0;
            int right = arr[row].length - 1;

            while (left < right) {
                int temp = arr[row][left];
                arr[row][left] = arr[row][right];
                arr[row][right] = temp;

                left++;
                right--;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 0) {
                    arr[row][col] = 1;
                } else {
                    arr[row][col] = 0;
                }
            }
        }

        return arr;
    }
}