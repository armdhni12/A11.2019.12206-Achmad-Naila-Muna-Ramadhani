import java.util.Stack;

class Stack1{
 public static Stack<String> elemen1=new Stack<String>();
 public static Stack<String> elemen2=new Stack<String>();

}
class Tambahisi extends Stack1{
    public Stack<String> elemen1=new Stack<String>();
    public Stack <String> elemen2=new Stack<String>();

    public void tambah_elemen(String new_elemen){
        super.elemen1.push(new_elemen);

    }
    public void tambah_elemen2(String new_elemen){
        super.elemen2.push(new_elemen);
    }

    public void edit_elemen(int index,String new_elemen){
        super.elemen1.set(index,new_elemen);
    }

}


public class Cobastack{
    public static void main(String[] args){
        // Stack<String> tambah=new Stack<String>();
        Stack1 r=new Stack1();
        Tambahisi isi=new Tambahisi();
        isi.tambah_elemen("rumah");
        isi.tambah_elemen("home");
        isi.edit_elemen(2,"mabar");
        isi.tambah_elemen2("Anjay");

        System.out.println(r.elemen1);
        System.out.println(r.elemen2);
        
    }
}
