package lab4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * A GradeManager will create a command-line prompt that will let someone add
 * grades and display grades in histogram format.
 * 
 */

public class GradeManager {

	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade, Integer> allGrades;

	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade, Integer>();

		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}

	/**
	 * Adds grade to this GradeManager.
	 * 
	 * @param grade - grade to add to this grad manager
	 */

//	public void addNumGrade(int medku) {
//		medku = 0;
//		if (medku > 90 && 100 >= medku) {
//			allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
//		} else if (medku > 80 && medku <= 90) {
//			allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
//		}
//
//	}

	public void addGrade(String grade) throws InvalidGradeException {
		try {
			int q, e = 0, r = 0, t = 0, y = 0, u = 0;
			if (Integer.parseInt(grade) <= 100 && Integer.parseInt(grade) >= 0) {
				q = Integer.parseInt(grade);

				if (90 < q && q <= 100) {
					e = q;
				} else if (80 < q && q <= 90) {
					r = q;
				} else if (70 < q && q <= 80) {
					t = q;
				} else if (60 < q && q <= 70) {
					y = q;
				} else {
					u = q;
				}
			}
			if (grade.equals(Integer.toString(e))) {
				allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
			} else if (grade.equals(Integer.toString(r))) {
				allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
			} else if (grade.equals(Integer.toString(t))) {
				allGrades.put(LetterGrade.C, this.allGrades.get(LetterGrade.C) + 1);
			} else if (grade.equals(Integer.toString(y))) {
				allGrades.put(LetterGrade.D, this.allGrades.get(LetterGrade.D) + 1);
			} else if (grade.equals(Integer.toString(u))) {
				allGrades.put(LetterGrade.F, this.allGrades.get(LetterGrade.F) + 1);
			} else {
				throw new InvalidGradeException("Buruu orolt bn" + " " + grade);
			}
		} catch (Exception e) {
			if (grade.equals("a") || grade.equals("A")) {
				allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
			} else if (grade.equals("b") || grade.equals("B")) {
				allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
			} else if (grade.equals("c") || grade.equals("C")) {
				allGrades.put(LetterGrade.C, this.allGrades.get(LetterGrade.C) + 1);
			} else if (grade.equals("d") || grade.equals("D")) {
				allGrades.put(LetterGrade.D, this.allGrades.get(LetterGrade.D) + 1);
			} else if (grade.equals("f") || grade.equals("F")) {
				allGrades.put(LetterGrade.F, this.allGrades.get(LetterGrade.F) + 1);
			} else {
				throw new InvalidGradeException("Buruu orolt bn" + " " + grade);
			}
		}

//		if (grade.equals("a") || grade.equals("A")) {
//			allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
//		} else if (grade.equals("b") || grade.equals("B")) {
//			allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
//		} else if (grade.equals("c") || grade.equals("C")) {
//			allGrades.put(LetterGrade.C, this.allGrades.get(LetterGrade.C) + 1);
//		} else if (grade.equals("d") || grade.equals("D")) {
//			allGrades.put(LetterGrade.D, this.allGrades.get(LetterGrade.D) + 1);
//		} else if (grade.equals("f") || grade.equals("F")) {
//			allGrades.put(LetterGrade.F, this.allGrades.get(LetterGrade.F) + 1);
//		} else {
//			throw new InvalidGradeException("Buruu orolt bn" + " " + grade);
//		}
		// If grade doesn't match a valid grade, throw an InvalidGradeException
//		else {
//			if (grade.equals("a") || grade.equals("A")) {
//				allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
//			} else if (grade.equals("b") || grade.equals("B")) {
//				allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
//			} else if (grade.equals("c") || grade.equals("C")) {
//				allGrades.put(LetterGrade.C, this.allGrades.get(LetterGrade.C) + 1);
//			} else if (grade.equals("d") || grade.equals("D")) {
//				allGrades.put(LetterGrade.D, this.allGrades.get(LetterGrade.D) + 1);
//			} else if (grade.equals("f") || grade.equals("F")) {
//				allGrades.put(LetterGrade.F, this.allGrades.get(LetterGrade.F) + 1);
//			} else {
//				throw new InvalidGradeException("Buruu orolt bn" + " " + grade);
//			}
//		}
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		System.out.println(this.getHistString());
		// throw new RuntimeException("GradeManger.printHistogram() not yet
		// implemented!");
	}

	/**
	 * Returns a string representation of the histogram of the grades.
	 * 
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {

		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append(gl + ":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();

	}

	/**
	 * Simple loop that accepts 3 commands from System.in: add <some grade> : for
	 * example, "add a" or "add b" adds the given grade to the GradeManager print :
	 * prints out all the grades in this GradeManager in a histogram format exit :
	 * exits the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			GradeManager gm = new GradeManager();

			BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Starting the grade manager");

			while (true) {
				String input = cin.readLine();
				if (input.startsWith("add")) {
					String input2 = cin.readLine();
//					if (0 <= Integer.parseInt(input2) && Integer.parseInt(input2) <= 100) {
//						gm.addNumGrade(Integer.parseInt(input2));
//
//					} else {
					gm.addGrade(input2);

//					}
				} else if (input.equals("print")) {
					gm.printHistogram();
				} else if (input.equals("exit")) {
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("h" + ex.getMessage());
		}

	}
}