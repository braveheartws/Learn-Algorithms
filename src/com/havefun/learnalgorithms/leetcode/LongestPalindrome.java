package com.havefun.learnalgorithms.leetcode;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */

/**
 * 5. 最长回文子串
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"

 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 */
class LongestPalindrome {
    public String longestPalindrome2(String s) {
        int len = s.length();
        // 如果长度为1的直接返回
        if (len <2) {
            return s;
        }
        int max = 1, begin = 0;
        // 结果保存
        boolean[][] ret = new boolean[len][len];
        // 斜对角的都为true;
        for (int i = 0; i < len; i++) {
            ret[i][i] = true;
        }
        char[] array = s.toCharArray();
        // 字符串最大长度
        for (int L = 2; L <= len; L++) {
            // 字符串左边界
            for (int left = 0; left < len; left++) {
                // 字符串右边界  ? - left + 1= L
                int right = L - 1 + left;
                if (right >= len) {
                    break;
                }
                // 如果第 left ,right不想等那么对应都标记为false;
                if (array[left] != array[right]) {
                    ret[left][right] = false;
                } else {
                    if (right - left < 3) {
                        // 比如aba
                        ret[left][right] = true;
                    } else {
                        // 如果 aba 为true 那么 cabac 也一定为true
                        ret[left][right] = ret[left + 1][right - 1];
                    }
                }
                // 判断最大长度
                if (ret[left][right] && right - left + 1 > max) {
                    max = right - left + 1;
                    // 记录起始位置
                    begin = left;
                }
            }
        }
        return s.substring(begin,begin + max);
    }
}
