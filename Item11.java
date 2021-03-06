package org.algorithm.pointtooffer;

/**
 * 面试题11：数值的整数次方
 * 
 * @author dell
 * 
 */
public class Item11 {
	public static void main(String args[]) {
		int base = 2;
		int exponent_1 = 9;
		int exponent_2 = 10;
		System.out.println("当exponent为奇数：" + power(base, exponent_1));
		System.out.println("当exponent为偶数：" + power(base, exponent_2));
	}

	/**
	 * 整数次方
	 * 
	 * @param base底
	 * @param exponent指数
	 * @return
	 */
	public static double power(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}

		if (exponent == 1) {
			return base;
		}
		if (exponent >> 1 == 0) {// 偶数
			int exponent_1 = exponent >> 1;
			double tmp = power(base, exponent_1);
			return tmp * tmp;
		} else {// 非偶数
			int exponent_2 = exponent - 1;// -1后就是偶数
			double tmp = power(base, exponent_2);
			return tmp * base;// 最后还有先开始减掉的一个base
		}
	}
}
