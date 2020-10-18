//This problem is from October Challenge of Codechef
import java.util.Scanner;

public class CovidRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();// test cases
		while (t-- > 0) {
			int n = scn.nextInt();// number of cities
			//int[] arr = new int[n];
			int k = scn.nextInt();// size of jump
			int x = scn.nextInt();// current city
			int y = scn.nextInt();// city where you live
			boolean[] arr1 = new boolean[n];
			for(int i = 0; i < n; i++) {
				arr1[i] = false;
			}
			for (int i = 0; i < n; i++) {
				arr1[(x + k) % n] = true;
				x = (x + k) % n;
			}
			if(arr1[y] == false) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}

}
