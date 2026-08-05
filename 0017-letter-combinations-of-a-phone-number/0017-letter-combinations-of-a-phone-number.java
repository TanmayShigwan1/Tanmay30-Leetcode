import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return helper("", digits);
    }

    static List<String> helper(String p, String up) {

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        List<String> ans = new ArrayList<>();

        int start;
        int end;

        if (digit < 7) {
            start = (digit - 2) * 3;
            end = start + 3;
        } else if (digit == 7) {
            start = 15;
            end = 19;
        } else if (digit == 8) {
            start = 19;
            end = 22;
        } else { // digit == 9
            start = 22;
            end = 26;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(helper(p + ch, up.substring(1)));
        }

        return ans;
    }
}