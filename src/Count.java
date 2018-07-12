/*
 * 
 * Author: Heine Melo - <heinemelo@gmail.com>
 *
 */
 
public class Count {
	void counterIndividual(Input inputFile) {
		// Count how many times each number occours - 
		// THIS CODE IS OK - COMMENTING JUST TO JUMP OVER
		System.out.println("Number of individual occurrences");
		int countO = 0;
		for(int poss = 1; poss <= 25; poss++) {

			for(int numL = 0; numL<=1663; numL++) {
				for (int posO = 0; posO <= 14; posO++) {
						if(poss==inputFile.line[numL][posO]) {
							countO++;

						}

					}
				}
			System.out.println(poss + ": ---- " + countO);
			countO = 0;

		}
	}
	
	void counterGroupOf2(Input inputFile, CombiNumbers cn) {
		int countOG2 = 0;
		int countOG2A = 0;
		int poss;
		int countpass = 0;
		System.out.println("Number of occurrences - groups of 2");
		//Iterate per pos group 2x2
		for(int[] iterate : cn.lpg2){
		//Prevent to check the possibility of the 0 entry			
			if(iterate[0] == 0 || iterate[1] == 0) continue; 
                //Iterate per position 1-15 per line			
				for (int posO = 0; posO <= 14; posO++) { 					
					// Iterate per possibility 1-25
					for(poss = 1; poss <= 25; poss++) {	 					
						//Iterate per line
						for(int numL = 0; numL<=1663; numL++) { 			
							for(int i=0;i<iterate.length; i++){
								if((inputFile.line[numL][posO]==iterate[0] 
								|| inputFile.line[numL][posO]==iterate[1])) {
									//Count how many times appears one of the 2x2
									countOG2++; 							
									if(countOG2==2){
										//Aggregate if both of them appear in the same line
										countOG2A++; 						
									}
								}					
							}
						//Zeroes the counter of one the 2x2 appears
						countOG2=0; 										
						}
						//Counter lines x possibilities
						countpass++; 										
						//Only prints if it is the la
						if(countpass==375){ 								
							System.out.println(iterate[0] + " and "
							+ iterate[1] + ": " + countOG2A);
							
						}
						//Zeroes the counter of aggregate
						countOG2A=0; 																
					}
				
				}
			//Zeroes x possibilities
			countpass = 0;
			//Prevent to check the possibility of the 0 entry
			if(iterate[0] == 0 || iterate[1] == 0) continue; 				
			
		}
	}
}