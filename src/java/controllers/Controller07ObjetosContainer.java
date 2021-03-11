package controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Coche;
import models.Conductor;
import org.springframework.context.ApplicationContext;

import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller07ObjetosContainer implements Controller {

    //el metodo getbean es estandar, lo que quiere decir que
    //puede devolver un coche , una persona o un gatito,
    //cualquier clase
    private Object getBean(String id, ServletContext servlet) {
        //necesitamos el contexto de la aplicacion  para extraer
        //los objetos del container
        ApplicationContext container
                = WebApplicationContextUtils.getRequiredWebApplicationContext(servlet);
        //recuperamos la clase por el id del bean
        Object bean = container.getBean(id);
        return bean;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {

        ModelAndView mv = new ModelAndView("web07objetoscontainer");
        //recuperamos el coche de forma explicita
        Coche car = (Coche) this.getBean("car", hsr.getServletContext());
        mv.addObject("CAR", car);
        Conductor driver = (Conductor) this.getBean("driver", hsr.getServletContext());
        mv.addObject("DRIVER", driver);
        return mv;
    }

}
