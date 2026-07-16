class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return n + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
