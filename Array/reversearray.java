package Array;

public class reversearray {

	public static void main(String[] args) {
		 int[] arr = {10, 20, 30, 40, 50};

	        System.out.println("Original array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }

	        System.out.println("\nReversed array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

}
