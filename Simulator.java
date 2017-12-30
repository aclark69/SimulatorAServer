
import java.util.Scanner;



public class Simulator {



    CircularQueue queue = new CircularQueue(100);



    ClientQueue seekData2 = new ClientQueue();



    Scanner input = new Scanner(System.in);



    public int totalTime = 480;



    public int timeDone = 0;



    public void runSimulation() {



        for (int clock = 0; clock < totalTime; clock++) {



            seekData2.checkNewArrival();



            timeDone = timeDone + clock;



        }



    }



}