package com.cg.payroll.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.exceptions.AssociateDetailNotfoundException;

@ControllerAdvice
public class PayrollExceptionAspect {
	@ExceptionHandler(AssociateDetailNotfoundException.class)
	public ModelAndView handelAssociateDetailsNotFoundException(Exception e) {
		return new ModelAndView("findAssociateDetailsPage","errorMessage", e.getMessage());
		
	}
}
