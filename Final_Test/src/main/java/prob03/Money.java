package prob03;

public class Money {
	private int amount;

	/* 코드 작성 */
	public Money(int num) {
		this.amount = num;
	}

	public Money add(Money num) {
		return new Money(amount + num.amount);
	}

	public Money minus(Money num) {
		return new Money(amount -= num.amount);
	}

	public Money multiply(Money num) {
		return new Money(amount *= num.amount);
	}

	public Money devide(Money num) {
		return new Money(amount /= num.amount);
	}

	public boolean equlas(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}
}
