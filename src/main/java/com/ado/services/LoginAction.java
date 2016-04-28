/**
 * 
 */
package com.ado.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/**
 * @author Anand
 *
 */
public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String message="failure";
		LoginForm loginForm = (LoginForm) form;
		if(loginForm.getLoginId().equals(loginForm.getPassword())){
			message = "success";
		}
		return mapping.findForward(message);
	}
}
