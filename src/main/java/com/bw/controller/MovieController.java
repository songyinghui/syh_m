package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Condition;
import com.bw.bean.Movie;
import com.bw.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
   @Autowired
   private MovieService service;
   
   @RequestMapping("list.do")
   public String selectAll(Model model,Condition con) {
	   if(con.getPageNum()==null) {
		   con.setPageNum(1);
	   }
	   PageHelper.startPage(con.getPageNum(),3);
	    List<Movie> list=service.selects(con);
	    PageInfo<Movie> page = new PageInfo<Movie>(list);
	    model.addAttribute("page", page);
	    model.addAttribute("con",con);
	   return "list";
   }
   @ResponseBody
   @RequestMapping("delete.do")
   public Object deleteSome(String  ids) { 
		
	   return service.deleteSome(ids);
   }
   
}
