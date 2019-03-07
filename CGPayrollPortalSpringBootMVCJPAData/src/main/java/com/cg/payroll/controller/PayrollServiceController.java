package com.cg.payroll.controller;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class PayrollServiceController {
	@Autowired
	PayrollServices payrollServices;
	
	@RequestMapping("/registerAssociate")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Associate associate,BindingResult result) {
		if(result.hasErrors())return new ModelAndView("registrationPage");
		associate=payrollServices.acceptAssociateDetails(associate);
		return new ModelAndView("registrationSuccessPage", "associate",associate);
	}
	
	@RequestMapping("/findAssociate")
	public ModelAndView getAssociateDetails(@RequestParam int associateId) throws AssociateDetailNotfoundException {
		Associate associate=payrollServices.getAssociateDetails(associateId);
		return new ModelAndView("findAssociateDetailsPage", "associate",associate);
	}
		
	@RequestMapping("/AllAssociateDetails")
	public ModelAndView getAllAssociateDetails() {
		List<Associate>associates=payrollServices.getAllAssociateDetails();
		return new ModelAndView("findAllAssociateDetailsPage", "associates", associates);
	}
	
	@RequestMapping("/calculateSalary")
	public ModelAndView getNetSalary(@RequestParam int associateId) throws AssociateDetailNotfoundException {
		int netSal=payrollServices.calculateNetSalary(associateId);
		return new  ModelAndView("calculateNetSalaryPage", "netSalary", netSal);
	}
}
