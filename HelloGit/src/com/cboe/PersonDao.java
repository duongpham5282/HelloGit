package com.cboe;

import java.util.List;

public interface PersonDao {

	public List<Employee> getAllEmp();
	public void insertNewEmployee(Employee e) throws Exception;
}
