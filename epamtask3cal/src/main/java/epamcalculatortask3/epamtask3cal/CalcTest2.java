package epamcalculatortask3.epamtask3cal;

public class CalcTest2 extends CalTest1 implements CalcTest3{
	int result;
	CalcTest2(int a, int b) {
		super(a, b);
		result=0;
	}

	public int add(int a,int b) {
		result=a+b;
		return result;
	}

	public int sub(int a,int b) {
		result=a-b;
		return result;
	}

	public int mul(int a,int b) {
		result=a*b;
		return result;
	}

	public int div(int a,int b) {
		if(a>b) {
			result=a/b;
			return result;
		}
		else if(a>b) {
			result=a/b;
			return result;
		}
		else {
		 result=0;
			return result;
		}
	}
	
}


