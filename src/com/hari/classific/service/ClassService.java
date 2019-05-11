package com.hari.classific.service;

import java.util.List;

import com.hari.classific.classification.Classification;


public interface ClassService {
	
	public abstract void addClassification(Classification classification);
	public abstract Classification fetchClassificationById(int classId);
	public abstract void deleteClassificationByid(int classId);
	public abstract void updateClassificationNameById(String newName, int classId);
	public abstract List<Classification> getAllClassName();


}
