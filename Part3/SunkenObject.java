public abstract class SunkenObject implements Catchable {

	double weight;

	public SunkenObject(double w) {
		weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public String toString() {
		return "A " + weight + "kg " + getClass().toString().substring(6);
	}

	public boolean isDesirableTo (Fisher f) {
		return false;
	} 
}