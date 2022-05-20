package algo.recursion;

public class Recursion {

	public static void main(String[] args) {
		reduceOne(10);

	}
	
	public static void reduceOne(int i){
		if(i >= 0){
			reduceOne(i-1);
		}
		System.out.println(i);
	}

}
