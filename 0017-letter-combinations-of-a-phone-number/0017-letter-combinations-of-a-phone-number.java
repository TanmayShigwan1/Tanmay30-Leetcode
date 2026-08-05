import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        return helper("", digits, map);
    }

    static List<String> helper(String p, String up, String[] map) {

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        String letters = map[digit];

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            ans.addAll(helper(p + letters.charAt(i), up.substring(1), map));
        }

        return ans;
    }
}