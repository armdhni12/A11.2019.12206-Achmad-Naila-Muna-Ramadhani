public class Gameenemy{
    private double width;
    private double height;
    private int positionx;
    private int positiony;
    // private Gameenvirontment environtment;

    public Gameenemy(){

    }
    public Gameenemy(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Gameenemy(double width,double height,int positionx,int positiony){
        this.width=width;
        this.height=height;
        this.positiony=positiony;
        this.positionx=positionx;
    }

    //	Method setDimension merupakan setter untuk property width dan height.
    public void setdimension(double width,double height){
        this.width=width;
        this.height=height;
    }

    //Method setPosition merupakan setter untuk property positionX dan positionY.
    public void setposition(int positionx,int positiony){
        this.positiony=positiony;
        this.positionx=positionx;
    }

    public double getwidth(){
        return width;
    }
    public double getheight(){
        return height;

    }

    public int getx(){
        return positionx;

    }

    public int gety(){
        return positiony;
    }

    public void run(){
        System.out.println("Enemy is running");
    }



    public static void main(String[] args){
        Gameenemy test=new Gameenemy();
        test.setposition(60,30);
        System.out.println("position x:"+test.getx());
        test.run();
    }
}

