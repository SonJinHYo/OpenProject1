/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author ����ȿ
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//����  ����
		int firstNo,secondNo;
		int sum;
		
		//���� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		firstNo = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		secondNo = scan.nextInt();
		
		
		//�հ賻��
		sum = firstNo + secondNo;
		
		//�հ� ����ϱ�
		System.out.print("�Է��� �� ���� �հ� : "+sum);
		

	}

}
 