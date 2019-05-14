public class FishingTestProgram1 {
	public static void main(String [] args) {
		// Create a big pond with 15 fish
		Lake weirdLake = new Lake(15);
		weirdLake.add(new Fish(76, 6.1));
		weirdLake.add(new Fish(32, 0.4));
		weirdLake.add(new Fish(20, 0.9));
		weirdLake.add(new Fish(30, 0.4));
		weirdLake.add(new Fish(140, 7.4));
		weirdLake.add(new Fish(15, 0.3));
		weirdLake.add(new Fish(90, 5.9));
		weirdLake.add(new Fish(120, 6.8));
		weirdLake.add(new Fish(80, 4.8));
		weirdLake.add(new Fish(42, 3.2));
		weirdLake.add(new Fish(100, 5.6));
		weirdLake.add(new Fish(45, 2.0));
		weirdLake.add(new Fish(16, 0.2));
		weirdLake.add(new Fish(30, 1.2));
		weirdLake.add(new Fish(7, 0.1));

		System.out.println("Here is what is in the lake to begin with ...");
		weirdLake.listAllThings();
		// Create two people to fish in the lake
		Fisher fred = new Fisher("Fred", 25);
		Fisher suzy = new Fisher("Suzy", 15);

		System.out.println("Fred casts his fishing line into the lake 10 times ...");
		for (int i=0; i<10; i++)
			fred.goFishingIn(weirdLake);
		fred.listThingsCaught();

		System.out.println("Suzy casts her fishing line into the lake 10 times ...");
		for (int i=0; i<10; i++)
			suzy.goFishingIn(weirdLake);
		suzy.listThingsCaught();

		System.out.println("Here is what remains in the lake ...");
		weirdLake.listAllThings();
	}
}