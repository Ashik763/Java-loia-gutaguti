package ashik;

class Fish extends Animal implements Pet{

    public Fish()
    {
        super(0);
    }
    @Override
    public  void eat()
    {
        System.out.println(""+Name+" eat plants");
    }
    String Name;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void walk()
    {
        System.out.println(""+Name+" has no legs.");
    }
}
