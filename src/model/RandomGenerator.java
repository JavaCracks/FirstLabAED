package model;

import java.util.Random;

public class RandomGenerator {

	private int quantity;
	private boolean repeated;
	private boolean inversely;
	private boolean randomOrder;
	private double percentageDisorder;
	private Random random;

	public RandomGenerator() {
		
	quantity = 0;
	repeated = false;
	inversely = false;
	randomOrder = false;
	percentageDisorder = 0.0;
	random = new Random();

	}
	
	public Random getRandom() {
		
	return random;	
		
	}

	public void setQuantity(int quantity) {

		this.quantity = quantity;

	}

	public int getQuantity() {

		return quantity;

	}

	public void setRepeated(boolean repeated) {

		this.repeated = repeated;

	}

	public boolean isRepeated() {

		return repeated;

	}

	public void setInversely(boolean inversely) {

		this.inversely = inversely;

	}

	public boolean isInversely() {

		return inversely;

	}

	public void setRandomOrder(boolean randomOrder) {

		this.randomOrder = randomOrder;

	}

	public boolean isRandomOrder() {

		return randomOrder;

	}

	public void setPercentageDisorder(double percentageDisorder) {

		this.percentageDisorder = percentageDisorder;

	}

	public double getPercentageDisorder() {

		return percentageDisorder;

	}

}
