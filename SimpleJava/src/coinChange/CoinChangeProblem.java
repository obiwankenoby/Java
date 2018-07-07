package coinChange;

public class CoinChangeProblem {

	
	public static int minCoinCounter(int[] coins, int make){
		int[] cache=new int[make];
		for(int i=1;i<cache.length;i++){
			cache[i]=-1;
		}
		
		return minCoinCounter(coins, make, cache);
		
	}
	public static int minCoinCounter(int[] coins, int make,int[] cache){
		
		if (make==0) return 0;
		
		int min=make;
		for(int coin:coins){
			if(make-coin>=0){
				int c;
				if(cache[make-coin]>=0){
					c=cache[make-coin];
				}
				else{
					c = minCoinCounter(coins, make-coin, cache);
					cache[make-coin]=c;
				}
				
				if(min>c+1){
					min=c+1;
				}
			}
		}
		
		return min;
	}
	public static void main(String[] args){
		
		int coins[]={1,5,10,25};
		int make=32;
		int z =minCoinCounter(coins,make);
		System.out.println(z);
		
	}
	
}
