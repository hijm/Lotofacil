//package Lotofacil;
import java.util.Scanner;
import java.io.File;
import java.util.*;
import org.apache.commons.math3.util.Combinations;

//import java.util.Combinations;
public class Leitura {
	public static int [][] line = new int [1664][15];
	public static void main(String [] args) {


    //Collections.sort(lpg2,Comparator.comparing((int[] arr)->arr[0]));
	//int [][] g2; 
	/*
	for(int it = 1; it<=25; it++) {
		//System.out.println(c.iterator().next());
		//System.out.println(c.comparator());

	}
	*/	
	try {
		Scanner scanner = new Scanner(new File("resultados.txt"));
		int num = 0;
		int lineNum = 0;
		while(scanner.hasNextInt()) {
		    while(lineNum <=1663) {
		    	System.out.print(lineNum+1 + ": ");
		    	while(num <=14) {
		   			line[lineNum][num] = scanner.nextInt();
		   			System.out.print(line[lineNum][num] + " ");
		   			num++;
		   		}
		   		num = 0;
				System.out.print("\n");

				lineNum++;
		    } 
		    
		}
	 
	} catch (Exception fnfe) {

	}

	System.out.println("\n\n\n");


	// Count how many times each number occours
	int countO = 0;
	for(int poss = 1; poss <= 25; poss++) {

		for(int numL = 0; numL<=1663; numL++) {
			for (int posO = 0; posO <= 14; posO++) {
					if(poss==line[numL][posO]) {
						countO++;

					}

				}
			}
		System.out.println(poss + ": " + countO);
		countO = 0;

	}


	//Count how many times groups of 2 occours

	//Generating combinations 2x2 of 25
	Combinations c = new Combinations(25,2);
	List<int[]> lpg2 = new ArrayList<int[]>();
	for(int[] iterate : c){
        lpg2.add(iterate);
        //System.out.println(lpg2);
    }
    
    for(int[] iterate : lpg2){
            for(int i=0;i<iterate.length; i++){
            	System.out.print(iterate[i] +" ");    
        }
        System.out.println();
    }

	


	System.out.println("\n");
	int countOG2 = 0;
	int countOG2A = 0;
	int poss;

	for(int numL = 0; numL<=1663; numL++) {
		for (int posO = 0; posO <= 14; posO++) {
			for(poss = 1; poss <= 25; poss++) {	
					if(poss==line[numL][posO] && (poss==1 || poss==2)) {
						countOG2++;
						if(countOG2==2){
							countOG2A++;
							//System.out.println()
						}
					}

				}
			}
		countOG2 = 0;

	}
	System.out.println("1 and 2 SL" + ": " + countOG2A);
				
	}
}