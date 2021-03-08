package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller03InfoViewController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {
        ModelAndView mv = new ModelAndView("web03infoviewcontroller");
        //en esta metodo entra siempre , tanto la primera vez
        //como
        String dato1 = hsr.getParameter("numero1");
        String dato2 = hsr.getParameter("numero2");
        //debemos comprobar que hemos recibido datos
        if (dato1 != null) {
            int num1 = Integer.parseInt(dato1);
            int num2 = Integer.parseInt(dato2);
            int suma = num1 + num2;
            String mensaje = "<h1 style='color:blue'> la suma de "
                    + num1 + " + " + num2 + " es " + suma + "</h1>";
            mv.addObject("RESPUESTA", mensaje);
        }
        return mv;
    }

}
