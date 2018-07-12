/*
 * 
 * Author: Heine Melo - <heinemelo@gmail.com>
 *
 */
 
import java.io.File;
import java.util.*;

public class Input {
	public static int [][] line = new int [1664][15];

	void readFile() throws Exception {
		Scanner scanner = new Scanner(new File("resultados.txt"));
		int num = 0;
		int lineNum = 0;
		while(scanner.hasNextInt()) {
		    while(lineNum <=1663) {
		    	while(num <=14) {
		   			line[lineNum][num] = scanner.nextInt();
		   			num++;
		   		}
		   		num = 0;
				lineNum++;
		    } 
		}
	}
}