package example;

public class Queue <G> {

	    public static int front, rear, capacity;
	    public static String[] queue;
	    
	    public Queue(int c)
	    {
	        front = rear = 0;
	        capacity = c;
	        queue = new String[capacity];
	    }

		// function to insert an element
	    // at the rear of the queue
	    void queueEnqueue(G data)
	    {
	        // check queue is full or not
	        if (capacity == rear) {
	            System.out.printf("\nQueue is full\n");
	            return;
	        }
	 
	        // insert element at the rear
	        else {
	            queue[rear] = (String) data;
	            rear++;
	        }
	        return;
	    }
	 
	    // function to delete an element
	    // from the front of the queue
	    static void queueDequeue()
	    {
	        // if queue is empty
	        if (front == rear) {
	            System.out.printf("\nQueue is empty\n");
	            return;
	        }
	 
	        // shift all the elements from index 2 till rear
	        // to the right by one
	        else {
	            for (int i = 0; i < rear - 1; i++) {
	                queue[i] = queue[i + 1];
	            }
	 
	            // store 0 at rear indicating there's no element
	            if (rear < capacity)
	                queue[rear] = null;
	 
	            // decrement rear
	            rear--;
	        }
	        return;
	    }
	 
	    // print queue elements
	    static void queueDisplay()
	    {
	        int i;
	        if (front == rear) {
	            System.out.printf("\nQueue is Empty\n");
	            return;
	        }
	 
	        // traverse front to rear and print elements
	        for (i = front; i < rear; i++) {
	            System.out.printf(" %s <-- ", queue[i]);
	        }
	        return;
	    }
	 
	    // print front of queue
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

<<<<<<< HEAD
		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	// print front of queue
	static void queueFront() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nDaraalliin hamgiin urd taliin utga: %d", queue[front]);
		return;
	}

	static boolean isEmpty() {
		if (rear == 0) {
			return true;
		} else {
			return false;
=======
		static int size() {
			return capacity;
>>>>>>> branch 'master' of https://github.com/Maralaanaa/F.CS311.git
		}
	}
	 