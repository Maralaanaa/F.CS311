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
	public void addGrade(String grade) throws InvalidGradeException {
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
			throw new InvalidGradeException("Buruu orolt bn" + grade);
		}
		// If grade doesn't match a valid grade, throw an InvalidGradeException
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
					gm.addGrade(input2);

				} else if (input.equals("print")) {
					gm.printHistogram();
				} else if (input.equals("exit")) {
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}