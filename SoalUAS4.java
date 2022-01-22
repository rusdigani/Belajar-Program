public class SoalUAS7 {
	public static void main (String args[])
	{
		int n = 5;
        int i,j; 
		for (i = 1; i <= n; i++){
			for(j=2*(n-i); j>=0; j--) { // inner loop for spaces
				System.out.print(" "); // printing space
			}
			for (j = 0; j < i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
