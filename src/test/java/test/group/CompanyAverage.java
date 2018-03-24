package test.group;

import java.math.BigDecimal;

public class CompanyAverage {

	private String companyName;
	private BigDecimal average;

	public CompanyAverage(String companyName, BigDecimal average) {
		super();
		this.companyName = companyName;
		this.average = average;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigDecimal getAverage() {
		return average;
	}

	public void setAverage(BigDecimal average) {
		this.average = average;
	}

}
