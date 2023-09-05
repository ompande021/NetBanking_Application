package relationship;

public class Account {
	 
	private String name;
	private String accno;
	private long cno;
	private long dob;
	private String city;
	private float balance;
	private int pin; 
	
	public long getDob() {
		return dob;
	}
	public void setDob(long dob) {
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAccno() {
		return accno;
	}


	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno=cno;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean equals(Object o)
	{
		Account a = (Account)o;
		return this.accno.equals(a.accno);
	}
	

	public Account(String name, long cno, String city, long dob, float balance, int pin, String accno)
	{
		this.name=name;
		this.cno=cno;
		this.city=city;
		this.dob=dob;
		this.balance=balance;
		this.pin=pin;
		this.accno=accno;
	}
		

}
