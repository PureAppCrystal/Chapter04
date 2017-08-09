package util;

public class Value {
	private int value;
	
	public Value (int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Value [value=" + value + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	//해쉬코드는 오버라이드하지 않으면 레퍼런스값이 나온다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
}
