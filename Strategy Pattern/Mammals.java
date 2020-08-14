class Mammals extends Animal{
    Mammals(String name, Integer size){
        super(name, size);
        this.setFlyingBehaviour(new ItCantFly());
    }
}