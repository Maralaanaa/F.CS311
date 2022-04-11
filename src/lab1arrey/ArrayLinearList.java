package lab1arrey;

public class ArrayLinearList {
	public int size = 0;

	public ArrayLinearList() {

	}

	public boolean empty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return size;
	}

	public int getIndex(int[] array, int element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return 0;
	}

	public int getElement(int[] array, int index) {
		int element;
		element = array[index];
		return element;
	}

	public void add(int[] array, int c) {
		array[size()] = c;
		size = size + 1;
	}

	public void print(int[] array) {
		String s = "";
		System.out.print("Jagsaalt : ");
		for (int i = 0; i < this.size(); i++) {
			System.out.print(this.getElement(array, i) + " ");
		}
	}

	public void remove(int[] array, int index) {
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size = size - 1;
	}
}