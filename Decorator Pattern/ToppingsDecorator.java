abstract class ToppingsDecorator implements Pizza{
    
    protected Pizza tmpPizza;

    public  ToppingsDecorator( Pizza newPizza){
        tmpPizza = newPizza;
    }

    public String getDescription(){
        return tmpPizza.getDescription();
    }

    public double getCost(){
        return tmpPizza.getCost();
    }

}