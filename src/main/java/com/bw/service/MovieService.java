package com.bw.service;

import java.util.List;

import com.bw.bean.Condition;
import com.bw.bean.Movie;

public interface MovieService {

	List<Movie> selects(Condition con);

	boolean deleteSome(String ids);

}
