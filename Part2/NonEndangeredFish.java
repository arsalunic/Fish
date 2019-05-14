public abstract class NonEndangeredFish extends Fish {

	public NonEndangeredFish(int aSize, double aWeight) {
		super(aSize, aWeight);
	}

	public boolean canKeep() {
		return size > Fish.THROW_BACK_SIZE;
	}
}