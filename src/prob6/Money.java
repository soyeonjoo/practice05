package prob6;

public class Money {
	private int value;
	
	public Money(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	
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
		Money other = (Money) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public Money add(Money money){ // equal 을 하려면 파라미터값이 money 여야기 때문에 반환값이 money여야함. 그래서 객채를 하나 생성
		return new Money(this.value+money.value); //+
	}
	
	public Money minus(Money money){
		return new Money(this.value-money.value);//-
		
	}
	public Money multiply(Money money){
		return new Money( this.value*money.value);//*
	}
	public Money devide(Money money){
		return new Money( this.value/money.value);
	}
		
}
