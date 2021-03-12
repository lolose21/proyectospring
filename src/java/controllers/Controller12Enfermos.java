package controllers;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Enfermo;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import repositories.RepositoryEnfermos;

public class Controller12Enfermos implements Controller {

    RepositoryEnfermos repo;

    private Object getBean(String id, ServletContext context) {
        ApplicationContext container
                = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web12enfermos");

        this.repo = (RepositoryEnfermos) this.getBean("repositoryenfermos",
                hsr.getServletContext());
        String dato = hsr.getParameter("inscripcion");
        if (dato != null) {
            int id = Integer.parseInt(dato);
            this.repo.eliminarEnfermo(id);
        }
        List<Enfermo> enfermos = this.repo.getEnfermo();
        mv.addObject("ENFERMOS", enfermos);
        return mv;

    }

}
