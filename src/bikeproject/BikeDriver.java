package bikeproject;

public class

BikeDriver {



    public static void main(String[] args) {

        bikeproject.RoadBike bike1 = new bikeproject.RoadBike();
        bikeproject.RoadBike bike2 = new bikeproject.RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
        bikeproject.MountainBike bike3 = new bikeproject.MountainBike();
//		bike3.mbString();
        MountainBike bike6 = new MountainBike("bull horn", "Bannana", "fat,", "cushy", 82, "firm", "water", 29);
       // bikeproject.Bike bike4 = new Bike("bull horn", "bannana", "fat", "cushy", -82);  this has issues with bike being abstract.

		//System.out.println(bike1.toString());
		//System.out.println(bike2.toString());
		//System.out.println(bike3.toString());


		Bike myBikes[] = {bike1,bike2,bike3}; // polymorphism
		for(Bike b : myBikes) {// this will replace the above code.
			System.out.println(b.toString());
			// virtualMethodInvocation.
		}
    }//end method main

}//end class BikeDriver
