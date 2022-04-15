package lab1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cmd, a;
		int[] arr = new int[10];
		ArrayLinearList array = new ArrayLinearList();
		try {
			System.out.println("1.Hooson esehiig shalgah\n2.Jagsaaltiin urtiig oloh"
					+ "\n3.Jagsaaltand utga nemeh\n4.Jagsaaltiin utguudiig hevleh"
					+ "\n5.Jagsaaltaas utga hasah\n6.Jagsaaltaas indexeer utga haih"
					+ "\n7.Jagsaaltaas elementeer utga haih \n\nComanduudaas songoj oruulna uu!!!");
			System.out.println("Ta commandaa oruulna uu");
			cmd = scan.nextInt();
			while (cmd != 0) {
				switch (cmd) {
				case 1:
					if (array.empty()) {
						System.out.println("Jagsaalt hooson baina.");
					} else {
						System.out.println("Jagsaalt hooson bish baina.");
					}
					break;
				case 2:
					int size;
					size = array.size();
					System.out.println("Jagsaaltiin urt:" + size);
					break;
				case 3:
					System.out.print("Nemeh utga :");
					a = scan.nextInt();
					array.add(arr, a);
					System.out.println("Oruulsan utga amjilttai nemegdlee.");
					break;
				case 4:
					array.print(arr);
					break;
				case 5:
					int i;
					System.out.println("Heddugeer indexiin utgiig hasahaa oruulna uu :");
					i = scan.nextInt();
					array.remove(arr, i);
					break;
				case 6:
					int j;
					System.out.println("Indexiin utgaa oruulna uu : ");
					j = scan.nextInt();
					System.out.println("Oruulsan indexd tohiroh element : " + array.getElement(arr, j));
					break;
				case 7:
					int k;
					System.out.println("Elementiin utgaa oruulna uu : ");
					k = scan.nextInt();
					System.out.println("Oruulsan elementiin index ni : " + array.getIndex(arr, k));
					break;

				default:
					System.out.println("1-4 iin hoorond comand oruulna uu!");

				}
				System.out.print("\nComand :");
				cmd = scan.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Buruu baina!");
		}

	}

	//
}