package com.hdcompany.atm.duc;

import java.util.Scanner;

public class ChucNang {

	public boolean kiemTramatKhau(int matKhau) {
		int matKhauDung = 25012002;

		// ...
		if (matKhau == matKhauDung) {
			return true;
		}
		return false;
		// ...

	}

	public void chucNangATM(int soDu) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("MENU");

		System.out.println("1. Rút tiền");
		System.out.println("2. Kiểm tra số dư");
		System.out.print("Nhập vào lựa chọn: ");
		int key = scanner.nextInt();
		// ...
		switch (key) {
		case 1: {

			System.out.println("MENU");
			System.out.println("1. Rút 100k");
			System.out.println("2. Rút 200k");
			System.out.print("Nhập vào lựa chọn: ");
			int key1 = scanner.nextInt();

			// ....
			switch (key1) {
			case 1: {// 100k
				System.out.println("Bạn vừa rút thành công 100K" + " - Số dư hiện tại còn: " + (soDu - 100));
				break;
			}
			case 2: {// 200k
				System.out.println("Bạn vừa rút thành công 200K" + " - Số dư hiện tại còn: " + (soDu - 200));
				break;
			}

			default:
				System.out.println("Mời nhập lại lựa chọn");
				break;
			}
			break;
			// ...

		}

		case 2: {
			System.out.println("Số dư của bạn là: " + soDu);
			break;

		}
		default:
			System.out.println("Mời nhập lại lựa chọn");
			break;

		}

	}

}
