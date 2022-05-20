package algo.mergesort;

public class App {

	public static void main(String[] args) {
		int[] myArray = new int[] { 9, 8, 7, 40, 2, 99 };
		MergeSort sorter = new MergeSort();
		
		sorter.sort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
}
