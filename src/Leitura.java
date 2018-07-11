/*
 * 
 * Author: Heine Melo - <heinemelo@gmail.com>
 *
 */
 
import java.io.File;
import java.util.*;
import org.apache.commons.math3.util.Combinations;

public class Leitura {
	public static int [][] line = new int [1664][15];
	public static void main(String [] args) {

		try {
			Scanner scanner = new Scanner(new File("resultados.txt"));
			int num = 0;
			int lineNum = 0;
			while(scanner.hasNextInt()) {
			    while(lineNum <=1663) {
			    	//System.out.print(lineNum+1 + ": ");
			    	while(num <=14) {
			   			line[lineNum][num] = scanner.nextInt();
			   			//System.out.print(line[lineNum][num] + " ");
			   			num++;
			   		}
			   		num = 0;
					//System.out.print("\n");

					lineNum++;
			    } 
			    
			}
		 
		} catch (Exception fnfe) {
		}
		System.out.println("\n\n\n");

		/* Count how many times each number occours - 
		   THIS CODE IS OK - COMMENTING JUST TO JUMP OVER
		System.out.println("Numero de ocorrencias individual");
		int countO = 0;
		for(int poss = 1; poss <= 25; poss++) {

			for(int numL = 0; numL<=1663; numL++) {
				for (int posO = 0; posO <= 14; posO++) {
						if(poss==line[numL][posO]) {
							countO++;

						}

					}
				}
			System.out.println(poss + ": ---- " + countO);
			countO = 0;

		}
		*/

		/* Count how many times groups of 2 occours
		 * Generating combinations 2x2 of 25
		 */
		Combinations c = new Combinations(26,2);
		List<int[]> lpg2 = new ArrayList<int[]>();
		for(int[] iterate : c){
	        lpg2.add(iterate);
	        //System.out.println(lpg2);
	    }
	    
	    /* THIS CODE IS TO PRINT THE COMBINATIONS
	    for(int[] iterate : lpg2){
	            for(int i=0;i<iterate.length; i++){
	            	//System.out.println()
	            	if(iterate[0] == 0 || iterate[1] == 0) continue;
	            	System.out.print(iterate[i] +" ");    
	        }
	        System.out.println();
	    }
	    */

		System.out.println("\n");
		int countOG2 = 0;
		int countOG2A = 0;
		int poss;
		int countpass = 0;
		System.out.println("Numero de ocorrencias grupos de 2");
		for(int[] iterate : lpg2){ 											//Iterate per pos group 2x2
			if(iterate[0] == 0 || iterate[1] == 0) continue; 				//Prevent to check the possibility of the 0 entry
				for (int posO = 0; posO <= 14; posO++) { 					//Iterate per position 1-15 per line
					for(poss = 1; poss <= 25; poss++) {	 					// Iterate per possibility 1-25
						for(int numL = 0; numL<=1663; numL++) { 			//Iterate per line
							for(int i=0;i<iterate.length; i++){
								if((line[numL][posO]==iterate[0] 
								|| line[numL][posO]==iterate[1])) {
									countOG2++; 							//Count how many times appears one of the 2x2
									//System.out.println(countOG2+ " ");
									if(countOG2==2){
										countOG2A++; 						//Aggregate if both of them appear in the same line
										//System.out.print(countOG2A+ " ");
									}
								}					
							}
						countOG2=0; 										//Zeroes the counter of one the 2x2 appears
						}
						countpass++; 										//Counter lines x possibilities
						if(countpass==375){ 								//Only prints if it is the la
							System.out.println(iterate[0] + " and "
							+ iterate[1] + ": " + countOG2A);
							
						}
						countOG2A=0; 										//Zeroes the counter of aggregate
						//System.out.println(countpass);
					}
				
				}
			//System.out.println(countpass);
			countpass = 0;
			if(iterate[0] == 0 || iterate[1] == 0) continue; 				//Prevent to check the possibility of the 0 entry
			
		}
	}
}