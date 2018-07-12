/*
 * 
 * Author: Heine Melo - <heinemelo@gmail.com>
 *
 */
 
import java.util.*;
import org.apache.commons.math3.util.Combinations;

public class LotoAnalysis {
	public static int [][] line = new int [1664][15];
	public static void main(String [] args) {
	Input inputFile = new Input();
		try {
			inputFile.readFile();
		} catch (Exception fnfe) {
		}
		System.out.println("\n\n");
		
		Count counter = new Count();
		counter.counterIndividual(inputFile);

		CombiNumbers cn = new CombiNumbers();
		cn.generateCombinations(2);
		cn.printCombinations(2);
		
		System.out.println("\n");
		
		counter.counterGroupOf2(inputFile, cn);
		
	}
}