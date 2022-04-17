import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem1Efficient {
	public static void main(String[] args) {
		
		boolean value = false;
		int[] list = new int[] { 10, 15, 3, 7 };
		int k = 17;

		Set<Integer> listInASet = new HashSet<Integer>();
		
		for (int j = 0; j < list.length; j++) {
			listInASet.add(list[j]);
		} 
		
		for (int i = 0; i < list.length; i++) {
			
			int x = k - list[i];
		
			value = listInASet.contains(x);
			
			if(value == true) {
				break;
			}
		}
		
		System.out.println(value);
	}
}
