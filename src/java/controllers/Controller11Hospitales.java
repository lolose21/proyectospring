package controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Hospitales;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.Repository11Hospitales;

public class Controller11Hospitales implements Controller {

    private Object getBean(String id, ServletContext context) {
        ApplicationContext container
                = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {

        ModelAndView mv = new ModelAndView("web11hospitales");
        String dato = hsr.getParameter("id");
        if (dato != null) {
            int id = Integer.parseInt(dato);
            Repository11Hospitales repo
                    = (Repository11Hospitales) this.getBean("repositoryhospital", hsr.getServletContext());
            Hospitales hospital = repo.buscarHospitales(id);
            mv.addObject("HOSPITAL", hospital);
        }
        return mv;
    }

}
