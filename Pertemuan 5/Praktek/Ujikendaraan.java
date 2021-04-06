class Vehicles{
    public double speed=0;
    public String color="Orange";

    public Vehicles(){

    }
    public void getstraight(){
        System.out.println("Maju...");
    }
    
    public void turnleft(){
        System.out.println("belok kiri");

    }

    public void belok_kanan(){
        System.out.println("Belo kanan");
    }

    public String set_color(String new_color){
        this.color=new_color;
        return color;
    }

    public int set_speed(int speed){
        this.speed=speed;
        return speed;
    }
}

class Sepeda extends Vehicles{
   public Sepeda(){}
    public void Ringbell(){
        System.out.println("Kiring kring...");
    }
    public void warna(){
        System.out.println("The color of bike is:"+super.color);
    }
}

class Sepeda_motor extends Vehicles{
    public int sizeofengine=1;
    public String licenseplate="H 1 IDN";

    public Sepeda_motor(){}
    public Sepeda_motor(int sizeEng,String lcplate){
        this.sizeofengine=sizeEng;
        this.licenseplate=lcplate;
    }

    public int get_sizeofengine(){
        return sizeofengine;
    }

    public String get_licenseplate(){
        return licenseplate;
    }

    public void get_speed(int new_speed){
        System.out.println("This Motorcycle can reach maximum speed at:"+super.set_speed(new_speed));
    }



}

public class Ujikendaraan{
    public static void main(String[] args){
        Sepeda tessepeda=new Sepeda();
        tessepeda.warna();
        Sepeda_motor honda=new Sepeda_motor();
        honda.get_speed(126);
        
    }
}