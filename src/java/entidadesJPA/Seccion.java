/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ADRIAN LUACES
 */
@Entity
public class Seccion implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoSeccion tipoSec;
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @OneToMany(mappedBy="seccion",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Registro_seccion> registro_sec;
    @OneToMany(mappedBy="seccion",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Evento> eventos;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the registro_sec
     */
    public List<Registro_seccion> getRegistro_sec() {
        return registro_sec;
    }
    
    public void setRegistro_sec(List<Registro_seccion> registro_sec) {
        this.registro_sec = registro_sec;
    }

    /**
     * @return the eventos
     */
    public List<Evento> getEventos() {
        return eventos;
    }
    
    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }


    
    public TipoSeccion getTipoSec() {
        return tipoSec;
    }

    public void setTipoSec(TipoSeccion tipoSec) {
        this.tipoSec=tipoSec;
    }
    
    /**
     * @return the fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    /**
     * @return the fechaBaja
     */
    public Date getFechaBaja() {
        return fechaBaja;
    }

    /**
     * @param fechaBaja the fechaBaja to set
     */
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
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
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trabajoscouts.Seccion[ id=" + id + " ]";
    }
    
}
