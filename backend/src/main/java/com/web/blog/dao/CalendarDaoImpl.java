package com.web.blog.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.blog.dto.Calendar;
import com.web.blog.mapper.CalendarMapper;




@Repository
public class CalendarDaoImpl implements CalendarDao {
	@Autowired
	CalendarMapper mapper;

	@Override
	public List<Calendar> month(String bandId, String month) {
		return mapper.month(bandId, month);
	}


	
}
