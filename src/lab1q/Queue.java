package lab1q;

public class Queue {
	    public static int front, rear, capacity;
	    public static int[] queue;
	    public Queue(int c)
	    {
	        front = rear = 0;
	        capacity = c;
	        queue = new int[capacity];
	    }
	    void queueEnqueue(int data)
	    {
	        if (capacity == rear) {
	            System.out.printf("\nQueue is full\n");
	            return;
	        }
	        else {
	            queue[rear] =data;
	            rear++;
	        }
	        return;
	    }
	    static void queueDequeue()
	    {
	        // if queue is empty
	        if (front == rear) {
	            System.out.printf("\nQueue is empty\n");
	            return;
	        }
	        else {
	            for (int i = 0; i < rear - 1; i++) {
	                queue[i] = queue[i + 1];
	            }
	            if (rear < capacity)
	                queue[rear] =0;
	            rear--;
	        }
	        return;
	    }
	    static void queueDisplay()
	    {
	        int i;
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	        for (i = front; i < rear; i++) {
	            System.out.printf(" %d <-- ", queue[i]);
	        }
	        return;
	    }
	    static void queueFront()
	    {
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	        System.out.printf("\nFront Element is: %d", queue[front]);
	        return;
	    }
	    static boolean isEmpty() {
			if (rear == 0) {
				return true;
			} else {
				return false;
			}
		}
	   static int size() {
			return capacity;
               }
	}
