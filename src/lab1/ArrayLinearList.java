package lab1;

public class ArrayLinearList {
		public int size=0;
		public ArrayLinearList() {

		}
		public boolean empty() {
			if(size() == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		public int size() {
			return size;
		}
		public int getIndex(int[] a, int element) {
			for(int i=0; i < size; i++) {
				if(a[i] == element) {
					return i;
				}
			}
			return -1;
		}
		public int getElement(int[] a, int index) {
			int element;
			element = a[index];
			return element;
		}
		public void add(int[] a, int c) {
		    a[size()] = c;
		    size=size + 1;
		}
		public void print(int[] a) {
			String s = "";
			System.out.print("Jagsaalt : ");
			for(int i=0; i<this.size(); i++) {
				System.out.print( this.getElement(a, i) + " " );
			}
		}
		public void remove(int[] a, int index) {
			for(int i=index; i<size-1; i++) {
				a[i] = a[i+1];
			}
			size = size-1;
		}
	}