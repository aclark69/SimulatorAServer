
import java.util.Random;





public class CircularQueue {



Random random = new Random();


int maxProcessingTime = 5;

public int[] queueArray;

public int clientNumber;

public int queueSize = 100;

public int front, rear, numberOfItems = 0;


CircularQueue(int size) {

queueSize = size;

queueArray = new int[queueSize];

}



public void insert(int input) {

queueArray[rear] = input;

rear = (rear + 1) % queueArray.length;

numberOfItems++;

//System.out.println("Insert " + input + "was added to the queue");

}


public int size() {

return numberOfItems;

}


public void printArray() {

for(int i =0; i<queueSize; i++)

{

System.out.println(queueArray[i]);

}

}



}