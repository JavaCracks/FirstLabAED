package model;

public class LogicSort {

	private double[] arrayRationalNumbers;
	private int[] arrayIntegerNumbers;
	private RandomGenerator randomGenerator;

	public LogicSort() {

	randomGenerator = new RandomGenerator();	
		
	}
	
	
	public int[] getAnArrayOfIntegers(String[] a) {
		
		
	int[] integers = new int[a.length];
	
	for(int i = 0 ; i< a.length;i++) {
		
	integers[i] = Integer.parseInt(a[i]);	
		
	}
	
	return integers;
		
		
	}
	
	public double[] getAnArrayOfRationals(String[] a) {
		
	double[] rationals = new double[a.length];
	
	for(int i = 0; i<a.length; i++) {
		
	rationals[i] = Double.parseDouble(a[i]);
		
	}
	
	return rationals;
		
	}
	
     public  int[] generateIntegerRepeated(int quantity, boolean repeated, int range ) {
    	 
    	  int[] valores= new int[quantity];
    	  
    	  for(int i=0; i<quantity; i++) {
    	  if(repeated==true) {
    		  valores[i]= randomGenerator.getRandom().nextInt(range-1) + 1;
    	  }
    	  }
    	  
    	   return valores;
    }
     
     public  int[] generateRationalRepeated(int quantity, boolean repeated, int range ) {
    	 
   	  int[] valores= new int[quantity];
   	  
   	  for(int i=0; i<quantity; i++) {
   	  if(repeated==true) {
   		  valores[i]= randomGenerator.getRandom().nextInt(range-1) + 1;
   	  }
   	  }
   	  
   	  
   	   return valores;
   } 
     
     
     public  int[] generateIntegerNotRepeated(int quantity, boolean repeated, int range ) {
    	 
      	  int[] valores= new int[quantity];
      	  
      	  for(int i=0; i<quantity; i++) {
      	  if(repeated==false) {
      		  valores[i]= randomGenerator.getRandom().nextInt(range-1) + 1;
      	  }
      	  }
      	  
      	   return valores;
      }
      
   
       
     

	public RandomGenerator getRandomGenerator() {

		return randomGenerator;

	}
	

	public double[] getArrayRationalNumbers() {
		
	return arrayRationalNumbers;	
		
	}
		
	public int[] getArrayIntegerNumbers() {
	
	return arrayIntegerNumbers;	
		
	}

	public int[] countingSort(int[] arr) {

		int n = arr.length - 1;
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
		int[] B = new int[n + 1];
		for (int i = n; i >= 0; i--) {
			C[arr[i]] = C[arr[i]] - 1;
			B[C[arr[i]]] = arr[i];
		}

		return B;

	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];

		// index of smaller element
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	// Inputs are the array, 0 and length -1
	public void quickSort(int arr[], int l, int h) {

		int[] stack = new int[h - l + 1];

		int top = -1;

		stack[++top] = l;
		stack[++top] = h;

		while (top >= 0) {

			h = stack[top--];
			l = stack[top--];

			int p = partition(arr, l, h);

			if (p - 1 > l) {
				stack[++top] = l;
				stack[++top] = p - 1;
			}

			if (p + 1 < h) {
				stack[++top] = p + 1;
				stack[++top] = h;
			}
		}
	}

	static int partitionDouble(double arr[], int low, int high) {
		double pivot = arr[high];

		// index of smaller element
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				double temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		double temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void quickSortDouble(double arr[], int l, int h) {

		int[] stack = new int[h - l + 1];

		int top = -1;

		stack[++top] = l;
		stack[++top] = h;

		while (top >= 0) {

			h = stack[top--];
			l = stack[top--];

			int p = partitionDouble(arr, l, h);

			if (p - 1 > l) {
				stack[++top] = l;
				stack[++top] = p - 1;
			}

			if (p + 1 < h) {
				stack[++top] = p + 1;
				stack[++top] = h;
			}
		}
	}

	public void mergeSort(int arr[], int n) {

		int curr_size;

		int left_start;

		for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {

			for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {

				int mid = left_start + curr_size - 1;

				int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

				merge(arr, left_start, mid, right_end);
			}
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void mergeSortDouble(double arr[], int n) {

		int curr_size;

		int left_start;

		for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {

			for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {

				int mid = left_start + curr_size - 1;

				int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);

				mergeDouble(arr, left_start, mid, right_end);
			}
		}
	}

	static void mergeDouble(double arr[], int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		double L[] = new double[n1];
		double R[] = new double[n2];

		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {

	}

}
