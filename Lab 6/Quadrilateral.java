/*-------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Quadrilateral.java
// SPECIFICATION: Represents a quadrilateral
// FOR: CS 1400 - Lab 6
// TIME SPENT: 15 Minutes
//-----------------------------------------------------------*/
public class Quadrilateral 
{
	// instance fields
	private int side1, side2, side3, side4;
	
	// getters and setters
	public int getSide1()
	{
		return side1;
	}
	
	public int getSide2()
	{
		return side2;
	}
	
	public int getSide3()
	{
		return side3;
	}
	
	public int getSide4()
	{
		return side4;
	}
	
	public void setSide1(int length)
	{
		side1 = length;
	}
	
	public void setSide2(int length)
	{
		side2 = length;
	}
	
	public void setSide3(int length)
	{
		side3 = length;
	}
	
	public void setSide4(int length)
	{
		side4 = length;
	}
	
	// uses pythagorean theorem to determine if the quadrilateral has congruent diagonals
	private boolean hasCongruentDiagonals(int side1, int side2, int side3, int side4)
	{
		double diagonal1 = Math.sqrt((side1 * side1) + (side2 * side2));
		
		double diagonal2 = Math.sqrt((side3 * side3) + (side4 * side4));
		
		if (diagonal1 == diagonal2)
			return true;
		return false;
	}
	
	// checks if a quadrilateral is a rectangle
	public boolean isRectangle()
	{
		if ((side1 == side3 && side2 == side4) && hasCongruentDiagonals(side1, side2, side3, side4))
			return true;
		return false;
	}
	
	// checks if the quadrilateral is a square
	public boolean isSquare()
	{
		if ((side1 == side2 && side2 == side3 && side3 == side4) && hasCongruentDiagonals(side1, side2, side3, side4))
			return true;
		return false;
	}
}
