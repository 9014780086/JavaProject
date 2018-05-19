package com.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.pojo.Project;
import com.pojo.ProjectRowMapper;

@Repository
public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private SqlParameterSource paramMap;

	

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public List<String> projectNames() {
		String sql = "select  projName from projAdmin ";
		List<String> list = jdbcTemplate.queryForList(sql, String.class);
		return list;

	}

	public List<Project> getInfoByProj(String projectNames) {
		System.out.println("Received data to dao layer is " + projectNames);
		String sql = "select * from projAdmin where projName= ? ";
		List<Project> listObj = jdbcTemplate.query(sql, new Object[] { projectNames }, new ProjectRowMapper());
		return listObj;
	}

	public int updateInfoByProj(Project proj) {
		System.out.println("data received to dao layer is" + proj);

		String updateQuery = "update  projadmin set :svG,:svY where :id";

		
		int noOfRowsAffected = namedParameterJdbcTemplate.update(updateQuery,paramMap);
		return noOfRowsAffected;

	}

}
