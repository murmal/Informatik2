package de.hska.iwii.i2.gol;

public interface GameOfLifeInterface {
	

	public void setStartGeneration(boolean[][] generation);
	
	public void nextGeneration();
	
	public boolean isCellAlive(int x, int y);
	
	public int countCells(int x, int y);
	
	

}
