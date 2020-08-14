class Main{
    public static void main(String args[]){
        System.out.println("Testing");

        Birds parrot = new Birds("Parrot", 24);
//        parrot.setFlyingBehaviour(new ItFly());

        Mammals whale = new Mammals("Whale", 500);
        whale.setFlyingBehaviour(new ItCantFly());

        System.out.println(parrot);
        System.out.println(whale);

    }
}