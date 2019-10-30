package bikeproject;

public abstract class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int NumGears;
    private final String make;

    public Bike() {
        this.make = "Oracle Cycles";
    }//end constructor

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        if( numGears < 1) {
            numGears = 1;
        }
        NumGears = numGears;
        this.make = "Oracle Cycles";
    }//end constructor

    public String toString()//overriding the toString() method
    {
        return "\n" + this.make + "\n"
                + "This bike has " + this.handleBars + " handlebars on a "
                + this.frame + " frame with " + this.NumGears + " gears."
                + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.";
    }

    @Override
    public String getHandleBars() {
        return null;
    }
         // use control + ins to gen code.
    @Override
    public String getSeatType() {
        return null;
    }

    @Override
    public String getTyres() {
        return null;
    }
	/*protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}*///end method printDescription

}//end class Bike
	
	

