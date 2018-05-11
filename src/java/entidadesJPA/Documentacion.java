/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ADRIAN LUACES
 */
@Entity
public class Documentacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fechaDoc;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String tipoDoc;
    private String nombreDoc;
    @Lob
    @Basic(fetch=LAZY)
    private byte[] imagen;
    @Lob
    @Basic(fetch=LAZY)
    private byte[] documento;
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
    
    public Date getFechaDocumentacion() {
        return fechaDoc;
    }

    public void setFechaDocumentacion(Date fechaDoc) {
        this.fechaDoc=fechaDoc;
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado=estado;
    }
    
    public String getTipoDocumentacion() {
        return tipoDoc;
    }

    public void setTipoDocumentacion(String tipoDoc) {
        this.tipoDoc=tipoDoc;
    }
    
    public String getNombreDocumentacion() {
        return nombreDoc;
    }

    public void setNombreDocumentacion(String nombreDoc) {
        this.nombreDoc=nombreDoc;
    }
    
        /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte [] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the documento
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(byte[] documento) {
        this.documento = documento;
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
        if (!(object instanceof Documentacion)) {
            return false;
        }
        Documentacion other = (Documentacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trabajoscouts.Documentacion[ id=" + id + " ]";
    }

    
}
