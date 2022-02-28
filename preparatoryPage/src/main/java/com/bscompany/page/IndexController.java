package com.bscompany.page;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String Index(HttpServletRequest req, Model model) {
		if(Const.realPath == null) {
			Const.realPath = req.getSession().getServletContext().getRealPath("");
			System.out.println(Const.realPath);
		}
		
		model.addAttribute(Const.CSS, new String[] {Const.COMMON, Const.MAIN, Const.DEFAULTHEADER});
		model.addAttribute(Const.TITLE, "(주)비에스케미칼");
		model.addAttribute(Const.HEADER, "template/header_template");
		model.addAttribute(Const.VIEW, "main");
		model.addAttribute(Const.JS, new String[] {Const.WOW});
		
		
		return ViewRef.MAINTEMP;
		
	
	}
	@RequestMapping(value = "/favicon.ico", method = RequestMethod.GET)
	public void favicon(HttpServletRequest req, HttpServletResponse rep) {
	try {
		rep.sendRedirect("/resources/favicon.ico");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	 
	
}
