package com.hari.classific.service.impl;

import java.util.List;

import com.hari.classific.classification.Classification;
import com.hari.classific.dao.ClassDAO;
import com.hari.classific.service.ClassService;

public class ClassServiceImpl implements ClassService {
	
	private ClassDAO classDAO;
	
	public void setClassDAO(ClassDAO classDAO) {
		this.classDAO = classDAO;
	}

	public Classification fetchClassificationById(int classId) {
		// TODO Auto-generated method stub
		return classDAO.getClassificationById(classId);
	}

	public void deleteClassificationByid(int classId) {
		// TODO Auto-generated method stub
		classDAO.deleteClassificationByid(classId);
		
	}

	public void updateClassificationNameById(String newName, int classId) {
		// TODO Auto-generated method stub
		classDAO.updateClassificationNameById(newName, classId);
	}

	public List<Classification> getAllClassName() {
		// TODO Auto-generated method stub
		return classDAO.getAllClassName();
	}

	@Override
	public void addClassification(Classification classification) {
		// TODO Auto-generated method stub
		classDAO.createClassification(classification);
	}

}
