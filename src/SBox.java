import java.text.Format;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class SBox {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[4][16];
		
		for(int row = 0;row <matrix.length;row++) {
			
			for(int column = 0;column<matrix[row].length;column++) {
				
				matrix[row][column]= column;
			}
		}
		System.out.print("enter positive integer number: ");
		
		int numFromUser = input.nextInt();
		
		String binaryNum = Integer.toBinaryString(numFromUser);
		
		String sixD= String.format("%6s", binaryNum).replace(" ", "0");
		
		char[] bi = sixD.toCharArray();
		
		System.out.println(Integer.toBinaryString(numFromUser));
		
		System.out.println("the first and sixth digit to determine row in matrix: "+bi[0]+""+bi[5]);
		
		String rowString = String.valueOf(bi[0]+""+bi[5]);
		
		int rowNumber = Integer.parseInt(rowString, 2);
		
		System.out.println("row number in sbox matrix "+rowNumber);
		
		System.out.println("second, third, fourth and fifth number to detrmine column in matrix: "+bi[1]+""+bi[2]+""+bi[3]+""+bi[4]);
		
		String colString =  String.valueOf(bi[1]+""+bi[2]+""+bi[3]+""+bi[4]);
		
		int colNumber = Integer.parseInt(colString, 2);
		
		System.out.println("column number in sbox matrix "+ colNumber);
		
		System.out.println("SBOX number: "+ matrix[rowNumber][colNumber]);
		
		System.out.println("the whole matrix of SBOX\n"+Arrays.deepToString(matrix));
	}
}
