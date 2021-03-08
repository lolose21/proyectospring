package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Persona;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller04Colecciones implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {
        ModelAndView mv = new ModelAndView("web04colecciones");
        ArrayList<Persona> personas = new ArrayList<>();
        Persona p = new Persona("Adrian", "maria@gmail", 21);
        personas.add(p);
        p = new Persona("maria", "adriana@gmail.com", 21);
        personas.add(p);
        p = new Persona("carlos", "carlo~@gmail.com", 44);
        personas.add(p);
        mv.addObject("PERSONAS", personas);
        return mv;

    }

}
