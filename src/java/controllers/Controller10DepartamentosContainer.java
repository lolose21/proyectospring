package controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoriesDepartamentosContainer;

public class Controller10DepartamentosContainer implements Controller {

    public Object getBean(String id, ServletContext context) {
        ApplicationContext container
                = WebApplicationContextUtils.getWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {
        ModelAndView mv = new ModelAndView("web10departamentoscontainer");
        String dato = hsr.getParameter("id");
        if (dato != null) {
            int id = Integer.parseInt(dato);
            RepositoriesDepartamentosContainer repo
                    = (RepositoriesDepartamentosContainer) this.getBean("repositorydepartamentos", hsr.getServletContext());

            Departamento dept = repo.BuscarDepartamento(id);
            mv.addObject("DEPARTAMENTO", dept);
        }
        return mv;
    }

}
