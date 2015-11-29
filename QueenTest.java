public class QueenTest {
  public static void main(String[] args) {
  		System.out.println("Enter the number of queens and press Enter:");
  		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		in.close();
		
		System.out.println("The results are:");
		Queen.queenResult(number);
  	}
}
