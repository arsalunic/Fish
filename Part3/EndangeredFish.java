public abstract class EndangeredFish extends Fish {

	public EndangeredFish(int aSize, double aWeight) {
		super(aSize, aWeight);
	}

	public boolean canKeep() {
		return false;
	}

	public String toString() {
		return super.toString() + " (ENDANGERED)";
	} 
}