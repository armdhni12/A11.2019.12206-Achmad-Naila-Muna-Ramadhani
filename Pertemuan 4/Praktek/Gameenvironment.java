import java.util.ArrayList;
public class Gameenvironment{
    private double width;
    private double height;
    private ArrayList<Gameplayer> arrPlayer=new ArrayList<Gameplayer>();
    private ArrayList<Gameenemy> arrEnemy=new ArrayList<Gameenemy>();

    public Gameenvironment(){}

    public Gameenvironment(double width,double height){
        this.width=width;
        this.height=height;
    }

    public void addplayer(Gameplayer newplayer){
        arrPlayer.add(newplayer);
    }

    public void removeplayer(Gameplayer removeplayer){
        arrPlayer.remove(removeplayer);
    }

    public void getAllPlayer(){
        System.out.println("All of players: "+arrPlayer);
    }

    public void addenemy(Gameenemy Gameenemy){
        arrEnemy.add(Gameenemy);
    }

    public void removeenemy(Gameenemy Gameenemy){
        arrEnemy.remove(Gameenemy);
    }

    public void  getAllEnemy(){
        System.out.println(arrEnemy);
    }

    public void interaction(){
        if(arrPlayer.isEmpty() || arrEnemy.isEmpty()){System.out.println("player or enemy not sets");
        }

        for(int i=0;i<arrPlayer.size();i++){
            for(int j=0;j<arrEnemy.size();j++){
                if(arrPlayer.get(i).gety()!=arrEnemy.get(j).gety()){
                    System.out.println("Player: "+arrPlayer.get(i)+" and Enemy: "+arrEnemy.get(j)+" is not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).getx(),arrPlayer.get(i).gety(),arrEnemy.get(j).getx(),arrEnemy.get(j).gety())<2){
                    System.out.println("Player: "+arrPlayer.get(i)+" attacked");
                    System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
                    removeenemy(arrEnemy.get(j));
                }
                else{
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).run((int)Math.ceil(Math.random()*10));
                    System.out.println("current x position =  " + arrPlayer.get(i).getx() +" <==");
                }
            }
        }

        // for i=0 to arrPlayer.size():
        //     for j=0 to arrEnemy.size():
        //         if arrPlayer.get(i).getY() != arrEnemy.get(j).getY() t
    }


    public static double EuclideanDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

    }



    public static void main(String[] args){
        Gameplayer hero=new Gameplayer();
        hero.setdimension(12,12);
        hero.setposition(10,220);
        System.out.println("Posisi Player: "+hero.getx()+","+hero.gety());
        hero.run(12);
        System.out.println("Posisi Player: "+hero.getx()+","+hero.gety());
        Gameplayer hero2=new Gameplayer();
        hero.setdimension(12,32);
        hero.setposition(10,10);
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