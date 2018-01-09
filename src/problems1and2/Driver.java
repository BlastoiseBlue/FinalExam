package problems1and2;

public class Driver {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int[] a1= {10,2,-3,1,4,-5,3,-5,-2,-1};
		c1.arr=a1;
		c1.printArray();
		c1.tripleEveryFourthElement();
		c1.printArray();
	}

}
