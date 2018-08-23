package model;

import java.util.Arrays;

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
	
	private void insertionSort(int array[], int left, int right) {
	
		for (int i=left+1;i<=right;i++) {
			int temp=array[i];
			int j=i-1;
			
			while(array[j]> temp && j>=left) {
				array[j+1]=array[j];
				j--;
				
			}
			array[j+1]=temp;
		}
	}
	
	private void insertionSortDouble(double array[], int left, int right) {
		
		for (int i=left+1;i<=right;i++) {
		    double temp=array[i];
			int j=i-1;
			
			while(array[j]> temp && j>=left) {
				array[j+1]=array[j];
				j--;
				
			}
			array[j+1]=temp;
		}
	}
	
	private void merge(int array[], int l, int m, int r) {
	
		int len1=m-l+1, len2=r-m;
		int left[]=new int[len1];
		int right[]=new int[len2];
		
		for(int i=0; i<len1;i++) {
		
			left[i]=array[l+i];			
		}
		
		for(int i=0; i<len2;i++) {
			right[i]=array[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=0;
		
		while (i < len1 && j < len2) {
	    
	        if (left[i] <= right[j])
	        {
	            array[k] = left[i];
	            i++;
	        }
	        else
	        {
	            array[k] = right[j];
	            j++;
	        }
	        k++;
	    }
		
		while (i < len1) {
	    
	        array[k] = left[i];
	        k++;
	        i++;
	    }
		
		while (j < len2) {
	    
	        array[k] = right[j];
	        k++;
	        j++;
	    }


	
		
	}
	
	private void mergeDouble(double array[], int l, int m, int r) {
		
		int len1=m-l+1, len2=r-m;
		double left[]=new double[len1];
		double right[]=new double[len2];
		
		for(int i=0; i<len1;i++) {
		
			left[i]=array[l+i];			
		}
		
		for(int i=0; i<len2;i++) {
			right[i]=array[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=0;
		
		while (i < len1 && j < len2) {
	    
	        if (left[i] <= right[j])
	        {
	            array[k] = left[i];
	            i++;
	        }
	        else
	        {
	            array[k] = right[j];
	            j++;
	        }
	        k++;
	    }
		
		while (i < len1) {
	    
	        array[k] = left[i];
	        k++;
	        i++;
	    }
		
		while (j < len2) {
	    
	        array[k] = right[j];
	        k++;
	        j++;
	    }


	
		
	}
	
	
	public void timSort(int array[], int n) {
		
		for(int i=0; i<n; i+=32) {
			insertionSort(array,i, Math.min((i+31),(n-1)));
			
		}
		
		for(int size=32; size<n;size=2*size) {
			
			for(int left=0; left<n; left+=2*size) {
				int mid=left+size-1;
				int right= Math.min((left+2*size-1),(n-1));
				
				merge(array,left,mid,right);
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arreglo[]={12,23,15,4,7};
		LogicSort l=new LogicSort();
		l.timSort(arreglo,arreglo.length-1);
		Arrays.toString(arreglo);
		
	}
	
	

}
