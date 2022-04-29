package com.algorithm.quickSort;
/**
 *@Author: lh
 *@CreateTime: 2022-04-29  15:55
 *@Description: https://leetcode-cn.com/problems/sort-colors/
 * ֻ��0��1��2
 *@Version: 1.0
 */
public class SolutionSortColors {
	public static void main(String[] args) {
		int[] test = {2,0,1};
		sortColors(test);
	}
	
	
	
	/**
	 * @author�� lh
	 * @date�� 2022/4/29 17:03
	 * @description�� LeetCode�ϳ�ʱ�ˣ���Ϊ�߽絼�µģ����ڵĴ���û�����⡣
	 * {|2p,0,2,1,1,0q}
	 * {|0p,0,2,1,q1,2}
	 * {0|,0p,2,1,1q,2}
	 * {0,0|,2p,1,1q,2}
	 * {0,0|,1p,1q,2,2}
	 * {0,0|,1,1pq,2,2}
	 * @modified By��
	 * @version:
	 */
	public static void sortColors(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}
		// �ȶ���2��ָ�룬һ�������־
		int p = 0;
		int q = nums.length - 1;
		int r = -1;
		int tem = 0;
		// ע������ı߽����⣬���У�����������ָ�룬����ָ�룡
		while (p <= q) {
			// �����ǰ����Ŀ��С�����ƶ�ָ��������һλ����������һλ
			if (nums[p] < 1) {
				tem = nums[r + 1];
				nums[r + 1] = nums[p];
				nums[p] = tem;
				r ++;
				p ++;
				continue;
			}
			// �����ȣ����򲻶����ƶ�ָ����һλ
			if (nums[p] == 1) {
				p ++;
				continue;
			}
			// �������1�������һλ����
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
