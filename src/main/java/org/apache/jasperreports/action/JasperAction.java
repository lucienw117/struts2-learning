package org.apache.jasperreports.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JasperCompileManager;

import org.apache.jasperreports.model.Person;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class JasperAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(JasperAction.class);

	/** List to use as our JasperReports dataSource. */
	private List<Person> myList;

	public String execute() throws Exception {

		// Create some imaginary persons.
		Person p1 = new Person(new Long(1), "Patrick", "Lightbuddie");
		Person p2 = new Person(new Long(2), "Jason", "Carrora");
		Person p3 = new Person(new Long(3), "Alexandru", "Papesco");
		Person p4 = new Person(new Long(4), "Jay", "Boss");

		// Store people in our dataSource list (normally they would come from a database).
		myList = new ArrayList<Person>();
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		myList.add(p4);

		// Normally we would provide a pre-compiled .jrxml file
		// or check to make sure we don't compile on every request.
		// Don't use this in production code. You should of course either provide compiled templates,
		// or do some sort of checking to avoid compiling the template on every request.
		try {
			// This is from Struts2 official document, concise but not working
			// JasperCompileManager.compileReportToFile("/jasper/our_jasper_template.jrxml", "/jasper/our_compiled_template.jasper");

			// Below is a effective approach, but I think it's better to figure out more grace solution or at least  provide a utility class or class extends JasperCompileManger to simplify the code
			String reportSource;
			reportSource = ServletActionContext.getServletContext().getRealPath("/jasper/our_jasper_template.jrxml");
			File parent = new File(reportSource).getParentFile();
			logger.debug("********* " + reportSource);
			logger.debug("********* " + new File(parent, "our_compiled_template.jasper").getAbsolutePath());
			JasperCompileManager.compileReportToFile(reportSource, new File(parent, "our_compiled_template.jasper").getAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

	public List<Person> getMyList() {
		return myList;
	}
}
