package JavsImp;

public class ForEach {
public static void main(String[] args) {
	// only arrays and collections can be used for this foreach loop.
	int[] a= {5,6,7};
	for (int numbers : a) {
		System.out.println(numbers);
	}
}
}
