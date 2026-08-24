class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = temp;

           
            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        return names;
    }
}