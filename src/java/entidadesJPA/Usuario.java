/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadesJPA;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ADRIAN LUACES
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellidos;
    private String aliasUs;
    private String contrasenia;
    private String miembroEstruct;
    @Temporal(TemporalType.DATE)
    private Date fecha_Alta;
    @Temporal(TemporalType.DATE)
    private Date fecha_Baja;
    private String grupo;
    private String DNI;
    @Temporal(TemporalType.DATE)
    private Date fecha_Nac;
    private String calle;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private int codigo_postal;
    private String localidad;
    private String provincia;
    private int  telefono;
    private int  movil;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Enumerated(EnumType.STRING)
    private Ambito ambito;
    @Lob
    @Basic(fetch=LAZY)
    private byte[] foto;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Noticia> noticias;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Hist_asist> historial;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Documentacion> documentacion;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Cuotas> cuotas;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Cargo_estructura> cargo_estr;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Comentarios> comentarios;
    @OneToMany(mappedBy="usuario",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Registro_seccion> registro_sec;
    
    
    public Usuario()
    {
        
    }
    
    public Usuario(String alias,String contrasenia,Rol rol)
    {
        this.aliasUs=alias;
        this.contrasenia=contrasenia;
        this.rol=rol;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }
    
  
    
    public String getMiembroEstructura() {
        return miembroEstruct;
    }

    public void setMiembroEstructura(String miembroEstruct) {
        this.miembroEstruct=miembroEstruct;
    }
    
    public String getAliasUs() {
        return aliasUs;
    }

    public void setAliasUs(String aliasUs) {
        this.aliasUs = aliasUs;
    }
    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia=contrasenia;
    }
    
    /**
     * @return the fecha_Alta
     */
    public Date getFecha_Alta() {
        return fecha_Alta;
    }

    /**
     * @param fecha_Alta the fecha_Alta to set
     */
    public void setFecha_Alta(Date fecha_Alta) {
        this.fecha_Alta = fecha_Alta;
    }

    /**
     * @return the fecha_Baja
     */
    public Date getFecha_Baja() {
        return fecha_Baja;
    }

    /**
     * @param fecha_Baja the fecha_Baja to set
     */
    public void setFecha_Baja(Date fecha_Baja) {
        this.fecha_Baja = fecha_Baja;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the fecha_Nac
     */
    public Date getFecha_Nac() {
        return fecha_Nac;
    }

    /**
     * @param fecha_Nac the fecha_Nac to set
     */
    public void setFecha_Nac(Date fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the codigo_postal
     */
    public int getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * @param codigo_postal the codigo_postal to set
     */
    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the numeric
     */
    public int getMovil() {
        return movil;
    }

    /**
     * @param movil the numeric to set
     */
    public void setMovil(int movil) {
        this.movil = movil;
    }
    
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * @return the ambito
     */
    public Ambito getAmbito() {
        return ambito;
    }

    /**
     * @param ambito the ambito to set
     */
    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public List<Noticia> getNoticias() {
        return noticias;
    }
    
    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
    
    /**
     * @return the historial
     */
    public List<Hist_asist> getHistorial() {
        return historial;
    }
    
    public void setHistorial(List<Hist_asist> historial) {
        this.historial = historial;
    }
    /**
     * @return the documentacion
     */
    public List<Documentacion> getDocumentacion() {
        return documentacion;
    }
    
    public void setDocumentacion(List<Documentacion> documentacion) {
        this.documentacion = documentacion;
    }

    /**
     * @return the cuotas
     */
    public List<Cuotas> getCuotas() {
        return cuotas;
    }
    
    public void setCuotas(List<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * @return the cargo_estr
     */
    public List<Cargo_estructura> getCargo_estr() {
        return cargo_estr;
    }
    
    public void setCargo_estr(List<Cargo_estructura> cargo_estr) {
        this.cargo_estr = cargo_estr;
    }
    /**
     * @return the comentarios
     */
    public List<Comentarios> getComentarios() {
        return comentarios;
    }
    
    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
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
    
    
    @Override
    public String toString() {
        return "trabajoscouts.Usuario[ id=" + id + " ]";
    }

    /**
     * @return the noticias
     */

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

   

    
    
}
