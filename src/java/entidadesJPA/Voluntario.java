/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Entity;


/**
 *
 * @author ADRIAN LUACES
 */
@Entity
public class Voluntario extends Usuario implements Serializable  {

    private static final long serialVersionUID = 1L;
   
    private String cargo;
    
    
     /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
