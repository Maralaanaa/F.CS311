package lab1q;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int ch;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Daraalliin hemjeeg oruulna uu: ");
			int z = sc.nextInt();
			Queue q = new Queue(z);
			int dt = 0;
			System.out.println("1.Hooson esehiig shalgah\n2.Daraalliin urtiig oloh\n3.Daraalald utga nemeh\n4.Daraalliin utguudiig hevleh\n5.Daraallaas utga hasah\n6.Daraalliin hamgiin urd taliin utgiig hevleh \nCommanduudaas songoj oruulna uu!!!");
			System.out.println("Ta commandaa oruulna uu");
			ch = sc.nextInt();
			while (ch != 0) {
				switch (ch) {
				case 1:
					if (q.isEmpty()) {
						System.out.println("Daraalald nemegdsen utga alga.");
					} else {
						System.out.println("Daraalald utga hadgalaastai baina");
					}
					break;
				case 2:
					int sz = q.size();
					System.out.println("Daraalliin urt: " + sz);
					break;
				case 3:
					for (int i = 1; i <= q.size(); i++) {
						System.out.println(i + " deh utgiig oruulna uu");
						dt = sc.nextInt();
						q.queueEnqueue(dt);
					}
					System.out.println("Daraalald oruulsan utguud amjilttai nemegdlee.");
					break;
				case 4:
					q.queueDisplay();
					break;
				case 5:
					System.out.println("Heden utga hasahaa oruulna uu: ");
					int j = sc.nextInt();

					for (int i = 1; i <= j; i++) {
						q.queueDequeue();
					}
					q.queueDisplay();
					System.out.println("Daraallaas utguud amjilttai hasagdlaa");
					break;
				case 6:
					q.queueFront();

					System.out.println("\nDaraalliin hamgiin urd taliin utgiig haruullaa.");

					break;
				default:
					System.out.println("comand:3");
				}
				System.out.print("\nSongolt :");
				ch = sc.nextInt();
			}

		} catch (Exception e) {
			System.out.println("Aldaa garlaa!!!");
		}

	}
}
