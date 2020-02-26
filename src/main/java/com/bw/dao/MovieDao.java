package com.bw.dao;

import java.util.List;

import com.bw.bean.Condition;
import com.bw.bean.Movie;

public interface MovieDao {
	List<Movie> selects(Condition con);

	void deleteSome(String ids);
}
