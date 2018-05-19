package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Project;
import com.service.ProjectService;

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	@RequestMapping(value = "projects", method = RequestMethod.GET)
	@ResponseBody
	List<String> getProjectNames() {
		List<String> list = projectService.projectNames();
		return list;
	}

	@RequestMapping(value = "projectinfo", method = RequestMethod.GET)
	@ResponseBody
	List<Project> getInfoByProj(@RequestParam String ProjectNames) {
		System.out.println("data we received is" + ProjectNames);
		List<Project> list = projectService.getInfoByProj(ProjectNames);
		return list;
	}

	@RequestMapping(value = "updateproject", method = RequestMethod.POST)
	@ResponseBody
	String updateInfoByProj(@RequestBody Project proj) {
		System.out.println("data we received is" + proj);
		String result = projectService.updateInfoByProj(proj);
		return result;

	}

}
