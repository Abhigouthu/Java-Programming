package Array;

public class maxelement {

	public static void main(String[] args) {
		 int[] arr = {10, 25, 3, 99, 56, 42};

	        int max = arr[0]; // Assume first element is max

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; // Update max if current element is greater
	            }
	        }

	        System.out.println("Maximum element in the array: " + max);
	        

	}

}
