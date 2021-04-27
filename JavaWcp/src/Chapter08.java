
public class Chapter08 {
	public static void main(String[] args) {
		// 「while」文
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		// 通常「for」文
		int[] array = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 拡張「for」文
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
