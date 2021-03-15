class Motor{
    int transmision=0;
    boolean engine;

    //method to start the engine
    public void start_engine(boolean turnon_engine){
        System.out.println("Car is turn on,Your transmision is on N.please move up the transmision.");
    }
    //method to increase the transmision to one level up
    public void changeup_transmision(){
        transmision=transmision+1;
        System.out.println("The transmision is in:"+transmision);
    }
    public void turnof_engine(){
        System.out.println("the engine is turning off.");
    }
}
//main class
public class Montor2{
    public static void main(String[] args){
        Motor demo=new Motor();
        demo.start_engine(true);
        demo.changeup_transmision();
        
    }
}