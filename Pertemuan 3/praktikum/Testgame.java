public class Testgame{
    public static void main(String[] args){
        Gameplayer tesP=new Gameplayer(30,40);
        Gameenemy tesE=new Gameenemy();
        tesP.run(60);
        System.out.println("The width of player is:"+tesP.getwidth());
        tesE.run();
    }
}