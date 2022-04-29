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
	
	//1.����������԰��Ϊ����
	public ListNode divSort(ListNode head) {
		if (head.next == null) {
			return head;
		}
		
		// ׼���Ͽ��Ľڵ�
		ListNode p = head;
		// �ֺõ��ұ߽ڵ�
		ListNode R = head;
		// ��ʱ�ڵ㣬���Ǹ���ָ�롣
		ListNode temp = head;
		
		// ע������ı߽�����
		while (temp !=null && temp.next != null) {
			// Rÿ���ƶ�һ��λ�ã�temp����������ͷ��R���������ұ߷����ͷ�ڵ㡣
			p = R;
			R = R.next;
			temp = temp.next.next;
		}
		
		//Ҫ�Ͽ������鲻��Ҫ�Ͽ���������Ҫ�Ͽ���
		p.next = null;
		ListNode LNode = divSort(head);
		ListNode RNode = divSort(R);
		
		// merge
		return mergeNode(LNode, RNode);
	}
	
	public ListNode mergeNode(ListNode L, ListNode R) {
		
		if(L == R) {return L;}
		
		
		// ����һ��node�����ڷ������Ľ��
		// ListNode resultHead = null;
		ListNode resNodeHead = new ListNode(1);
		
		// ���帨���ڵ�
		ListNode temp = resNodeHead;
		
		
		while (L != null && R != null) {
			if (L.val <= R.val) {
				// ָ����¸�nodeָ��L
				temp.next = L;
				// �ƶ����Լ�����һ��node��
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
