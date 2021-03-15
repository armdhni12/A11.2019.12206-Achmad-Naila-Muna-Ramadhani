//class and the data field
class Bunder{
    double radius=1;
    double area=0;

    // void changeradius(double newrad){
    //     radius=newrad;
    //     System.out.println("radius:"+radius);
    // }

    //constructors and methods
    bunder(){

    }
    //to set new radius
    bunder(double newrad){
        radius=newrad;
    }
    //methods for get the area of circle
    void getArea(){
        area=area+radius*radius*Math.PI;
        System.out.println("area dengan radius:"+radius+" adalah: "+area);
    }
}
//main class
public class TestSimpleCircle{
    public static void main(String[] args){
        Bunder circel1=new Bunder();
        // circel1.radius=1;
        // tes.changeradius(25);
        circel1.getArea();

        Bunder circel2=new Bunder(25);
        circel2.getArea();

        Bunder circel3=new Bunder(125);
        circel3.getArea();

    }
}
