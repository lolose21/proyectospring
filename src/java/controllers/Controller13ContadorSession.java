package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller13ContadorSession implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("web13contadorsession");
        String dato = hsr.getParameter("incremento");
        if (dato != null) {
            int contador = 1;
            // el contador sera 1 , pero solamente la primera vez
            //luego tendra el valor que hemos almacenado en session
            //necesitamos saber si existe algo en session o no
            //recuperamos el objeto session del request (hsr)
            if (hsr.getSession().getAttribute("CONTADOR") != null) {

                //tenemos ya algo previamente almacenado como contador
                contador = (int) hsr.getSession().getAttribute("CONTADOR");

            }
            //INCREMENTAMOS EL CONTADOR , YA SEA DESDE 1 O DESDE OTRO VALOR
            //QUE TENGAMOS ALMACENADO PREVIAMENTE
            contador += 1;
            //DEBEMOS GUARDAR EN LA SESSION EL NUEVO VALOR DEL CONTADOR
            hsr.getSession().setAttribute("CONTADOR", contador);
            mv.addObject("CONTADOR", contador);
        }

        return mv;
    }

}
