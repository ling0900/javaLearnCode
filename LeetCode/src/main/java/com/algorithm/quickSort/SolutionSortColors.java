package com.algorithm.quickSort;
/**
 *@Author: lh
 *@CreateTime: 2022-04-29  15:55
 *@Description: https://leetcode-cn.com/problems/sort-colors/
 * 只有0、1、2
 *@Version: 1.0
 */
public class SolutionSortColors {
	public static void main(String[] args) {
		int[] test = {2,0,1};
		sortColors(test);
	}
	
	
	
	/**
	 * @author： lh
	 * @date： 2022/4/29 17:03
	 * @description： LeetCode上超时了，因为边界导致的，现在的代码没有问题。
	 * {|2p,0,2,1,1,0q}
	 * {|0p,0,2,1,q1,2}
	 * {0|,0p,2,1,1q,2}
	 * {0,0|,2p,1,1q,2}
	 * {0,0|,1p,1q,2,2}
	 * {0,0|,1,1pq,2,2}
	 * @modified By：
	 * @version:
	 */
	public static void sortColors(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}
		// 先定义2个指针，一个区域标志
		int p = 0;
		int q = nums.length - 1;
		int r = -1;
		int tem = 0;
		// 注意这里的边界问题，还有，必须是两个指针，左右指针！
		while (p <= q) {
			// 如果当前数比目标小，则移动指针往下走一位，区域走下一位
			if (nums[p] < 1) {
				tem = nums[r + 1];
				nums[r + 1] = nums[p];
				nums[p] = tem;
				r ++;
				p ++;
				continue;
			}
			// 如果相等，区域不动，移动指针下一位
			if (nums[p] == 1) {
				p ++;
				continue;
			}
			// 如果大于1，则和下一位交换
			if (nums[p] > 1) {
				tem = nums[p];
				nums[p] = nums[q];
				nums[q] = tem;
				q --;
				continue;
			}
		}
		return;
	}
}
