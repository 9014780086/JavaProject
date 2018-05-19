package com.service;

import java.util.List;

import com.pojo.Project;

public interface ProjectService {
	

	List<String> projectNames();
	List<Project> getInfoByProj(String projectNames);
	String updateInfoByProj(Project proj);


}
