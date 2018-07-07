package longestCommonSubsequence;

public class LCS {
	
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		String a ="ABAB";
		String b= "BABA";
		String out="";
		if(a.length()==0||b.length()==0){
			System.out.println(out);
		}
		int[][] cache=new int[a.length()][b.length()];
		
		for(int i=0;i<a.length();i++){
			for(int j=0;j<b.length();j++){
				if(a.charAt(i)==b.charAt(j)){
					if(i==0||j==0){
						cache[i][j]=1;
					}else{
						cache[i][j]=cache[i-1][j-1]+1;
					}
					if(cache[i][j]>out.length()){
						out=a.substring(i-cache[i][j]+1, i+1);
						
					}
				}
			}
		}
		System.out.println(out);
		
	}

}
