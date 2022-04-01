package example;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		try {
			Queue q = new Queue(10);
			Scanner sc = new Scanner(System.in);
			int dt = 0;
			System.out.println("1.Hooson esehiig shalgah\n2.Daraalliin urtiig oloh"
					+ "\n3.Daraalald utga nemeh\n4.Daraalliin utguudiig hevleh"
					+ "\n5.Daraalald utga hasah\n6.Daraalliin hamgiin urd taliin utgiig hevleh \\n\\nComanduudaas songoj oruulna uu!!!");
			System.out.println("Ta commandaa oruulna uu");
			int ch = sc.nextInt();
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
					for (int i = 0; i <= q.size(); i++) {
						System.out.println(i + "deh utgiig oruulna uu");
						dt = sc.nextInt();
						q.queueEnqueue(dt);
					}
					System.out.println("Daraalald oruulsan utguud amjilttai nemegdlee.");
					break;
				case 4:
					q.queueDisplay();
					break;
				case 5:
					q.queueDequeue();
					q.queueDisplay();
					System.out.println("Daraallaas utguud amjilttai hasagdlaa");
					break;
				case 6:
					q.queueFront();
					System.out.println("Daraalliin hamgiin urd taliin utgiig haruullaa.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Aldaa garlaa!!!");
		}

//		Queue q = new Queue(4);
//
//		// print Queue elements
//		q.queueDisplay();
//
//		// inserting elements in the queue
//		q.queueEnqueue(20);
//		q.queueEnqueue(30);
//		q.queueEnqueue(40);
//		q.queueEnqueue(50);
//
//		// print Queue elements
//		q.queueDisplay();
//
//		// insert element in the queue
//		q.queueEnqueue(60);
//
//		// print Queue elements
//		q.queueDisplay();
//
//		q.queueDequeue();
//		q.queueDequeue();
//		System.out.printf("\n\nafter two node deletion\n\n");
//
//		// print Queue elements
//		q.queueDisplay();
//
//		// print front of the queue
//		q.queueFront();
	}

}
