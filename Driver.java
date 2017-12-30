
import java.util.Scanner;



public class Driver {



    Scanner input = new Scanner(System.in);



    public int totalTime = 480;



    public int timeDone = 0;



    public static void main(String[] args) {



        Driver sim = new Driver();

        ClientQueue seekData = new ClientQueue();

        sim.runSimulation(seekData);// server 1

        System.out.println("lets get it");

        System.out.println("Dropped Clients = " + seekData.getDroppedClients());

        System.out.println("Average Wait time = " + seekData.getAverageWait());

        System.out.println("Clients served = " + seekData.getClientsServed());

        System.out.println("Total wait time = " + seekData.getTotalWaitTime());

        

    }



    public void runSimulation(ClientQueue seekData2) {



        for (int clock = 0; clock < totalTime; clock++) {

            seekData2.checkNewArrival();

            timeDone = timeDone + clock;

        }



    }



}