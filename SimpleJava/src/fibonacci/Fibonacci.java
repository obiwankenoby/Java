package fibonacci;

public class Fibonacci {

	public static int Fib(int n){
		
		return Fib(n,new int[n+1]);
	}
	public static int Fib(int i, int[] memo){
		if(i==0||i==1){
			return i;
		}
		if(memo[i]==0){
			memo[i]=Fib(i-1,memo)+Fib(i-2,memo);
			//System.out.print(memo[i]+" ");
		}
		System.out.print(" "+memo[i]);
		return memo[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int result=Fib(5);
		//	System.out.println(result);
	}

}
