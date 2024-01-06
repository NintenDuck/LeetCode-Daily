/*
 * Given a string s, find the length of the longest substring
 * without repeating characters
 */

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
        System.out.println(longestSubstring("bbbbb"));
        System.out.println(longestSubstring("pwwkew"));
    }

    private static int longestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - start + 1);

        }
        System.out.println(charIndexMap);

        return maxLength;
    }
}
