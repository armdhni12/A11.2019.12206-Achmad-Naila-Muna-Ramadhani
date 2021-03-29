
public class Testgame{
    public static void main(String[] args){
        Gameplayer hero=new Gameplayer();
        hero.setdimension(12,12);
        hero.setposition(10,220);
        System.out.println("Posisi Player: "+hero.getx()+","+hero.gety());
        hero.run(12);
        System.out.println("Posisi Player: "+hero.getx()+","+hero.gety());
        Gameplayer hero2=new Gameplayer();
        hero2.setdimension(12,32);
        hero2.setposition(10,10);
        Gameenemy monster=new Gameenemy();
        monster.setdimension(12,32);
        monster.setposition(10,10);


        Gameenvironment scene=new Gameenvironment();
        scene.addplayer(hero);
        scene.addplayer(hero);
        scene.addplayer(hero2);
        scene.getAllPlayer();
        scene.removeplayer(hero);
        scene.getAllPlayer();
        scene.addenemy(monster);
        scene.interaction();


    }

}
