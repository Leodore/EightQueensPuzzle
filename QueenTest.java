public class QueenTest {
  public static void main(String[] args) {
  	System.out.println("Enter the number of queens and press Enter:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		System.out.println("The results are:");
		Queen.queenResult(number);
  	}
}
