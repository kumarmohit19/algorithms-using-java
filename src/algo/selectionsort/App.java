package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] { 9, 8, 7, 40, 2, 99 });
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}

	public static int[] selectionSort(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			// System.out.println(min+"--initial");
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {// of we find a minimum value
					min = j;
					// System.out.println(min+"--swap min");
				}
			}
			if (min > i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				// System.out.println(temp+"--swap values");
			}

		}

		return a;
	}

}
