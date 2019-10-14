package tvvs;

public class Functions {

	public int func1(int a, int b, int c) {
		int i = a;
		i += b;
		i *= c;
		i -= a;
		
		return i;
	}
	
	public void func2(MutableInt toChange, int offset, Boolean positive, int iterations) {
		for(int i = 0; i < iterations; i++) {
			if(positive)
				toChange.plus(offset);
			else
				toChange.plus(-offset);
			
			toChange.module();
		}
	}
	
	public Boolean func3(Boolean a, Boolean b, Boolean c) {
		Boolean ret = a || (b && c);
		
		return ret;
	}
	
	public int func4(int iter, int step, int add, int mask) {
		int ret = 0;
		while(iter > 0) {
			ret += step;
			step += add + add;
			iter--;
		}
		
		return ret & mask;
	}
	
	public int func5(int a, int iters, int inc1, int inc2) {
		for(int i = 0; i < iters; i++) {
			if(a >= 0)
				a += inc1;
			else
				a += inc2;
		}
		
		return Math.abs(a);
	}
	
	public int nth_fibonacci_num(int n) 
	{ 
		int a = 0, b = 1, c, i; 
		if( n == 0) 
			return a; 
		for (i = 2; i <= n; i++) 
		{ 
			c = a + b; 
			a = b; 
			b = c; 
		} 
		return b; 
	} 
	
		
}
