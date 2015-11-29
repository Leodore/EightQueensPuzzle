public class QueenTest {
  public static void main(String[] args) {
  		System.out.println("Enter the number of queens and press Enter:");
  		
  		Scanner in = new Scanner(System.in);
  		queenNumber = in.nextInt();
  		in.close();
  		
  		System.out.println("The results are:");
  		
  		queen = new int[queenNumber];
  		queenResult(queenNumber);
  	}
}
