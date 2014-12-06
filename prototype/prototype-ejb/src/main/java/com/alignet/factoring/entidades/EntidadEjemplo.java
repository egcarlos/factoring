/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alignet.factoring.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(
        name = "AN_EJEMPLO"
)
@SequenceGenerator(
        name = "GeneradorEjemplo",
        sequenceName = "SEQ_EJEMPLO"
)
public class EntidadEjemplo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Los identificadores de
     */
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "GeneradorEjemplo"
    )
    @Column(name = "EJEMPLO_ID")
    private Long id;

    @Column(name = "CAMPO")
    private String campo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
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
        if (!(object instanceof EntidadEjemplo)) {
            return false;
        }
        EntidadEjemplo other = (EntidadEjemplo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alignet.factoring.entities.SampleEntity[ id=" + id + " ]";
    }

}
