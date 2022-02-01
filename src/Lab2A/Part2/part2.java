package Lab2A.Part2;

public class part2 {

	public static final char[] answerKey = {'B', 'D', 'A', 'A', 'C', 'D', 'A', 'B', 'C', 'A', 'B', 'C', 'D', 'A', 'B'};
	public static final char[] input1 = {'B', 'D', 'A', 'B', 'C', 'D', 'A', 'B', 'B', 'A', 'B', 'C', 'D', 'A', 'C'};
	//public static final char[] input1 = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};

	public static int totalCorrectAnswers(char[] answers) {
		int result = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == answerKey[i]) result++;
		}
		return result;
	}
	
	public static int totalIncorrectAnswers(char[] answers) {
		int result = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] != answerKey[i]) result++;
		}
		return result;
	}
	
	public static int[] questionNumbersMissed(char[] answers) { 
		int[] result = new int[totalIncorrectAnswers(answers)];
		int iter = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] != answerKey[i]) result[iter++] = i+1;
		}
		return result;
	}

	public static boolean passed(char[] answers) {
		if(totalCorrectAnswers(answers) >= 12) return true;
		return false;
	}
	
	public static void main(String[] args) {		
		System.out.printf("Total Correct answers: %d\n", totalCorrectAnswers(input1));
		System.out.printf("Total Incorrect Answers: %d\n", totalIncorrectAnswers(input1));
		
		System.out.print("Questions student answered wrong: ");
		int[] missedNums = questionNumbersMissed(input1);
		for(int i= 0; i < missedNums.length; i++) {
			System.out.printf("%d ", missedNums[i]);
		}
		System.out.println("");
		
		if(passed(input1)) System.out.println("Student Passed.");
		else System.out.println("Student did not pass.");
		
	}
}