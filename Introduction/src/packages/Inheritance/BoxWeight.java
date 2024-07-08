package packages.Inheritance;
//Inheriting parents' class  properties from child class

public class BoxWeight extends Box {
    double weight ;
    public BoxWeight(){
        this.weight=-2;
    }
    public BoxWeight(double l,double w,double h,double weight){
        super(l,h,w);
        this.weight=weight;


//


    }

}
