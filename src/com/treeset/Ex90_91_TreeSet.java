package com.treeset;

import java.util.TreeSet;

public class Ex90_91_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("001");
		tree.add("002");
		tree.add("003");
		tree.add("004");
		tree.add("005");
		tree.add("003"); //�ظ�Ԫ�أ�δ������
		System.out.println("�������е�Ԫ�طֱ�Ϊ��" + tree); //��������е�Ԫ��
		System.out.println("�������е�Ԫ�ظ���Ϊ��" + tree.size()); //���Ԫ�ظ���
		
	}

}
