/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author ADRIAN LUACES
 */
@Named(value = "inicio")
@Dependent
public class Inicio {

    /**
     * Creates a new instance of Inicio
     */
    public Inicio() {
    }
    
    /**
     *
     * @return
     */
    public String sobreNosotros()
    {
        return "sobrenosotros.xhtml";
    }
    
    public String eventos()
    {
        return "eventos.xhtml";
    }
    
    public String inscribirse()
    {
        return "inscribirse.xhtml";
    }
    
    public String noticias()
    {
        return "noticias.xhtml";
    }
    
    public String secciones()
    {
        return "secciones.xhtml";
    }
}
