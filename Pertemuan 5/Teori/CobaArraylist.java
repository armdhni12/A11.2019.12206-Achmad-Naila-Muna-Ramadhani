import java.util.ArrayList;

class Array_list{
 public static ArrayList<String> l1=new ArrayList<String>();
 public static ArrayList<String> l2=new ArrayList<String>();

}
class Tambah_kurang_edit_isi extends Array_list{
    public ArrayList<String> l1=new ArrayList<String>();
    public ArrayList <String> l2=new ArrayList<String>();

    public void tambah_elemen(String new_elemen){
        super.l1.add(new_elemen);

    }
    public void tambah_elemen2(String new_elemen){
        super.l2.add(new_elemen);
    }

    public void edit_elemen(int index,String new_elemen){
        super.l1.set(index,new_elemen);
    }

    public void hapus_elemen(int index){
        super.l1.remove(index);
    }

}


public class CobaArraylist{
    public static void main(String[] args){
        // Stack<String> tambah=new Stack<String>();
        Array_list r=new Array_list();
        Tambah_kurang_edit_isi isi=new Tambah_kurang_edit_isi();
        isi.tambah_elemen("rumah");
        isi.tambah_elemen("home");
        isi.tambah_elemen("eaakk");
        isi.edit_elemen(1,"mabar");
        isi.tambah_elemen2("Anjay");
        isi.hapus_elemen(2);
        System.out.println(r.l1);

        // System.out.println(r.elemen1);
        // System.out.println(r.elemen2);
        
    }
}
