package transportasi;
public class Sepedamotor{
    public int sizeofengine=1;
    public String licenseplate="H 1 IDN";

    public Sepedamotor(){}
    public Sepedamotor(int sizeEng,String lcplate){
        this.sizeofengine=sizeEng;
        this.licenseplate=lcplate;
    }

    public int get_sizeofengine(){
        return sizeofengine;
    }

    public String get_licenseplate(){
        return licenseplate;
    }



}
