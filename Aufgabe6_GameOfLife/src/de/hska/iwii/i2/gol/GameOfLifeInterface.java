package de.hska.iwii.i2.gol;

public interface GameOfLifeInterface {

	/**
	 * Übergibt dem Array die aktuell ausgewählte Generation.
	 * 
	 * 
	 * 
	 * @param generation
	 *            ausgewählte Startkonfiguration.
	 */
	public void setStartGeneration(boolean[][] generation);

	/**
	 * Berechnet die nächste Generation und speichert diese in einem Array.
	 * 
	 */
	public void nextGeneration();

	/**
	 * Guckt, ob die ausgewählte Zelle am Leben ist.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return False wenn sie tot ist, true wenn sie am Leben ist.
	 */
	public boolean isCellAlive(int x, int y);

	/**
	 * Zählt die um die Zelle liegenden lebenden Zellen.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return
	 */
	public int countCells(int x, int y);

}
