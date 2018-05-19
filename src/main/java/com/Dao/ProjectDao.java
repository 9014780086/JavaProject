package com.Dao;

import java.util.List;

import com.pojo.Project;

public interface ProjectDao {
	
	List<String> projectNames( );
	List<Project> getInfoByProj(String projectNames);
	int updateInfoByProj(Project proj);

}
