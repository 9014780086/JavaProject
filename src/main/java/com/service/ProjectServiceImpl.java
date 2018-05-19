package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Dao.ProjectDao;
import com.pojo.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDao projectdao;

	public ProjectDao getProjectdao() {
		return projectdao;
	}

	public void setProjectdao(ProjectDao projectdao) {
		this.projectdao = projectdao;
	}

	public List<String> projectNames() {
		List<String> listObj = projectdao.projectNames();
		return listObj;
	}

	public List<Project> getInfoByProj(String projectNames) {
		List<Project> listObj = projectdao.getInfoByProj(projectNames);
		return listObj;
	}

	public String updateInfoByProj(Project proj) {
		int result = projectdao.updateInfoByProj(proj);
		if (result == 0) {
			return " Failed to update";
		} else {
			return "Successfully updated";
		}

	}

}
