package tvvs;

public class MutableInt {
	public int value;
	
	public MutableInt(int value) {
		this.value = value;
	}
	
	public int getInt() {
		return value;
	}
	
	void plus(Integer a) {
		value += a.intValue();
	}
	
	void module() {
		this.value = Math.abs(value);
	}
}
