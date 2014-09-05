package org.apache.jqueryajax.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class JQueryAjaxAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(JQueryAjaxAction.class);
	
	private String zipCode;
	
	private InputStream inputStream;

	@Override
	public String execute() throws Exception {
		logger.info("Passed in zip code:" + zipCode + " ...................");
		
        inputStream = new ByteArrayInputStream("Tomorrow will 28 be".getBytes("UTF-8"));
        return SUCCESS;
    }
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public InputStream getInputStream() {
        return inputStream;
    }
	
}
