package com.service.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.daoImpl.EmployeeDaoImpl;
import com.pojo.Department;
import com.pojo.Employee;


@Controller
public class EmployeeController {

	 private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class); 
	 EmployeeDaoImpl daoImpl=new EmployeeDaoImpl();
	
	
    //Find Employee Details
    @RequestMapping(value ="/getData" , method = RequestMethod.GET)
    public @ResponseBody List<Employee> getEmployeeDetails() throws Exception {
        logger.info("Start getDummyEmployee");
        
        System.out.println(">>>>>>>>>>>>>>>>>>> getData");
        
        List<Employee> empList = daoImpl.getEmployees();
        System.out.println(">>>>>>>>>>>>>>>>>>> Employees size"+empList.size());
        if(empList.size()==0)
          {
    	   return null;
          }
          return empList;
    }
    
    //Find Department Details
    @RequestMapping(value ="/getDepartment" , method = RequestMethod.GET)
    public @ResponseBody Department getDepartment() {
        logger.info("Start getDummyEmployee");
        
        System.out.println(">>>>>>>>>>>>>>>>>>> getDepartment");
        Department dept = new Department();
        dept.setDept_id(10);
        dept.setDeptname("java j2ee");
        dept.setDeptlocation("pune");
        dept.setDept_email("test@gmail.com");
        dept.setDept_phone("1234567");
        return dept;
    }
}
