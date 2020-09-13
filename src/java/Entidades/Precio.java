/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jimmy
 */
@Entity
@Table(name = "precio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Precio.findAll", query = "SELECT p FROM Precio p")
    , @NamedQuery(name = "Precio.findByCodproducto", query = "SELECT p FROM Precio p WHERE p.codproducto = :codproducto")
    , @NamedQuery(name = "Precio.findByPrecvenpe", query = "SELECT p FROM Precio p WHERE p.precvenpe = :precvenpe")
    , @NamedQuery(name = "Precio.findByPrecompe", query = "SELECT p FROM Precio p WHERE p.precompe = :precompe")})
public class Precio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "codproducto")
    private String codproducto;
    @Column(name = "precvenpe")
    private Long precvenpe;
    @Column(name = "precompe")
    private Long precompe;
    @JoinColumn(name = "codproducto", referencedColumnName = "codproducto", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Productos productos;

    public Precio() {
    }

    public Precio(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public Long getPrecvenpe() {
        return precvenpe;
    }

    public void setPrecvenpe(Long precvenpe) {
        this.precvenpe = precvenpe;
    }

    public Long getPrecompe() {
        return precompe;
    }

    public void setPrecompe(Long precompe) {
        this.precompe = precompe;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproducto != null ? codproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precio)) {
            return false;
        }
        Precio other = (Precio) object;
        if ((this.codproducto == null && other.codproducto != null) || (this.codproducto != null && !this.codproducto.equals(other.codproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Precio[ codproducto=" + codproducto + " ]";
    }
    
}
