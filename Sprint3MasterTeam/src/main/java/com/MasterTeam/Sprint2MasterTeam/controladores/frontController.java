package com.MasterTeam.Sprint2MasterTeam.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontController {

    //Crear elementos String para visualizar etiquetas HTML creadas
    @GetMapping("/")
    //Ruta raiz
    public String index(){
        return "indice";
    }

}
