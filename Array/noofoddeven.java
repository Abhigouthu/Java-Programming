package Array;

public class noofoddeven {

	public static void main(String[] args) {
		int[] arr = {10,3,66,25,4,9,2,5,9};
		
		int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
		

	}

}
