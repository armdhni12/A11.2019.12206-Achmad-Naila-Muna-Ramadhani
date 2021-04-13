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

    public void set_color(String new_color){
        this.color=new_color;
        
    }
    public String get_color(){
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

class Kendaraaan_bermotor extends Vehicles{
    public int sizeofengine=1;
    public String licenseplate="H 1 IDN";


    public Kendaraaan_bermotor(){}


    public Kendaraaan_bermotor(int sizeofengine,String licenseplate){
        this.sizeofengine=sizeofengine;
        this.licenseplate=licenseplate;
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
    
    @Override
    public void getstraight(){
        System.out.println("Kendaraan maju");
    }

}


class Sepeda_motor extends Kendaraaan_bermotor{
    private int numgear=0;

    public Sepeda_motor(){};
    public void setgear(int numgear){
        this.numgear=numgear;

    }

    public int getgear(){
        return numgear;
    }

    @Override
    public void get_speed(int new_speed){
        System.out.print("Kecepatan sepeda motor:"+new_speed);
    }

    @Override
    public void getstraight(){
        System.out.println("Sepeda motor Telah melaju");
    }


}


class Mobil extends Kendaraaan_bermotor{
    boolean seatbelt=false;
    public Mobil(){};

    public void atur_sabuk(boolean seatbelt){
        this.seatbelt=seatbelt;
    }

    public boolean getseatbelt(){
        return seatbelt;
    }
    
}

public class Ujikendaraan{
    public static void main(String[] args){
        Sepeda tessepeda=new Sepeda();
        Sepeda_motor tesmotor=new Sepeda_motor();
        kendaraanmelaju(new Sepeda_motor());
        tesmotor.setgear(4);
        System.out.println("Gigi sepeda motor pada angka:"+tesmotor.getgear());
        tesmotor.get_speed(60);

        
        
    }
    public static void kendaraanmelaju(Vehicles x){
        x.getstraight();
        System.out.println("Warna:"+x.get_color());
    }
}