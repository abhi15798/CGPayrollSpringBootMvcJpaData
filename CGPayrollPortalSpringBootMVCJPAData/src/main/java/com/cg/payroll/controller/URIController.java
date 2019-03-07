package com.cg.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.beans.Associate;
@Controller
public class URIController {
	private Associate associate;
	
	@RequestMapping(value= {"/","index"})
	public String getIndexPage() {
		return "indexPage";
	}
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	@ModelAttribute
	public Associate associate() {
		associate=new Associate();
		return associate;
	}
	
	@RequestMapping("/findAssociateDetails")
	public String getFindAssociateDetails() {
		return "findAssociateDetailsPage";
	}
	
	@RequestMapping("/findAllAssociateDetails")
	public String getFindAllAssociate() {
		return "findAssociateDetailsPage";
	}
	@RequestMapping("/calculateNetSalary")
	public String getCalculateNetSalary() {
		return "calculateNetSalaryPage";
	}
	
}
