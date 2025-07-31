package Array;

public class minarray {

	public static void main(String[] args) {
		int[] arr = {10, 25, 3, 99, 56, 42};

        int min = arr[0]; // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update max if current element is greater
            }
        }

        System.out.println("Minimum element in the array: " + min);
        
	}

}
