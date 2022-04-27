package webapp.controllers;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/init", loadOnStartup = 1)
public class StartupServlet extends HttpServlet {

	private static final long serialVersionUID = 5275434489821280476L;

	public void init(ServletConfig config) {
        System.out.println("My servlet has been initialized");
    }

}
