import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private int price;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer oldObserver) {
		int idx = observers.indexOf(oldObserver);
		System.out.print("Observer removed" + oldObserver);
		observers.remove(idx);
		
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer obj: observers) {
			obj.update(this.price);
		}
	}
	
	public void setPrice(int price) {
		this.price = price;
		notifyObserver();
	}


}