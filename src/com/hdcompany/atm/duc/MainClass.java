package com.hdcompany.atm.duc;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ChucNang chucNang = new ChucNang();
		Scanner scanner = new Scanner(System.in);
		int soDu = 1000;

		System.out.println("Vui lòng nhập mật khẩu: ");
		int matKhauNhap = scanner.nextInt();
		// ...
		if (chucNang.kiemTramatKhau(matKhauNhap) == true) {
			chucNang.chucNangATM(soDu);
		} else {
			System.out.println("Vui lòng nhập lại");
		}
	}

}
