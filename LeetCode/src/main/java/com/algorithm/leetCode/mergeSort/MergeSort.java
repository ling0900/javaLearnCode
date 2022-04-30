package com.algorithm.leetCode.mergeSort;

/**
 *@Author: lh
 *@CreateTime: 2022-04-27  15:33
 *@Description: TODO
 *@Version: 1.0
 */
public class MergeSort {
    
    
    /**
     * @author�� lh
     * @date�� 2022/4/27 15:42
     * @description�� �ݹ鴦��������һ������֣�ֱ�����Ҷ��ǵ������顣L����������
     * @modified By��
     * @version:
     */
    private static void divideArr(int indexL, int indexR, int[] arr) {
        
        // �߽��ж�
        if (indexL == indexR) {
            return;
        }
        
        // ����ߵķ��飬Ҫ�ҵ�����Ľ�ֹ����λ�á�
        // int M = L + (R - L) / 2;
        int indexM = indexL + (indexR - indexL) >> 2;
        divideArr(indexL, indexM, arr);
        // ���ұߵķ��飬ע��߽����⡣
        divideArr(indexM + 1, indexR, arr);
        // �����Һϲ���������ʱarr�Ѿ���һ�����Ҷ���������������ˡ�
        merge(arr, indexL, indexM, indexR);
    }
    
    private static void merge(int[] arr, int indexL, int indexM, int indexR) {
        
        // ����һ���������飬�洢�ź�������顣
        int[] tempArr = new int[indexR + 1 - indexL];
        
        // ������������ĸ���ָ��
        int pL = indexL;
        int pR = indexM + 1;
        int index = 0;
        
        // ��ʼ�ϲ�����while�ȽϺ��ʡ������߸���ָ�붼û��Խ������Ƚϡ�����һ��Ҫ�����ȵķ�˭����
        while (pL <= indexM && pR <= indexR) {
            tempArr[index++] = arr[pL] <= arr[pR] ? arr[pL++] : arr[pR++];
        }
        
        //Ҫô������Խ��
        while (pR <= indexR) {
            tempArr[index++] = arr[pR++];
        }
        //Ҫô������Խ��
        while (pL <= indexM) {
            tempArr[index++] = arr[pL++];
        }
        
        // �����������ֵ��copy��ԭ���������С���ʵ���޸�ԭ���������ֵ��������copy����ʵ����Ĳ����ǣ���-����-�ϡ�
        for (int i = 0; i < tempArr.length; i++) {
            arr[indexL + i] = tempArr[i];
        }
    }
    
}
