public class Problem1 {
	public static void main(String[] args) {

		int[] list = new int[] { 10, 15, 3, 7 };
		int k = 17;

		boolean found = false;

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				found = checkSum(list[i], list[j], k);

				if (found == true) {
					break;
				}
			}

			if (found == true) {
				break;
			}
		}

		System.out.println(found);

	}

	public static boolean checkSum(int x, int y, int z) {
		if (x + y == z) {
			return true;
		} else {
			return false;
		}
	}
}
