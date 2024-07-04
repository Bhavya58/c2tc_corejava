package edu.svit.sf04java.util;

public class QueryUtil {
	public static String insertEmployeeQuery() {
		return "INSERT INTO employee(employee_name,employee_address,employee_salary) VALUES (?,?,?)";
	}
	
	public static String selectAllEmployeeQuery() {
		return "SELECT * FROM employee";
	}
	
	public static String selectEmployeeById(int employeeId) {
		return "SELECT * FROM employee WHERE employee_id= " +employeeId;
	}
	
	public static String deleteEmployeeById(int employeeId) {
		return "DELETE FROM employee WHERE employee_id= " +employeeId;
	}
	public static String updateEmployeeQuery(int employeeId) {
		return "UPDATE employee SET employee_name = ?, employee_address = ?, employee_salary = ? WHERE employee_id= " +employeeId;
	}
	
}



