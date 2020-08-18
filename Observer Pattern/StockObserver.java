
public class StockObserver implements Observer{

	private double price;
	private static int observerTrackerID = 0;
	private int observerID;
	private Subject stockGrabber;
	
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerTrackerID;
		
		System.out.print("New Observer " + this.observerID + "\n");
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double price) {
		// TODO Auto-generated method stub
		this.price = price;
		
		System.out.println("Price updated on observer" + this.observerID + " with price " + this.price);
	}

}
