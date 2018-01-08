
public class Table {

	int[][] table = { { 1, 1 }, // Z0
			{ 2, 3 }, // Z1
			{ 2, 4 }, // Z2
			{ 2, 3 }, // Z3
			{ 2, 3 } // Z4
	};

	int currentState = 0;

	public void trigger(int trigger) {
		int state = 0;

		if (trigger <= 1 && trigger >= 0) {

			state = table[currentState][trigger];

			currentState = state;
			System.out.println("You're in state Z" + state + " now. Your trigger was '" + trigger + "'.");

		} else {
			System.out.println("Wrong trigger.");
		}

	}

	public void clear() {

		currentState = 0;

		System.out.println("The machine has been cleared.");
	}

}
