package com.katherine.web;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class ControllerUsuario {
    
@Controller
@RequestMapping("/servicios")
public class Controller---{

@RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=Application/json"))  

@ResponseBody ArrayList<Evaluacion> ete(){
    return DAOUsuarioImpl.Implementar();
}
}}

