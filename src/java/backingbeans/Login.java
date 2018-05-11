/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import entidadesJPA.Usuario;
import entidadesJPA.Usuario.Rol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


/**
 *
 * @author francis
 */
@Named(value = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<Usuario> usuarios;
    
    
    @Inject
    private ControlAutorizacion ctrl;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        
        usuarios = new ArrayList<Usuario>();
       
        usuarios.add(new Usuario("manolo", "qwer", Rol.ADMINISTRADOR));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este método
        
        String result=null;
        
        Iterator <Usuario> it = usuarios.iterator();
        
        boolean encontrado =false;
        
        while(it.hasNext() && !encontrado)
        {
            Usuario us = it.next();
            
            if ( us.getUsuario().equals(usuario))
            {
                if (us.getContrasenia().equals(contrasenia))
                {
                    ctrl.setUsuario(us);
                    result=ctrl.home();
                    encontrado=true;
                    
                }
                else
                {
                    FacesContext ctx = FacesContext.getCurrentInstance();//objeto para crear el mensaje
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña incorrecta", "Contraseña incorrecta"));
                }
            }
        }
        if (!encontrado){
            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no encontrado", "Usuario no encontrado"));
        }
        return result;
    }
}
