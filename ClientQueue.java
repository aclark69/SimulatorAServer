 

import java.util.Random;



public class ClientQueue {



Random random = new Random();

CircularQueue getData = new CircularQueue(100);


public int droppedClients;

int timeDone;

public int clientsServed = 0;

public int averageWait = 0;

public int totalWaitTime = 0;


public void checkNewArrival() {

if(getNewClient() == 5) {

droppedClients++;

}

else if(getNewClient() < 5)

{

timeDone = getNewClient();

if(timeDone != 0)

{

timeDone--;

}

else if (timeDone == 0)

{

clientsServed++;

getData.insert(timeDone);

}

}

}


public int getNewClient() {

clientsServed++;

int processingTime = random.nextInt(6);

totalWaitTime = totalWaitTime + processingTime;

return processingTime;

}


public int getAverageWait() {

int averageWait = totalWaitTime/clientsServed;

return averageWait;

}


public int getDroppedClients() {

return droppedClients;

}


public int getClientsServed() {

return clientsServed;

}


public int getTotalWaitTime() {

return totalWaitTime;

}

}