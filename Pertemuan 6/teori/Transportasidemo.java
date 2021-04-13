import transportasi.Sepeda;
import transportasi.Sepedamotor;
public class Transportasidemo{
    public static void main(String[] args){
        Sepeda tessepeda=new Sepeda();
        Sepedamotor tessepedamotor=new Sepedamotor();

        tessepeda.warna();
        System.out.println("Plat Nomor Sepeda Motor:"+tessepedamotor.get_licenseplate());

    }
}
