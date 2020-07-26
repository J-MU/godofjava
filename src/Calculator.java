
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;int b=5;
		Calculator cal= new Calculator();
		System.out.printf("Calculator started!\n");
		System.out.printf("add %d + %d = %d\n",a,b,cal.add(a,b));
		System.out.printf("add %d + %d = %d\n",a,b,cal.subtract(a,b));
		System.out.printf("add %d + %d = %d\n",a,b,cal.multiply(a,b));
		System.out.printf("add %d + %d = %d\n",a,b,cal.divide(a,b));
		
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
		}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
	}

}
