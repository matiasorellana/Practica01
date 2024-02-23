package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    //REcupera una lista de la tabla arboles
    public List<Arbol> getArboles(boolean activos);
    
    //Recupera un registro de la tabla arbol, buscando
    //el atributo idArbol en la tabla
    public Arbol getArbol(Arbol arbol);
    
    //Elimina un registro de la tabla arbol si
    //encuentra un registro con el idArbol pasado
    public void delete(Arbol arbol);
    
    //Si el objeto arbol pasado por el parametro tiene un
    //valor en idArbol lo intenta actualizar
    //si no tiene valor idArbol, se crea el registro
    public void save(Arbol arbol);
    
}
