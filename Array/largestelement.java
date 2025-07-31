package Array;

public class largestelement {

	public static void main(String[] args) {
		int[] arr = {10, 25, 3, 99, 56, 42};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // update second largest
                largest = num; // update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (array may have all same elements)");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
	}

}
