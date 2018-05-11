/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import entidadesJPA.Usuario;
import entidadesJPA.Rol;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named(value = "controlAutorizacion")
@SessionScoped
public class ControlAutorizacion implements Serializable {

    private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String home() {
        
        String res=null;
        
        if (usuario==null)
        {
            res="inicio.xhtml";
        }
        else if ( usuario.getRol() == Rol.educando)
        {
            res="educando.xhtml";
        }
        else if ( usuario.getRol() ==Rol.administrador)
        {
            res="admin.xhtml";
        }
        else if ( usuario.getRol() ==Rol.voluntario)
        {
            res="voluntario.xhtml";
        }
        return res;
    }
    
    public String logout()
    {
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        return "inicio.xhtml";
    }

    public ControlAutorizacion() {
    }
}
