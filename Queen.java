import java.util.Scanner;

public class Queen {
	private static int[] queen;
	private static int queenNumber;
	private static int rowNum = 1;
	
	public static void queenResult(int number) {
		
		label:
		while (rowNum >= 0) {			
			if (queen[rowNum] < number)
				queen[rowNum]++;
			else {
				rowNum--;
				continue;
			}
			
			while (queen[rowNum] < number) {				
				if  (!canBePlaced(rowNum)) {
					queen[rowNum]++;
					continue;
				}
				
				if (queen[rowNum] < number) {
					if (rowNum == number - 1) {
						for (int i = 0; i < number; i++) 
							System.out.printf("%d ", queen[i] + 1);
						
						System.out.println();
						
						queen[rowNum]++;
						continue;
					}
					else {
						rowNum++;
						queen[rowNum] = 0;
						continue;
					}
				}
				else {
					rowNum--;
					continue label;
					}				
			}
		}
	}
	
	public static boolean canBePlaced(int row) {
		int i = 0;
		while (i < row) {
			if (queen[i] == queen[row] || Math.abs(row - i) == Math.abs(queen[row] - queen[i]))
				return false;
			
			i++;
			}
		
		return true;		
	}
}
