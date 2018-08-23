package model;

public class LogicSort {

	
	
	public LogicSort() {

	}
	

	public int[] countingSort(int[] arr) {

			int n = arr.length-1;
			int k = arr[0];
			for (int i = 1; i <= n; i++) {
			if (arr[i] > k) {
			k = arr[i];
			}
			}
			int[] C = new int[k + 1];

			for (int i = 0; i <= k; i++) {
			C[i] = 0;
			}
			for (int i = 0; i <= n; i++) {
			C[arr[i]] = C[arr[i]] + 1;
			}
			for (int i = 1; i <= k; i++) {
			C[i] = C[i] + C[i - 1];
			}
			int[] B = new int[n+1];
			for (int i = n ; i >= 0; i--) {
			C[arr[i]] = C[arr[i]] - 1;
			B[C[arr[i]]] = arr[i];
			}
			
			return B;
			

	}

	public int[] timSort(int[] arr) {
          
		return arr;

	}

	public double[] timSort(double[] arr) {

		return arr;

		
	}

	public int[] quickSort(int[] arr) {

		return arr;

	}

	public double[] quickSort(double[] arr) {

		return arr;

	}

}
