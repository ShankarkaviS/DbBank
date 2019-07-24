package com.hcl.dbank.dto;

public class ReportByMonth {
	
	private Long Years;
	private Long months;
	private Long totalCount;
	
	public Long getYears() {
		return Years;
	}
	public Long getMonths() {
		return months;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public ReportByMonth(Long years, Long months, Long totalCount) {
		super();
		Years = years;
		this.months = months;
		this.totalCount = totalCount;
	}
}
