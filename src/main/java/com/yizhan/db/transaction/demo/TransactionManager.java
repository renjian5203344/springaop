package com.yizhan.db.transaction.demo;

public class TransactionManager {
	public static void beginTransaction(String methodName) {
		System.out.println(methodName + "��ʼ�������!");
	}

	public static void endTransaction(String methodName) {
		System.out.println(methodName + "����������!\n");
	}
}