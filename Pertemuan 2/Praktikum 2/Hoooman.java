class Human{
    private String name="noname";
    private boolean have_tv=false;

    Human(){}
    Human(String new_name){
        name=new_name;

    }
    public String my_name(){
        return name;
    }
    public void buytv(Tv tiviku){
        have_tv=true;
    }
    public void selltv(){
        have_tv=false;
    }

    public boolean cektv(){
        return have_tv;
    }
  

}
class Tv{}
public class Hoooman{
    public static void main(String[] args){
        Human manusya1= new Human("Achmad Naila Muna Ramadhani");
        System.out.println(manusya1.my_name());
        Tv tvku=new Tv();
        manusya1.buytv(tvku);
        System.out.println(manusya1.cektv());
        manusya1.selltv();
        System.out.println(manusya1.cektv());


    }

}