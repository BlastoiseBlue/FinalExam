package problems1and2;

public class Calculator {
	int[] arr;

	public Calculator(int[] a1) {
		arr = a1;
	}

	public Calculator() {

	}

	public int numberOfNegativeElements() {
		int n = 0;
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] < 0)
				n++;
		}
		return n;
	}

	public void printArray() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}

	public void tripleEveryFourthElement() {
		for (int i = 0; i < this.arr.length; i++) {
			if (i % 4 == 0)
				this.arr[i] = this.arr[i] * 4;
		}
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int[] a1 = { 1, 3, 1, 2, -4, -2, 1, 1, -2, -6 };
		c1.arr = a1;
		System.out.println(c1.numberOfNegativeElements());
		c1.printArray();

	}

}
