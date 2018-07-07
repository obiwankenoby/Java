package nonRepChar;

import java.util.HashMap;

public class NonRepeatingChar {

	public static void nonRepChar(String input){
		String lowerinput= input.toLowerCase();
		String inputStringArray[]=lowerinput.split("");
		int count = 0;
		HashMap<String, Integer> hamp=new HashMap<String, Integer>();
		for(int i=0;i<inputStringArray.length;i++){
			if(!hamp.containsKey(inputStringArray[i])){
				hamp.put(inputStringArray[i],1);
				count=1;
			}
			else{
				count=count+1;
				hamp.put(inputStringArray[i],count);
			}
		}
		
		System.out.println(hamp);
		int dupCounter=0;
		for(int i=0;i<input.length();i++){
			String x=inputStringArray[i];
			if(hamp.get(x)==1){
				System.out.println("The first non repeating char is "+x);
				dupCounter=1;
				break;
			}
		}
		if(dupCounter==0){
			System.out.println("No repeating Characters");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nonRepChar("Rraajaeev");

	}

}
