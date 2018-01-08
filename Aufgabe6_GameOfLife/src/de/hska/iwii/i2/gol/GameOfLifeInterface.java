package de.hska.iwii.i2.gol;

public interface GameOfLifeInterface {

	/**
	 * �bergibt dem Array die aktuell ausgew�hlte Generation.
	 * 
	 * 
	 * 
	 * @param generation
	 *            ausgew�hlte Startkonfiguration.
	 */
	public void setStartGeneration(boolean[][] generation);

	/**
	 * Berechnet die n�chste Generation und speichert diese in einem Array.
	 * 
	 */
	public void nextGeneration();

	/**
	 * Guckt, ob die ausgew�hlte Zelle am Leben ist.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return False wenn sie tot ist, true wenn sie am Leben ist.
	 */
	public boolean isCellAlive(int x, int y);

	/**
	 * Z�hlt die um die Zelle liegenden lebenden Zellen.
	 * 
	 * @param x
	 *            x-Koordinate der Zelle
	 * @param y
	 *            y-Koordinate der Zelle
	 * @return
	 */
	public int countCells(int x, int y);

}
