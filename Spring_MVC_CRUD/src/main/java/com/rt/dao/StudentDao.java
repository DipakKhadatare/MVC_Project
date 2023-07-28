package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.protocol.Resultset;

import com.rt.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate template;
	private Object id;

	public boolean register(Student e) {
		try {
			Object[] args = { e.getFirstname(), e.getLastname(), e.getEmail(), e.getAddress() };
			int a = template.update(
					"insert into stddata_spring(`firstname`,`lastname`,`email`,`address`) values(?,?,?,?)", args);

			System.out.println(a);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {

		}
		return false;

	}

	// ************************************************************************************************************************
	public boolean update(Student e) {

		try {
			Object[] args = { e.getFirstname(), e.getLastname(), e.getEmail(), e.getAddress(), e.getId() };
			int a = template.update(
					"update stddata_spring set firstname = ?, lastname = ?, email = ?, address = ? where id = ?", args);

			System.out.println(a);

			if (a == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {

		}

		return false;
	}

	// ************************************************************************************************************************

	public boolean delete(int id) {

		try {
			Object[] args = { id };
			int a = template.update("delete from stddata_spring where id = ?", args);

			System.out.println(a);

//			if (a == 1) {
//				return true;
//			} else {
//
//				return false;
//			}

		} catch (Exception e2) {

		}

		return false;
	}

	// ************************************************************************************************************************
	public Student selectstudentbyid(int id2) {
		Student e = null;

		try {
			Object[] args = { id2 };
			e = template.queryForObject("select * from stddata_spring where id =?", args, new RowMapper<Student>() {

				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5));
				}

			});

		} catch (Exception e2) {

		}

		return e;
	}
	
	// ************************************************************************************************************************


	public List<Student> selectAllEmployees() {
		List<Student> list = null;
		try {

			 list = template.query("select * from stddata_spring",
					new RowMapper<Student>() {

				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5));
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
