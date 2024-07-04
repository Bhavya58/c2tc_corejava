package edu.svit.sf04java.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tnsif.jdbc.model.Employee;

import om.tnsif.jdbc.util.DatabaseUtil;
import om.tnsif.jdbc.util.QueryUtil;


public class DatabaseService {
	DatabaseUtil dbUtil = new DatabaseUtil();
	//to create and insert employee data to the database
	public void insertEmployee(Employee emp) throws SQLException {
		try(Connection con=dbUtil.getConnection();
			PreparedStatement ps=con.prepareStatement(QueryUtil.insertEmployeeQuery());){
			ps.setString(1,emp.getEmployeeName());
			ps.setString(2,emp.getEmployeeAddress());
			ps.setDouble(3,emp.getEmployeeSalary());
			int rows=ps.executeUpdate(); // 0 or 1
			if(rows>0) {
				System.out.println("Recorde created successfully");
			}else {
				System.out.println("insert record failed");
			}
		
	}
	}
	
	//to retrieve all the records from the database table
	public void getAllEmployee() throws SQLException {
		try(Connection con=dbUtil.getConnection();
				Statement stmt=con.createStatement();
				ResultSet resultset=stmt.executeQuery(QueryUtil.selectAllEmployeeQuery());){
			
				while(resultset.next()) {
					printEmployee(new Employee(resultset.getInt("employee_id"),
							resultset.getString("employee_name"),
							resultset.getString("employee_address"),
							resultset.getDouble("employee_salary")));
				}
			
		}
	}
	
	public void printEmployee(Employee emp) {
		System.out.println("employee id: "+emp.getEmployeeId());
		System.out.println("employee name: "+emp.getEmployeeName());
		System.out.println("employee address: "+ emp.getEmployeeAddress());
		System.out.println("employee salry: "+emp.getEmployeeSalary());
	}
	//to retrive employee details for a particular id
	public boolean getEmployeeById(int id) throws SQLException {
		boolean isFound=false;
		try(Connection con=dbUtil.getConnection();
				Statement stmt=con.createStatement();
				ResultSet resultset=stmt.executeQuery(QueryUtil.selectEmployeeById(id));){
				if(resultset.next()) {
					isFound=true;
					printEmployee(new Employee(resultset.getInt("employee_id"),
							resultset.getString("employee_name"),
							resultset.getString("employee_address"),
							resultset.getDouble("employee_salary")));
				}else {
					System.out.println("record is not available for id: "+id);
				}
			
		}
		return isFound;
			
	}
	//to delete the record in the table by passing the employee id
	public void deleteEmployeeById(int id) throws SQLException {
		try(Connection con=dbUtil.getConnection();
				Statement stmt=con.createStatement();){
			int rows=stmt.executeUpdate(QueryUtil.deleteEmployeeById(id)); //0 0r 1
			if(rows>0) {
				System.out.println("record is deleted successfully");
			}else {
				System.out.println("something went wrong");
			}
			
		}
	}
	//to update employee details in the table by passing the employee id
	public void updateEmployee(Employee emp) throws SQLException {
		try(Connection con=dbUtil.getConnection();
				PreparedStatement ps=con.prepareStatement(QueryUtil.updateEmployeeQuery(emp.getEmployeeId()));){
				ps.setString(1, emp.getEmployeeName());
				ps.setString(2, emp.getEmployeeAddress());
				ps.setDouble(3, emp.getEmployeeSalary());
				int rows=ps.executeUpdate();
				if(rows>0) {
					System.out.println("record is updated successfully");
				}else {
					System.out.println("update record failed");
				}
		}
	}
	



}
