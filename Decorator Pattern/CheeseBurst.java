public class CheeseBurst extends ToppingsDecorator{
    
    public CheeseBurst(Pizza newPizza){
        super(newPizza);

        System.out.println(("Adding extra cheese"));
    }

    public String getDescription(){
        return tmpPizza.getDescription() + " With Extra Cheese";
    }

    public double getCost(){
        return tmpPizza.getCost() + 100.0;
    }
}