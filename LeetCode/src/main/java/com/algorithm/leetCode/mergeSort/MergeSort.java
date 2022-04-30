package com.algorithm.leetCode.mergeSort;

/**
 *@Author: lh
 *@CreateTime: 2022-04-27  15:33
 *@Description: TODO
 *@Version: 1.0
 */
public class MergeSort {
    
    
    /**
     * @author： lh
     * @date： 2022/4/27 15:42
     * @description： 递归处理，将数组一步步拆分，直至左右都是单个数组。L，是索引。
     * @modified By：
     * @version:
     */
    private static void divideArr(int indexL, int indexR, int[] arr) {
        
        // 边界判断
        if (indexL == indexR) {
            return;
        }
        
        // 将左边的分组，要找到这里的截止索引位置。
        // int M = L + (R - L) / 2;
        int indexM = indexL + (indexR - indexL) >> 2;
        divideArr(indexL, indexM, arr);
        // 将右边的分组，注意边界问题。
        divideArr(indexM + 1, indexR, arr);
        // 将左右合并起来，此时arr已经是一个左右都单独有序的数组了。
        merge(arr, indexL, indexM, indexR);
    }
    
    private static void merge(int[] arr, int indexL, int indexM, int indexR) {
        
        // 定义一个辅助数组，存储排好序的数组。
        int[] tempArr = new int[indexR + 1 - indexL];
        
        // 定义左右数组的辅助指针
        int pL = indexL;
        int pR = indexM + 1;
        int index = 0;
        
        // 开始合并，用while比较合适。当两边辅助指针都没有越界才作比较。这里一定要想好相等的放谁。左！
        while (pL <= indexM && pR <= indexR) {
            tempArr[index++] = arr[pL] <= arr[pR] ? arr[pL++] : arr[pR++];
        }
        
        //要么左数组越界
        while (pR <= indexR) {
            tempArr[index++] = arr[pR++];
        }
        //要么右数组越界
        while (pL <= indexM) {
            tempArr[index++] = arr[pL++];
        }
        
        // 将辅助数组的值’copy‘原来的数组中。其实是修改原来数组的数值，不算是copy。其实上面的步骤是：分-排序-合。
        for (int i = 0; i < tempArr.length; i++) {
            arr[indexL + i] = tempArr[i];
        }
    }
    
}
