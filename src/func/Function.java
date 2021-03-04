package func;

public class Function implements IFunction {
	@Override
	public double div(int a, int b) {
		
	}
	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		int mul = a *b;
		return mul;
	}


	public int add(int a, int b) {
		int result=0;
		result=a+b;
		return result;
	}
}
