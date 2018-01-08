package de.hska.iwii.i2.gol;

/**
 * Die eigentliche Spielelogik. Das Spielarray wird hier nicht als zyklisch
 * geschlossen betrachtet wird.
 *
 * @author Holger Vogelsang
 */
public class GameOfLifeLogic {

	private boolean[][] array;

	/**
	 * Übergibt dem Array die aktuell ausgewählte Generation.
	 * 
	 * 
	 * 
	 * @param generation
	 *            ausgewählte Startkonfiguration.
	 */
	public void setStartGeneration(boolean[][] generation) {
		this.array = generation;

	}

	/**
	 * Berechnet die nächste Generation und speichert diese in einem Array.
	 * 
	 */
	public void nextGeneration() {

		boolean[][] clone = new boolean[array.length][array.length];

		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				clone[i][j] = array[i][j];
			}
		}

		int cells = 0;

		for (int i = 0; i <= this.array.length - 1; i++) {
			for (int j = 0; j <= this.array.length - 1; j++) {

				if (isCellAlive(i, j)) {
					cells = countCells(i, j);

					if (cells < 2) {
						clone[i][j] = false;
					}

					if (cells > 3) {
						clone[i][j] = false;
					}
				}

				else if ((isCellAlive(i, j) == false)) {
					cells = countCells(i, j);

					if (cells == 3) {
						clone[i][j] = true;
					}
				}
			}
		}

		this.array = clone;
	}

	/**
	 * Guckt, ob die ausgewählte Zelle am Leben ist.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return False wenn sie tot ist, true wenn sie am Leben ist.
	 */
	public boolean isCellAlive(int x, int y) {

		if (this.array[x][y]) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Zählt die um die Zelle liegenden lebenden Zellen.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return
	 */
	public int countCells(int x, int y) {

		int zaehler = 0;

		for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, this.array.length - 1); i++) {
			for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, this.array.length - 1); j++) {
				if ((i != x) || (j != y)) {
					if (this.array[i][j] == true) {
						zaehler++;
					}
				}
			}
		}

		return zaehler;
	}

}