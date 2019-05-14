public class FishingTestProgram3 {
	public static void main(String [] args) {
		// Create a big lake with 15 fish, 2 tires, 2 treasures and 2 rusty chains
		Lake weirdLake = new Lake(21);
		weirdLake.add(new AuroraTrout(76, 6.1));
		weirdLake.add(new Tire());
		weirdLake.add(new Perch(32, 0.4));
		weirdLake.add(new Bass(20, 0.9));
		weirdLake.add(new Treasure());
		weirdLake.add(new Perch(30, 0.4));
		weirdLake.add(new AtlanticWhiteFish(140, 7.4));
		weirdLake.add(new RustyChain());
		weirdLake.add(new Bass(15, 0.3));
		weirdLake.add(new Tire());
		weirdLake.add(new Bass(90, 5.9));
		weirdLake.add(new Bass(120, 6.8));
		weirdLake.add(new AtlanticWhiteFish(80, 4.8));
		weirdLake.add(new AuroraTrout(42, 3.2));
		weirdLake.add(new Bass(100, 5.6));
		weirdLake.add(new Bass(45, 2.0));
		weirdLake.add(new RustyChain());
		weirdLake.add(new Perch(16, 0.2));
		weirdLake.add(new Bass(30, 1.2));
		weirdLake.add(new Treasure());
		weirdLake.add(new Perch(7, 0.1));
		System.out.println("Here is what is in the lake to begin with ...");
		weirdLake.listAllThings();
		// Create two people to fish in the lake
		Fisher fred = new Fisher("Fred", 15);
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