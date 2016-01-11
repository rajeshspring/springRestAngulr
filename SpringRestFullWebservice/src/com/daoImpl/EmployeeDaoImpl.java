package com.daoImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Department;
import com.pojo.Employee;
import com.utility.*;

public class EmployeeDaoImpl
    {
	DBConnection DBConnection=new DBConnection();
	Connection conn=null;
	ResultSet rs=null;
	
	//Find Employee Details
	public List<Employee> getEmployees() throws Exception {
		// TODO Auto-generated method stub
		String query=("select * from emp.employee1");
		List<Employee> applicantList=new ArrayList<Employee>();
		Employee employee=null;
		try
		{
		Statement stmt=com.utility.DBConnection.getConnection().createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next())
		   {
			employee=new Employee();
			employee.setEmpid(rs.getInt("emp_id"));
			employee.setFirstname(rs.getString("empname"));
			employee.setLastname(rs.getString("lastname"));
			employee.setAddress(rs.getString("address"));
			employee.setPhone(rs.getString("phone"));
			employee.setEmail(rs.getString("email"));
			employee.setProfile(rs.getString("profile"));
			employee.setDateofjoin(rs.getString("dateofjoin"));
			applicantList.add(employee);
			if(applicantList.size()==0)
			{
			return null;
			}
		    }
		    }
		
		 catch(SQLException e)
		  {
		 e.printStackTrace();
		  }
		
		 finally
		 {
		 if(conn !=null)
		 {
		 conn.close();
		 }
		 }
		return applicantList;
	    }
	
	
	  
	   // Find Depatment Details
	   public List<Department> getDepartment() throws Exception {
		// TODO Auto-generated method stub
		String query=("select * from emp.department_details");
		List<Department> departmentList=new ArrayList<Department>();
		Department department=null;
		try
		{
		Statement stmt=com.utility.DBConnection.getConnection().createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next())
		   {
			department=new Department();
			department.setDept_id(rs.getInt("dept_id"));
			department.setDeptname(rs.getString("dept_name"));
			department.setDept_phone(rs.getString("dept_phone"));
			department.setDeptlocation(rs.getString("dept_address"));
			department.setDept_email(rs.getString("dept_email"));
			
			departmentList.add(department);
			if(departmentList.size()==0)
			{
			return null;
			}
		    }
		    }
		
		 catch(SQLException e)
		  {
		 e.printStackTrace();
		  }
		
		 finally
		 {
		 if(conn !=null)
		 {
		 conn.close();
		 }
		 }
		return departmentList;
	    }
	
}
