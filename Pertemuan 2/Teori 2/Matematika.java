class Matematika{
    int angka1=0;
    int angka2=0;
    int jumlah=0;
    int kurang=0;
    int kali=0;
    int bagi=0;

    void ubahangka1(int newValue){
        angka1=angka1+newValue;
    }
    void ubahangka2(int newValues){
        angka2=angka2+newValues;
        System.out.println("angka2:"+angka2);
    }
    // void penjumlahan(){
    //     jumlah=angka1+angka2;
    //     System.out.println(jumlah);
    // }
    void penjumlahan(int x,int y){
        jumlah=jumlah+x+y;
        System.out.println(x+"+"+y+"="+jumlah);
    }
    void pengurangan(int x,int y){
        kurang=kurang+x-y;
        System.out.println(x+"-"+y+"="+kurang);
    }

    void perkalian(int x,int y){
        kali=kali+x*y;
        System.out.println(x+"*"+y+"="+kali);
    }
    void pembagian(int x,int y){
        bagi=bagi+x/y;
        System.out.println(x+":"+y+"="+bagi);
    }

}
class Matematikademo{
    public static void main(String[] args){
        Matematika operasi=new Matematika();
        operasi.angka1=20;
        operasi.angka2=20;
        operasi.ubahangka2(0);
        operasi.penjumlahan(20,20);
        operasi.pengurangan(10,5);
        operasi.perkalian(10,20);
        operasi.pembagian(20,2);
        // System.out.println("hasil penjumlahan"+operasi.penjumlahan());
    }
}