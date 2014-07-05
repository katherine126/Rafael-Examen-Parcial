package com.katherine.web;

import java.util.ArrayList;

public class DAOUsuarioImpl {
    
public static ArrayList<Evaluacion> Implementar(){
        ArrayList<Evaluacion> lista= new ArrayList<Evaluacion>();
        
        Evaluacion un;
        un =new Evaluacion("jcampitos","hhh", "js");
        lista.add(un);
        
      
        un =new Evaluacion("demian","asad", "ds");
        lista.add(un);
        
      
        un =new Evaluacion("dsfd","dfh", "bg");
        lista.add(un);
        
    return lista;
        
    }
    
    
}
