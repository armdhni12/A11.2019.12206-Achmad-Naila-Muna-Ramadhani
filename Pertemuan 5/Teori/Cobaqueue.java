import java.util.Queue;
import java.util.LinkedList;

class Queuelist{
 public static Queue<String> q1=new LinkedList<String>();
 public static Queue<String> q2=new LinkedList<String>();

}
class Tambah_kurang_edit_isi extends Queuelist{
    public Queue<String> q1=new LinkedList<String>();
    public Queue <String> q2=new LinkedList<String>();

    public void tambah_elemen(String new_elemen){
        super.q1.add(new_elemen);

    }
    public void tambah_elemen2(String new_elemen){
        super.q2.add(new_elemen);
    }

    // public void edit_elemen(int index,String new_elemen){
    //     super.q1.set(index,new_elemen);
    // }

    public void hapus_elemendepan(){
        super.q1.poll();
    }
    public void hapus_elemendepan2(){
        super.q2.poll();
    }

}


public class Cobaqueue{
    public static void main(String[] args){
        // Stack<String> tambah=new Stack<String>();
        Queuelist r=new Queuelist();
        Tambah_kurang_edit_isi isi=new Tambah_kurang_edit_isi();
        isi.tambah_elemen("rumah");
        isi.tambah_elemen("home");
        // isi.edit_elemen(1,"mabar");
        isi.tambah_elemen2("Anjay");
        System.out.println("Data sebelum dihapus:");
        System.out.println(r.q1);
        System.out.println(r.q2);
        System.out.println("Data setelah dihapus:");
        isi.hapus_elemendepan();
        isi.hapus_elemendepan2();
        System.out.println(r.q1);
        System.out.println(r.q2);

        // System.out.println(r.elemen1);
        // System.out.println(r.elemen2);
        
    }
}
