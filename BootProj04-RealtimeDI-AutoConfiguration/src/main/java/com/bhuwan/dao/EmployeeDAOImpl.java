package com.bhuwan.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhuwan.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String GET_EMPS_BY_DEGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE JOB IN ";
	@Autowired
	private DataSource ds;
	
	@Override
	public List<EmployeeBO> getEmployeeByDesg(String condition) throws Exception {
		List<EmployeeBO> listBO = null;
		try(
//				get connection from connection Poller 
				Connection conn = ds.getConnection();
//				create statement object 
				Statement st = conn.createStatement();
//				send and execute SQL Query in DB s/w 
				ResultSet rs = st.executeQuery(GET_EMPS_BY_DEGS + condition + " ORDER BY JOB");
				){
			listBO = new ArrayList<>();
			EmployeeBO ebo = null;
			while(rs.next()) {
				ebo = new EmployeeBO();
				ebo.setEmpNo(rs.getInt(1));
				ebo.setName(rs.getString(2));
				ebo.setJob(rs.getString(3));
				ebo.setSalary(rs.getDouble(4));
				ebo.setDeptNo(rs.getInt(5));
				ebo.setMgrNo(rs.getInt(6));
				// adding each Object of EmployeeBO to List
				listBO.add(ebo);
			}// while
		}//try
		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return listBO;
	}// method
}// class
