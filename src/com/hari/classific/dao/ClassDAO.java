package com.hari.classific.dao;

import java.util.List;

import com.hari.classific.classification.Classification;

public interface ClassDAO {
	
	public void createClassification(Classification classification);
	public abstract Classification getClassificationById(int classId);
	public abstract void deleteClassificationByid(int classId);
	public abstract void updateClassificationNameById(String newName, int classId);
	public abstract List<Classification> getAllClassName();

}
