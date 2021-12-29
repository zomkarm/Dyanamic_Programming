public class BruteForce {
	static int cost(int[][] arr,int i,int j){
		int n=4;
		int m=5;
		if(i==n-2 && j==m-1)
			return arr[i][j];
		else if(i==n-1)
			return arr[i][j]+cost(arr,i,j+1);
		else if(j==m-1)
			return arr[i][j]+cost(arr,i+1,j);
		else
			return arr[i][j]+Math.min(cost(arr,i+1,j),cost(arr,i,j+1));	
	}
	public static void main (String[] args) {
		int arr[][]={
				{3,2,12,15,10},
				{6,19,7,11,17},
				{8,5,12,32,21},
				{3,20,2,9,7}
			};
		System.out.println(cost(arr,0,4));
	}
}

