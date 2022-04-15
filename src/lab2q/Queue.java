package lab2q;

public class Queue <G>{
	    public static int front, rear, capacity;
	    public static String[] queue;
	    public Queue(int c)
	    {
	        front = rear = 0;
	        capacity = c;
	        queue = new String[capacity];
	    }
	    void queueEnqueue(G data)
	    {
	        // check queue is full or not
	        if (capacity == rear) {
	            System.out.printf("\nQueue is full\n");
	            return;
	        }
	        else {
	            queue[rear] = (String) data;
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
	                queue[rear] = null;
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
	            System.out.printf(" %s <-- ", queue[i]);
	        }
	        return;
	    }
	    static void queueFront()
	    {
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	        System.out.printf("\nFront Element is: %s", queue[front]);
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
