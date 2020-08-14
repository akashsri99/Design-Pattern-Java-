class  Animal {
    private String name;
    private Integer size;
    private FlyBehaviour flyType;

    Animal(String name, Integer size){
        this.name = name;
        this.size = size;
    }


    public  String toString(){
        return this.name + " " + this.size + " " + this.flyType;
    }

    public void tryToFly(){
        System.out.println(this.flyType);

    }

    public void setFlyingBehaviour( FlyBehaviour flyType){
            this.flyType = flyType;
    };
}