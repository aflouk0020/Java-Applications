package serialize;

public class Person 
{
	private int accountNumber;
	private String planType;
	private String contractType;
	private double contractCost;
	private int yearRegister;
	private double arreans;
	
	public Person(int accountNumber, String planType, String contractType, double contractCost, int yearRegister,
			double arreans) {
		super();
		this.accountNumber = accountNumber;
		this.planType = planType;
		this.contractType = contractType;
		this.contractCost = contractCost;
		this.yearRegister = yearRegister;
		this.arreans = arreans;
	}





	@Override
	public String toString() {
		return "Person [accountNumber=" + accountNumber + ", planType=" + planType + ", contractType=" + contractType
				+ ", contractCost=" + contractCost + ", yearRegister=" + yearRegister + ", arreans=" + arreans + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public double getContractCost() {
		return contractCost;
	}
	public void setContractCost(double contractCost) {
		this.contractCost = contractCost;
	}
	public int getYearRegister() {
		return yearRegister;
	}
	public void setYearRegister(int yearRegister) {
		this.yearRegister = yearRegister;
	}
	public double getArreans() {
		return arreans;
	}
	public void setArreans(double arreans) {
		this.arreans = arreans;
	}
	

}
