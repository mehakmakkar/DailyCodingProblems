
public class Problem2 {

	public static void main(String[] args) {
		int[] list = { 4, 3, 1, 5, 2 };

		int[] leftProducts = new int[list.length];
		int[] rightProducts = new int[list.length];
		int[] finalProductList = new int[list.length];

		leftProducts[0] = 1;
		for (int i = 1; i < leftProducts.length; i++) {
			leftProducts[i] = list[i - 1] * leftProducts[i - 1];
		}

		rightProducts[rightProducts.length - 1] = 1;
		for (int i = rightProducts.length - 2; i >= 0; i--) {
			rightProducts[i] = rightProducts[i + 1] * list[i + 1];
		}
		
		for (int i=0; i<list.length; i++) {
			finalProductList[i] = rightProducts[i]* leftProducts[i];
			
			
		}

		for (int j=0; j< list.length-1; j++) {
			System.out.print(finalProductList[j] + ",");
		}

		System.out.print(finalProductList[list.length-1]);
	}
}
