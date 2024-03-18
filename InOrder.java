/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {

public static void main(String[] args) {

	int rnd = (int) (10 * math.random());
	int prev = rnd;
	do {
		system.out.print(prev + " ");
		rnd = (int) (10 * math.random());
	} while (rnd >= prev);
	system.out.println()
}
}