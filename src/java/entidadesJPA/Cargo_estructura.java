/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author ADRIAN LUACES
 */
@Entity
public class Cargo_estructura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Comite  comite;
    private boolean consejo;
    private boolean tutorFormac;
    private boolean secretaria;
    @ManyToOne
    private Usuario usuario;

    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Comite getComite() {
        return comite;
    }

    public void setComite(Comite comite) {
        this.comite = comite;
    }
    
    public boolean isConsejo() {
        return consejo;
    }

    public void setConsejo(boolean consejo) {
        this.consejo=consejo;
    }

    public boolean isTutorFormacion() {
        return tutorFormac;
    }

    public void setTutorFormac(boolean tutorFormac) {
        this.tutorFormac=tutorFormac;
    }
    
    public boolean isSecretaria() {
        return secretaria;
    }

    public void setSecretaria(boolean secretaria) {
        this.secretaria = secretaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo_estructura)) {
            return false;
        }
        Cargo_estructura other = (Cargo_estructura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trabajoscouts.Cargo_estructura[ id=" + id + " ]";
    }
    
}
