package ashik;

class Cat extends  Animal implements Pet {
    String Name;
    public Cat (String name)
    {
        super(4);
        this.Name = name;
    }
    public Cat ()
    {
        super(4);
        this.Name = " ";
    }
    //@Override //
    @Override
    public void eat()
    {
        System.out.println("Cat eat fishes");
    }

    //pet implementation...
    public String setName(String name)
    {
        Name = name;
        return null;
    }
    public String getName()
    {
        return Name;
    }

    public void play()
    {
        System.out.println(" cat plays ");
    }
    @Override
    public void walk(int legs)
    {
        System.out.println("no of legs is" +legs+ "so it can walk properly");
    }
}
