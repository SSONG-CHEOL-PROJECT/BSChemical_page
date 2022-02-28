package com.bscompany.page.introduce;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bscompany.page.Const;
import com.bscompany.page.ViewRef;

@Controller
@RequestMapping("/company")
public class IntroduceController {
	
	@RequestMapping(value="/introduce", method = RequestMethod.GET)
	public String companyInt(HttpServletRequest req, Model model) {
		
		
		model.addAttribute(Const.CSS, new String[] {Const.COMMON, Const.MAIN, Const.FOOTER, Const.DEFAULTHEADER, Const.DEFAULTFOOTER, Const.SUB_C});
		model.addAttribute(Const.VIEW, "/introduce/sub_c");
		model.addAttribute(Const.TITLE, "(주)비에스케미칼");
		model.addAttribute(Const.HEADER, "template/header_template");
		model.addAttribute(Const.FOOTER, "template/footer_template");
		model.addAttribute(Const.JS, new String[] {Const.WOW});
		
		
		return ViewRef.SUBTEMP;
	}
	
	@RequestMapping(value="/business_area", method = RequestMethod.GET)
	public String businessArea(HttpServletRequest req, Model model) {
		
		model.addAttribute(Const.CSS, new String[] {Const.COMMON, Const.MAIN, Const.FOOTER, Const.DEFAULTHEADER, Const.DEFAULTFOOTER, Const.SUB_C, Const.SUB_CASE});
		model.addAttribute(Const.VIEW, "/introduce/sub_case");
		model.addAttribute(Const.TITLE, "(주)비에스케미칼");
		model.addAttribute(Const.HEADER, "template/header_template");
		model.addAttribute(Const.FOOTER, "template/footer_template");
		model.addAttribute(Const.JS, new String[] {Const.WOW});
		
		return ViewRef.SUBTEMP;
	}
	
}

