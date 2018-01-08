/*
 * Automatenimplementierung mit einer Tabelle.
 */
public class Table {
	/*
	 * 
	 * Übergangstabelle.
	 */
	int[][] table = { { 1, 1 }, // Z0
			{ 2, 3 }, // Z1
			{ 2, 4 }, // Z2
			{ 2, 3 }, // Z3
			{ 2, 3 } // Z4
	};
	/*
	 * Aktueller Zustand.
	 */
	int currentState = 0;

	/**
	 * Eingabe für den Automaten.
	 * 
	 * @param trigger
	 *            Entweder 1 oder 0.
	 */
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

	/**
	 * Setzt den Automaten zurück.
	 */
	public void clear() {

		currentState = 0;

		System.out.println("The machine has been cleared.");
	}

}
