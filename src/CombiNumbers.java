/*
 * 
 * Author: Heine Melo - <heinemelo@gmail.com>
 *
 */
 
import java.util.*;
import org.apache.commons.math3.util.Combinations;

public class CombiNumbers {
	public List<int[]> lpg2 = new ArrayList<int[]>();
	public Combinations c = new Combinations(26,2);
	
	void generateCombinations(int group){
		Combinations c = new Combinations(26,group);
		for(int[] iterate : c){
			lpg2.add(iterate);
		}
	}
	
	void printCombinations(int group) {
		// THIS CODE IS TO PRINT THE COMBINATIONS
		System.out.println("\n\nCombinations (25," + group +")");
	    for(int[] iterate : lpg2){
	            for(int i=0;i<iterate.length; i++){
	            	if(iterate[0] == 0 || iterate[1] == 0) continue;
	            	System.out.print(iterate[i] +" ");    
	        }
			if(iterate[0] == 0 || iterate[1] == 0) continue;
	        System.out.println();
	    }
	    
	}
}