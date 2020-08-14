class Birds extends Animal{
    Birds(String name, Integer size){
        super(name, size);
        this.setFlyingBehaviour(new ItFly());
    }
}