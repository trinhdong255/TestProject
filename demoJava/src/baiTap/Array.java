package baiTap;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		System.out.print("Nhập mảng: ");
		Scanner sc = new Scanner(System.in); // Muốn nhập dữ liệu khai báo thư viện Scanner
		int n = sc.nextInt();
		int[] myArray = new int [n]; // Khai báo mảng và gọi biến n
		for(int i = 0; i < n; i++) {
			myArray[i] = sc.nextInt(); // Mảng myArray gắn vào biến i để nhập dữ liệu
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j ++) {
				if (myArray[i] > myArray[j]) {
					int change = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = change;
				}
			}
		}
		
		System.out.print("Mảng sau khi đã sắp xếp: ");
		for(int i = 0; i < n; i++) {
			System.out.print(myArray[i] + " ");
		}
		
	}
}
