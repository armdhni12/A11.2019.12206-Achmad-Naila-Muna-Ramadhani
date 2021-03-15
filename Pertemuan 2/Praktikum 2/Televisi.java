
//extension for input.
import java.io.*;
import java.util.Scanner;
//class
class Tv{

    int channel=1;
    int vol=1;
    boolean turnon=true;
    boolean turoff=true;
    int chan_up;
    int chan_down;

    int vol_up;
    String setuju;
    char c;
    InputStreamReader cin;

    //a constructor for the method
    

    void turnON(){
        turnon=true;
        System.out.println("Televisi is turn on");
    }
    //function to turn off
    // void turnof() throws IOException{
    //     try{
    //         cin=new InputStreamReader(System.in);
    //         System.out.println("Are u sure to turn of the TV?(Please press 'y' if u sure)");
    //         System.out.print("Your Answer:");
    //         do{
    //             c=(char)cin.read();
    //             if (c!='y'){
    //                 System.out.println(c);
                
    //             }
    //             else{
    //                 System.out.println("Tv is turning off.");
    //             }
    //         } while(c!='y');

    //     }finally{
    //         if(cin !=null){   
    //             cin.close();
    //         }
    //     }
    // }
    void turnof(){
        while(turoff){
            Scanner sure=new Scanner(System.in);
            System.out.println("Are u sure to turn off the television?.Please input an answer between yes/no");
            System.out.print("Your Answer:");
            setuju=sure.nextLine();
            if(setuju.equals("yes")){
                System.out.println("Television is turning off.");
                
                turoff=false;
            }
            else{
                System.out.println("Enjoy the program.");
                turoff=false;

            }
        }
    }

    void setchannel(){
        //to set the channel programm number

        while(turnon){
            Scanner stch=new Scanner(System.in);
            System.out.print("Input the number of channel:");
            channel=stch.nextInt();

            if(channel>=1 && channel<=120){
                
                turnon=false;
            }
            else{
                System.out.println("There's no number of channel please input it again");
                turnon=true;
            }

        }
        
    }

    void volume(int newvolume){
        //to set the volume level
        vol=newvolume;
    }

    //to incrase the number of program
    void gantichannelatas(){
        chan_up=channel+=1;
        
    }

    //decrease number of program
    void gantichannelbawah(){
        chan_down=channel-=1;

    }
// to incrase level of volume
    void getvolumeUp(){
        vol_up=vol+=1;
    }
    
}

public class Televisi{
    public static void main(String[] args){
        Tv tv1=new Tv();
        tv1.turnON();
        tv1.setchannel();
        tv1.volume(3);
        System.out.println("Tv1 is on channel:"+tv1.channel+" And "+"VOlume is on: "+tv1.vol);

        System.out.println('\n');
        
        Tv tv2=new Tv();
        tv2.turnON();
        tv2.gantichannelatas();
        tv2.gantichannelatas();
        tv2.getvolumeUp();
        System.out.println("Tv2 is on channel:"+tv2.chan_up+" and the volume level is:"+tv2.vol_up);
        tv2.turnof();

        // Scanner off= new Scanner(System.in);
        // System.out.print("wqweq:");
        // double dd=off.nextDouble();
        // System.out.println(dd);
    
    }
}