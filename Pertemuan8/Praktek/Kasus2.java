import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.lang.NumberFormatException;

class Retailermobil{
    public static ArrayList<ArrayList<String>> Pelanggan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Sedan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Minibus = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Bus = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Urus = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> JmlHrg = new ArrayList<String>();
    static String umur, nama, harga;
    static String noID, warna, typecar;

     public void ID_Konsumen(){
        this.umur=umur;
        this.nama=nama;
        this.noID=noID;
    } 

    public void ID_karyawan(){
        this.umur=umur;
        this.nama=nama;
        this.noID=noID;
    }
}
class Set_idkonsumen extends Retailermobil{
    public String set_umur(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input umur: ");
        umur = inputkonsumen.nextLine();
        return umur;
    }

    public String set_id(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input Nomor Idensitas (KTP): ");
        noID = inputkonsumen.nextLine();
        return noID;
    }

    public String set_namakostumer(){
        Scanner inputkonsumen=new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = inputkonsumen.nextLine();
        return nama;
    }
    
}
class Input_customer extends Set_idkonsumen{
    Input_customer(){
    }

    public void data_pembelian(){
        int z = Pelanggan.size();
        z+=1;
        System.out.println("Input ke-"+ z);
        super.set_namakostumer();
        super.set_umur();
        super.set_id();

        int p = Pelanggan.size();
        Pelanggan.add(new ArrayList<String>());
        Pelanggan.get(p).add(0, umur);
        Pelanggan.get(p).add(1, nama);
        Pelanggan.get(p).add(2, noID);
        System.out.println("Silahkan masukan Pilihan:\n 1. Sedan, 2. Minibus, 3. Bus\n");
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan pilihan anda sesuai dengan nomor menu: ");
        int jenis = input.nextInt();
        if (jenis==1){
            System.out.println("**************************************");
            System.out.println("\nData mobil Sedan yang dapat anda beli");
            System.out.println("**************************************");
            for(int i=0; i < Sedan.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type-Mobil: "+Sedan.get(i).get(0));
                System.out.println("Warna     : "+Sedan.get(i).get(1));
                System.out.println("Harga     : "+Sedan.get(i).get(2));
                super.JmlHrg.add(Sedan.get(i).get(2));
                // super.Pelanggan.add(2,Sedan.get(0));
                // super.Pelanggan.add(3,Sedan.get(1));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Sedan.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Sedan.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Sedan.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
        else if (jenis==2){
            System.out.println("*******************************");
            System.out.println("\nCetak data mobil MiniBus");
            System.out.println("*******************************");
                
            for(int i=0; i < Minibus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Mobil: "+Minibus.get(i).get(0));
                System.out.println("Warna     : "+Minibus.get(i).get(1));
                System.out.println("Harga     : "+Minibus.get(i).get(2));
                super.JmlHrg.add(Minibus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Minibus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Minibus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Minibus.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
        else if (jenis==3){
            System.out.println("\nCetak data mobil Bus");
            System.out.println("_____________________________");
                
            for(int i=0; i < Bus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Mobil: "+Bus.get(i).get(0));
                System.out.println("Warna     : "+Bus.get(i).get(1));
                System.out.println("Harga     : "+Bus.get(i).get(2));
                super.JmlHrg.add(Bus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                System.out.print("Masukan pilihan:");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Bus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Bus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Bus.get(pil-1).get(2));
                }else{
                    System.out.println("Pesanan Anda akan kami proses silahkan menuju ke kasir untuk proses pembayaran");
                    break;
                }
            }
        }
    }
}

class Cetak_datapelanggan extends Set_idkonsumen{
    public void cetak(){
            System.out.println("\nCetak semua data");
            System.out.println("_____________________________");
            
        for(int i=0; i < Pelanggan.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Pelanggan.get(i).get(0));
            System.out.println("Umur     : "+Pelanggan.get(i).get(1));
            System.out.println("ID       : "+Pelanggan.get(i).get(2));
            System.out.println("");           
        }
    }
}

class Setkaryawan extends Retailermobil{
    Setkaryawan(){}

    public String Umur(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input umur: ");
        umur = input.nextLine();
        return umur;
    }

    public String Identitas(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Nomor Idensitas Kerja: ");
        noID = input.nextLine();
        return noID;
    }

    public String Nama(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        return nama;
    }

    public void set2D(){   
        int z = Urus.size();
        z+=1;
        System.out.println("Input ke-"+ z);
        Nama();
        Umur();
        Identitas();
        // super.Beli(int n);

        int p = Urus.size();
        Urus.add(new ArrayList<String>());
        Urus.get(p).add(0, nama);
        Urus.get(p).add(1, umur);
        Urus.get(p).add(2, noID);
    }

    public void untung(){
        int z0 = 0;
        for(int i = 0; i<JmlHrg.size(); i++){
            String z2 = JmlHrg.get(i);
            int z1 = Integer.parseInt(z2);
            z0 = z0 + z1;
        }
        System.out.println("untung:"+(z0*0.1));
    }
}

class Set_mobiljual extends Setkaryawan{
    Set_mobiljual(){
    }

    public void inSedan(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan mobil sedan yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Sedan.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input1.nextLine();
            int p = Sedan.size();
            Sedan.add(new ArrayList<String>());
            Sedan.get(p).add(0, typecar);
            Sedan.get(p).add(1, warna);
            Sedan.get(p).add(2, harga);
        }
    }

    public void inMinibus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan minibus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Minibus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input2.nextLine();
            int p = Minibus.size();
            Minibus.add(new ArrayList<String>());
            Minibus.get(p).add(0, typecar);
            Minibus.get(p).add(1, warna);
            Minibus.get(p).add(2, harga);
        }
    }

   public void inBus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       System.out.println("\nMasukkan Bus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Bus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type mobil: ");
            typecar = input1.nextLine();
            System.out.print("Input warna mobil: ");
            warna = input2.nextLine();
            System.out.print("Input harga mobil: ");
            harga = input2.nextLine();
            int p = Bus.size();
            Bus.add(new ArrayList<String>());
            Bus.get(p).add(0, typecar);
            Bus.get(p).add(1, warna);
            Bus.get(p).add(2, harga);
        }
    } 

    
}
class Get_datamobil extends Set_mobiljual{
    public void get_sedan(){
        System.out.println(Sedan);
        System.out.println("\nCetak data mobil sedan");
        System.out.println("_____________________________");
            
        for(int i=0; i < Sedan.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Sedan.get(i).get(0));
            System.out.println("Warna     : "+Sedan.get(i).get(1));
            System.out.println("Harga     : "+Sedan.get(i).get(2));
            System.out.println("");
        }
    }    

    public void get_minibus(){
        System.out.println(Minibus);
        System.out.println("\nCetak data mobil Minibus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Minibus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Minibus.get(i).get(0));
            System.out.println("Warna     : "+Minibus.get(i).get(1));
            System.out.println("Harga     : "+Minibus.get(i).get(2));
            System.out.println("");
        }
    }  

    public void get_bus(){
        System.out.println(Bus);
        System.out.println("\nCetak data mobil Bus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Bus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Mobil: "+Bus.get(i).get(0));
            System.out.println("Warna     : "+Bus.get(i).get(1));
            System.out.println("Harga     : "+Bus.get(i).get(2));
            System.out.println("");
        }
    }

    public void get_data(){
        get_sedan();
        get_minibus();
        get_minibus();
    }        
}

class Edit_harga extends Get_datamobil{
    Scanner input1 = new Scanner(System.in);
    public void ubah(){
        System.out.println("Semua karyawan=");
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;
            System.out.println(x+". "+Urus.get(i).get(0));
        }
        System.out.print("\nPilih siapa yang ingin mengubah harga dengan menyantumkan angka: ");
        int plh = input1.nextInt();
        System.out.println("\n1. Sedan, 2.MiniBus, 3.Bus ");
        int plh2 = input1.nextInt();
        if (plh2==1){
            super.get_sedan();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga sedan");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Sedan.get(plh3-1).get(0));
            System.out.println("Warna     : "+Sedan.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Sedan.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Sedan.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Sedan.get(plh3-1).get(2));
        }else if (plh2==2){
            super.get_minibus();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Minibus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Minibus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Minibus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Minibus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Minibus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Minibus.get(plh3-1).get(2));
        }else if (plh2==3){
            super.get_bus();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Bus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input1.nextInt();
            System.out.println("Type Mobil: "+Bus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Bus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Bus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Bus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Bus.get(plh3-1).get(2));
        }               
    }
}

class Get_datakaryawan extends Setkaryawan{
    public void cetak(){
        System.out.println(Urus);
        System.out.println("\nCetak semua data");
        System.out.println("_____________________________");
            
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Urus.get(i).get(0));
            System.out.println("Umur     : "+Urus.get(i).get(1));
            System.out.println("ID Karyawan: "+Urus.get(i).get(2));
            System.out.println("");
            
        }
    }
}

class Get_alldata extends Retailermobil{
    public void cetak(){
        System.out.println("******************************");
        System.out.println("\nCetak semua data");
        System.out.println("*******************************");
            
        for(int i=0; i < Pelanggan.size(); i++){
            if(Pelanggan.get(i).size()>5){
                System.out.println("Data Pembelian");
                System.out.println("Nama     : "+Pelanggan.get(i).get(1));
                System.out.println("Umur     : "+Pelanggan.get(i).get(0));
                System.out.println("ID       : "+Pelanggan.get(i).get(2));}
            //     int x=3;
            //     System.out.println("Kendaraan yang dibeli:");
            //     for(int j=0; j < Pelanggan.size(); j++){
            //         int y = x;
            //         System.out.println("\nType Mobil: "+Pelanggan.get(j).get(3));
            //         System.out.println("Warna     : "+Pelanggan.get(j).get(4));
            //         System.out.println("Harga     : "+Pelanggan.get(j).get(5));
            //         x=x+3;
            //     }
            // }
            if(super.Pelanggan.get(i).size()<5){
                System.out.println("Data Pembeli");
                System.out.println("Nama     : "+super.Pelanggan.get(i).get(1));
                System.out.println("Umur     : "+super.Pelanggan.get(i).get(0));
                System.out.println("ID       : "+super.Pelanggan.get(i).get(2));
                // System.out.println("Harga     : "+Pelanggan.get(i).get(5));
            }
            System.out.println("");           
        }
    }
}
public class Kasus2{
    public static void main(String args[]){
        Setkaryawan n1 = new Setkaryawan();
        System.out.println("Input Data karyawan\n");
        n1.set2D();
        // n1.set2D();
        Get_datakaryawan s1 = new Get_datakaryawan();
        s1.cetak();

        Set_mobiljual n2 = new Set_mobiljual();
        n2.inSedan(1);
        n2.inMinibus(1);
        n2.inBus(1);
        Get_datamobil s2 = new Get_datamobil();
        s2.get_data();

        // Edithrg n3 = new Edithrg();
        // n3.ubah();

        Input_customer n = new Input_customer();
        System.out.println("\nInput Data Pelanggan\n");
        n.data_pembelian();
        // n.set2D();
        Cetak_datapelanggan s = new Cetak_datapelanggan();
        s.cetak();

        Get_alldata s0 = new Get_alldata();
        s0.cetak();
        n1.untung();
	}
}





        
                
