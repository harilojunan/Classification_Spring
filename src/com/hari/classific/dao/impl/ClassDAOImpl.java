package com.hari.classific.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.hari.classific.classification.Classification;
import com.hari.classific.dao.ClassDAO;


public class ClassDAOImpl implements ClassDAO {
	
	//dependency injection
	private DataSource datasource;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}


	public void createClassification(Classification classification) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = datasource.getConnection();
			String SQL="INSERT INTO classification(className) VALUES (?)";
			ps = connection.prepareStatement(SQL);
			
			ps.setString(1, classification.getClassName());


			
			int executeUpdate =ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Classification is created");
			}
			
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(connection!= null) {
					try {
						connection.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
	}


	public Classification getClassificationById(int classId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteClassificationByid(int classId) {
		// TODO Auto-generated method stub
		
	}

	public void updateClassificationNameById(String newName, int classId) {
		// TODO Auto-generated method stub
		
	}

	public List<Classification> getAllClassName() {
		// TODO Auto-generated method stub
		return null;
	}


}
