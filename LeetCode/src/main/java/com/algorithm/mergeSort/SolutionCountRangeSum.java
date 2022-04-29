package com.algorithm.mergeSort;

/**
 *@Author: lh
 *@CreateTime: 2022-04-28  21:38
 *@Description: �Ȳ�������͵ĸ��Ӷ� ֱ�� ���������� N����
 *@Version: 1.0
 */
public class SolutionCountRangeSum {
	public int countRangeSum(int[] nums, int lower, int upper) {
		return -1;
	}
	
	
	
	/**
	 * @author�� lh
	 * @date�� 2022/4/29 14:41
	 * @description�� ����S(i, j)
	 * @modified By��
	 * @version:
	 */
	public int sumSij(int i, int j, int[] nums) {
		if (i > j) {
			return -1;
		}
		if (i == j) {
			return sumSi(nums, j);
		}
		return sumSi(nums, j) + nums[i] - sumSi(nums, i);
	}
	
	/**
	 * @author�� lh
	 * @date�� 2022/4/29 14:36
	 * @description�� �� S(0,j),���Կ�����S(i)��
	 * @modified By��
	 * @version:
	 */
	public int sumSi(int[] nums, int i) {
		if (nums == null || nums.length == 0 || i >= nums.length) {
			return -1;
		}
		
		if (nums.length == 1) {
			return nums[0];
		}
		
		int[] res = new int[nums.length];
		
		res[0] = nums[0];
		
		for (int j = 1; j < nums.length; j++) {
			res[j] = nums[j] + res[j -1];
		}
		
		return res[i];
	}
	
	/**
	 * @author�� lh
	 * @date�� 2022/4/29 14:36
	 * @description�� �� S(0,j),�ŵ�һ�������ڡ�
	 * @modified By��
	 * @version:
	 */
	public int[] sumSi(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return nums;
		}
		
		int[] res = new int[nums.length];
		res[0] = nums[0];
		
		for (int j = 1; j < nums.length; j++) {
			res[j] = nums[j] + res[j -1];
		}
		
		return res;
	}
	
}
