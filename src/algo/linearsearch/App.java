package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		int[] arr = {2, 3, 77, 97, 90, 5, 34};
		
		System.out.println(LinearSearch.search(arr, 0));
		
		System.out.println(recursiveLinearSearch(arr, 0, 2));
		

	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x){
		if(a[i] == x){
			return i;
		}else if(i < a.length-1 ){
			return recursiveLinearSearch(a, i+1,x);
		}
		return -1;// if no condition is satisfied which means given number is not present in the array
	}

}
