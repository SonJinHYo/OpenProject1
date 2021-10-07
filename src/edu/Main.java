/**
 * 
 */
package edu;

import java.util.Scanner;

/**
 * @author 손진효
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//변수  선언
		int firstNo,secondNo;
		int sum;
		
		//변수 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오 : ");
		firstNo = scan.nextInt();
		
		System.out.print("두번째 수를 입력하시오 : ");
		secondNo = scan.nextInt();
		
		
		//합계내기
		sum = firstNo + secondNo;
		
		//합계 출력하기
		System.out.print("입력한 두 수의 합계 : "+sum);
		

	}

}
 