package ashik;

abstract class Animal {
    protected int legs ;
    protected Animal(int legs)
    {
        this.legs = legs;
    }

    public void walk(int legs)
    {
        System.out.println("no of legs is" +legs+ "so it can walk properly");
    }
    public abstract void eat();
}
