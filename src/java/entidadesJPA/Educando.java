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
public class Educando extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String resp_nom1;
    private String resp_ape1;
    private String resp_DNI1;
    private String resp_nom2;
    private String resp_ape2;
    private String resp_DNI2;
    private String resp_email;
    
    
     /**
     * @return the resp_nom1
     */
    public String getResp_nom1() {
        return resp_nom1;
    }

    /**
     * @param resp_nom1 the resp_nom1 to set
     */
    public void setResp_nom1(String resp_nom1) {
        this.resp_nom1 = resp_nom1;
    }

    /**
     * @return the resp_ape1
     */
    public String getResp_ape1() {
        return resp_ape1;
    }

    /**
     * @param resp_ape1 the resp_ape1 to set
     */
    public void setResp_ape1(String resp_ape1) {
        this.resp_ape1 = resp_ape1;
    }

    /**
     * @return the resp_DNI1
     */
    public String getResp_DNI1() {
        return resp_DNI1;
    }

    /**
     * @param resp_DNI1 the resp_DNI1 to set
     */
    public void setResp_DNI1(String resp_DNI1) {
        this.resp_DNI1 = resp_DNI1;
    }

    /**
     * @return the resp_nom2
     */
    public String getResp_nom2() {
        return resp_nom2;
    }

    /**
     * @param resp_nom2 the resp_nom2 to set
     */
    public void setResp_nom2(String resp_nom2) {
        this.resp_nom2 = resp_nom2;
    }

    /**
     * @return the resp_ape2
     */
    public String getResp_ape2() {
        return resp_ape2;
    }

    /**
     * @param resp_ape2 the resp_ape2 to set
     */
    public void setResp_ape2(String resp_ape2) {
        this.resp_ape2 = resp_ape2;
    }

    /**
     * @return the resp_DNI2
     */
    public String getResp_DNI2() {
        return resp_DNI2;
    }

    /**
     * @param resp_DNI2 the resp_DNI2 to set
     */
    public void setResp_DNI2(String resp_DNI2) {
        this.resp_DNI2 = resp_DNI2;
    }

    /**
     * @return the resp_email
     */
    public String getResp_email() {
        return resp_email;
    }

    /**
     * @param resp_email the resp_email to set
     */
    public void setResp_email(String resp_email) {
        this.resp_email = resp_email;
    }
       
}
