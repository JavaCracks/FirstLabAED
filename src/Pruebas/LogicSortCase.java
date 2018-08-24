package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import model.LogicSort;

public class LogicSortCase extends TestCase{
	
		
		private LogicSort logic;
		
		
		public void stageOne() {
			logic=new LogicSort();
		}
		
		@Test
		public void testCountingSort() {
			
			stageOne();
			int [] array=new int[6];
			array[0]=6;
			array[1]=13;
			array[2]=22;
			array[3]=24;
			array[4]=46;
			array[5]=96;
			
			int[] arrays= {22,13,6,96,46,24};
			
			int []arrayMethod=logic.countingSort(arrays);
			
			assertArrayEquals(array, arrayMethod);
		} 
		
		@Test 
		public void testMergeSort() {
			
			stageOne();
			int [] array=new int[6];
			array[0]=6;
			array[1]=13;
			array[2]=22;
			array[3]=24;
			array[4]=46;
			array[5]=96;
			
			int[] arrays= {22,13,6,96,46,24};
			logic.mergeSort(arrays, arrays.length);
			
			assertArrayEquals(array, arrays);
			
			
		}
		
//		@Test
//		public void testMergeSortDouble() {
//			stageOne();
//			double[] array=new double[6];
//			array[0]=6.5;
//			array[1]=13.2;
//			array[2]=22.7;
//			array[3]=24.8;
//			array[4]=46.0;
//			array[5]=96.1;
//			
//			double [] arrays= {46.0, 6.5, 22.7, 96.1, 13.2, 24.8};
//			logic.mergeSortDouble(arrays, arrays.length);
//			
//			assertEquals(array, arrays);
//			
//		}
		
		@Test 
		public void testQuickSort() {
			
			stageOne();
			int [] array=new int[6];
			array[0]=6;
			array[1]=13;
			array[2]=22;
			array[3]=24;
			array[4]=46;
			array[5]=96;
			
			int[] arrays= {22,13,6,96,46,24};
			logic.quickSort(arrays, 0, arrays.length-1);
			
			assertArrayEquals(array, arrays);
			
			
		}
		
//		@Test 
//		public void testQuickSortDouble() {
//			
//			stageOne();
//			double [] array=new double[6];
//			array[0]=6.5;
//			array[1]=13.2;
//			array[2]=22.7;
//			array[3]=24.8;
//			array[4]=46.0;
//			array[5]=96.1;
//			
//			double [] arrays= {46.0, 6.5, 22.7, 96.1, 13.2, 24.8};
//			logic.quickSortDouble(arrays, 0, arrays.length-1);
//			
//			assertEquals(array, arrays);
//			
//			
//		}
		
		
		
		
		
		
	}


