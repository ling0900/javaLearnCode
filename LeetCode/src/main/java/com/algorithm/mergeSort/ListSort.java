package com.algorithm.mergeSort;

/**
 *@Author: lh
 *@CreateTime: 2022-04-27  17:36
 *@Description: TODO
 *@Version: 1.0
 */
public class ListSort {
	
	public class ListNode {
		int val;
		ListNode next;
		
		public ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	//1.将整个链表对半分为左右
	public ListNode divSort(ListNode head) {
		if (head.next == null) {
			return head;
		}
		
		// 准备断开的节点
		ListNode p = head;
		// 分好的右边节点
		ListNode R = head;
		// 临时节点，就是个快指针。
		ListNode temp = head;
		
		// 注意这里的边界问题
		while (temp !=null && temp.next != null) {
			// R每次移动一个位置，temp动两个，到头后，R就来到了右边分组的头节点。
			p = R;
			R = R.next;
			temp = temp.next.next;
		}
		
		//要断开，数组不需要断开，链表需要断开。
		p.next = null;
		ListNode LNode = divSort(head);
		ListNode RNode = divSort(R);
		
		// merge
		return mergeNode(LNode, RNode);
	}
	
	public ListNode mergeNode(ListNode L, ListNode R) {
		
		if(L == R) {return L;}
		
		
		// 定义一个node，用于返回最后的结果
		// ListNode resultHead = null;
		ListNode resNodeHead = new ListNode(1);
		
		// 定义辅助节点
		ListNode temp = resNodeHead;
		
		
		while (L != null && R != null) {
			if (L.val <= R.val) {
				// 指针的下个node指向L
				temp.next = L;
				// 移动到自己的下一个node！
				// temp = L;
				temp = temp.next;
				L = L.next;
			} else {
				temp.next = R;
				temp = temp.next;
				R = R.next;
			}
		}
		
		if (L == null) {
			temp.next = R;
		}
		
		if (R == null) {
			temp.next = L;
		}
		
		return resNodeHead.next;
		
	}
}
