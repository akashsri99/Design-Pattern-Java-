public class PizzaMaker {
    public static void main(String [] args){
        Pizza basePizza = new CheeseBurst(new PlainPizza());
        System.out.println(basePizza.getDescription() + " " +basePizza.getCost());

        Pizza doubleCheeseBurstPizza = new CheeseBurst(new CheeseBurst(new PlainPizza()));
        System.out.println(doubleCheeseBurstPizza.getDescription() + " " +doubleCheeseBurstPizza.getCost());
    }
    
}