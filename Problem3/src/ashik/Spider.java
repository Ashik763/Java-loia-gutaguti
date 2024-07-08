package ashik;

class Spider extends Animal {

    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("spider eat insects");
    }

    void walk() {
        try{
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("An error occour");
        }
    }
}

