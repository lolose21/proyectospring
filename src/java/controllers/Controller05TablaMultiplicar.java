package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TablaMultiplicar;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Controller05TablaMultiplicar implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1)
            throws Exception {

        ModelAndView mv = new ModelAndView("web05tablamultiplicar");
        String dato = hsr.getParameter("numero");
        //int total = 0;
        if (dato != null) {

            int numero = Integer.parseInt(dato);
            ArrayList<TablaMultiplicar> lista = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                int ope = numero * i;
                TablaMultiplicar t = new TablaMultiplicar(numero + " * " + i, ope);
                lista.add(t);
            }
            mv.addObject("TABLA", lista);
            //--------------------------------
            /*String html = "";
            for (int i = 0; i < 11; i++) {

                total = numero * i;
                html += "<tr>";
                html += "<td>" + numero + "</td>";
                html += "<td>" + i + "</td>";
                html += "<td>" + total + "</td>";
                html += "</tr>";
                mv.addObject("TABLA", html);*/

            //----------------------------------------------
            //String mensaje = "<h1 style='color:red'>" + numero + " Multiplicado por"
            //         + i + " es " + total + "</h1>";
            // mv.addObject("MENSAJE", mensaje);
        }
        return mv;
    }

}
