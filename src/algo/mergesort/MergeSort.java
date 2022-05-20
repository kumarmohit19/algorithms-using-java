package algo.mergesort;

public class MergeSort {
	public static void sort(int[] inputArray){
		sort(inputArray, 0, inputArray.length-1);
	}

	private static void sort(int[] inputArray, int start, int end) {
		if(end <= start){
			return;
		}
		
		int mid = (start + end)/2;
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray, start, mid, end);
		
	}

	private static void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];
		
		// index counter for the left side of the array
		int leftSlot = start;
		// index counter for the right side of the array
		int rightSlot = mid+1;
		int k = 0;
		
		while(leftSlot <= mid && rightSlot<= end){
			if(inputArray[leftSlot] < inputArray[rightSlot]){
				tempArray[k] = inputArray[leftSlot];
				leftSlot += 1;
			} else{
				tempArray[k] = inputArray[rightSlot];
				rightSlot += 1;
			}
			k += 1;
		}
		
		/**
		 * when it get's to here, that means above loop is completed.
		 * So both the right and left side of the sub array can be considered sorted
		 */
		
		if(leftSlot <= mid){// consider the right side done being sorted. Left musted be sorted already
			while(leftSlot <= mid){
				tempArray[k] = inputArray[leftSlot];
				leftSlot += 1;
				k += 1;
			}
		} else if(rightSlot <= end){
			while(rightSlot <= end){
				tempArray[k] = inputArray[rightSlot];
				rightSlot += 1;
				k += 1;
			}
		}
		
		// copy over the temp array into the appropriate slots of the inputArray
		for(int i= 0; i< tempArray.length; i++){
			inputArray[start + i] = tempArray[i];
		}
		
	}
}
