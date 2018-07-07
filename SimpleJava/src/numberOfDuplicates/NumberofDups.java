package numberOfDuplicates;

import java.util.Collections;
import java.util.HashMap;

public class NumberofDups {

	public static void DupFinder(String input){
		//int current=1;
		String[] wordDivider=input.split(" ");
		int wordDividerLength = wordDivider.length;
		/*for(int i=0;i<wordDivider.length;i++){
			System.out.println("Word number "+current+" is :"+wordDivider[i]);
			current++;
			
		}
		*/
		int wordCount=0;
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<wordDividerLength;i++){
			String curString=wordDivider[i];
			if(!hm.containsKey(curString)){
				hm.put(curString, 1);
				wordCount=1;
			}
			else{
				hm.put(curString, wordCount+1);
			}
		}
		System.out.println(hm);
		for(int i=0;i<wordDividerLength;i++){
			String curStrings=wordDivider[i];
			if(hm.get(curStrings)>1){
				System.out.println(curStrings);
				break;
			}
			
		}
		//System.out.println(hm.keySet());
		int maxValueInMap=(Collections.max(hm.values()));
		System.out.println(maxValueInMap);
		for (java.util.Map.Entry<String, Integer> entry : hm.entrySet()) {  // Iterate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Rajeev is the struggling coder and he is very bad at it. But still trying to be a good coder. Such a good coder";
		DupFinder(input);
	}

}
