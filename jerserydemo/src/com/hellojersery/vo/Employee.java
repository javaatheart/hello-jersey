package com.hellojersery.vo;

import java.util.List;

public class Employee {

	private String firstName;
	private String lastName;
	private Long employeeId;
	private List<String> deptList;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", employeeId=");
		builder.append(employeeId);
		builder.append(", deptList=");
		builder.append(deptList);
		builder.append("]");
		return builder.toString();
	}
	public List<String> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<String> deptList) {
		this.deptList = deptList;
	}


}
