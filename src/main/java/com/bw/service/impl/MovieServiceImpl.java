package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.Condition;
import com.bw.bean.Movie;
import com.bw.dao.MovieDao;
import com.bw.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieDao dao;

	@Override
	public List<Movie> selects(Condition con) {
		// TODO Auto-generated method stub
		return dao.selects(con);
	}

	@Override
	public boolean deleteSome(String ids) {
		boolean flag=false;
		try {
			dao.deleteSome(ids);
			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
}
