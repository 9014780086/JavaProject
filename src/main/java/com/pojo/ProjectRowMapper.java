package com.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProjectRowMapper implements RowMapper<Project>{

	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		System.out.println("rowmapper is called" + rowNum);
		
		Project project = new Project();
		project.setProjectId(rs.getInt("projectId"));
		project.setProjectNames(rs.getString("projectNames"));
		project.setSvGreen(rs.getInt("svGreen"));
		project.setSvYellow(rs.getInt("svYellow"));
		project.setSvRed(rs.getInt("svRed"));
		project.setEoGreen(rs.getInt("eoGreen"));
		project.setEoYellow(rs.getInt("eoYellow"));
		project.setEoRed(rs.getInt("eoRed"));
		project.setFtrGreen(rs.getInt("FtrGreen"));
		project.setFtrYellow(rs.getInt("ftrYellow"));
		project.setFtrRed(rs.getInt("ftrRed"));
		project.setRwGreen(rs.getInt("rwGreen"));
		project.setRwYellow(rs.getInt("rwYellow"));
		project.setRwRed(rs.getInt("rwRed"));
		project.setRrGreen(rs.getInt("rrGreen"));
		project.setRrYellow(rs.getInt("rrYellow"));
		project.setRrRed(rs.getInt("rrRed"));
		project.setAdGreen(rs.getInt("adGreen"));
		project.setAdYellow(rs.getInt("adYellow"));
		project.setAdRed(rs.getInt("adRed"));
		
		
		
		return project;
	}

}
