package algo.quicksort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 34, 56, 777, 8, 4, 5, 6, 9};
		quicksort(inputArray, 0, inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));

	}

	public static void quicksort(int[] inputArray, int start, int end) {
		if(start < end){
			int pp = partition(inputArray, start, end); // index position of the correctly placed value in the array
			quicksort(inputArray, start, pp-1); // sorts left half of the given range
			quicksort(inputArray, pp+1, end); // sorts right half of the given range
		}
		
	}

	public static int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		int i = start -1;
		for(int j = start; j< end; j++){
			if(inputArray[j] < pivot){
				i += 1;
				// we are swapping values below
				int ival = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j]= ival;
			}
		}
		// put the pivot value in the correct slot next
		inputArray[end]= inputArray[i+1]; 
		inputArray[i+1] = pivot; // here, pivot value is placed at the correct spot in the array
		//System.out.println(Arrays.toString(inputArray)+"start ->"+start+" end->"+end);
		return i+1;
	}

}
