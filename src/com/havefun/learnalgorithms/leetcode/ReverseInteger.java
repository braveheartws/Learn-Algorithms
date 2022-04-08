package com.havefun.learnalgorithms.leetcode;

/**
 * @author : WinterSweett
 * @time : {DATE}
 *
 * 7. 整数反转
 */

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *
 * 提示：
 *
 * -231 <= x <= 231 - 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseInteger {
    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            // 当已经大于了最大值/10 和 小于了最小值/10 肯定就会溢出
            if(ret > Integer.MAX_VALUE / 10 || ret < Integer.MIN_VALUE /10) {
                return 0;
            }
            int digit = x % 10;
            ret = ret * 10 + digit;
            x /= 10;
        }
        return ret;
    }
}
