package algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//System.out.println(binarySearch(arr, 7));
		//System.out.println(binarySearch(arr, 0));
		System.out.println(recursiveBinarySearch(arr, 0, 100, 10));
	}
	
	public static int binarySearch(int[] a, int x){
		int p = 0, r = a.length-1;
		while(p <= r){
			int q = (p+r)/2;
			if(a[q] == x) return q;
			else if(a[q] > x) r = q-1;
			else p = q+1;
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x){
		int q = (p+r)/2;
		if(p > r) return -1;
		else if(a[q] == x) return q;
		else if(a[q] > x) return recursiveBinarySearch(a, p, q-1, x);
		else return recursiveBinarySearch(a, q+1, r, x);
	}

}
