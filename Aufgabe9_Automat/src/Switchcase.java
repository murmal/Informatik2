/**
 * Automatenimplementierung mit Switch-cases.
 * 
 * @author katze
 *
 */
public class Switchcase {

	public enum State {
		Z0, Z1, Z2, Z3, Z4;

	}

	State state = State.Z0;

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Eingabe für den Automaten.
	 * 
	 * @param trigger
	 *            Entweder 1 oder 0.
	 */
	public void trigger(int trigger) {
		boolean zero = (trigger == 0);
		boolean one = (trigger == 1);
		if (trigger <= 1 && trigger >= 0) {

			switch (state) {

			case Z0:
				if (zero || one) {
					setState(State.Z1);
				}
				break;

			case Z1:
				if (zero) {
					setState(State.Z2);
				} else if (one) {
					setState(State.Z3);
				}
				break;

			case Z2:
				if (zero) {
					setState(State.Z2);
				} else if (one) {
					setState(State.Z3);
				}
				break;

			case Z3:
				if (zero) {
					setState(State.Z2);
				} else if (one) {
					setState(State.Z3);
				}
				break;

			case Z4:
				if (zero) {
					setState(State.Z2);
				} else if (one) {
					setState(State.Z3);
				}
				break;

			}
			System.out.println("You're in state " + state + " now. Your trigger was '" + trigger + "'.");
		} else {
			System.out.println("Wrong trigger.");
		}

	}

	/**
	 * Setzt den Automaten zurück.
	 */
	public void clear() {

		state = State.Z0;

		System.out.println("The machine has been cleared.");
	}

}