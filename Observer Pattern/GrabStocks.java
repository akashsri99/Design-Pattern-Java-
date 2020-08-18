public class GrabStocks {
	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setPrice(100);
		
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setPrice(200);
		stockGrabber.setPrice(300);
	
	}

}
