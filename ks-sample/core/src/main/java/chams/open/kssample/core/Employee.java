/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.core;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author cam
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id"),
    @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name"),
    @NamedQuery(name = "Employee.findByDob", query = "SELECT e FROM Employee e WHERE e.dob = :dob"),
    @NamedQuery(name = "Employee.findByKids", query = "SELECT e FROM Employee e WHERE e.kids = :kids")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Temporal(TemporalType.DATE)
    private Date dob;
    private int kids;

    @ManyToOne(optional=false)
    @JoinColumn(nullable=false)
    private Designation designation;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, String name, int kids) {
        this.id = id;
        this.name = name;
        this.kids = kids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "chams.open.kssample.core.Employee[ id=" + id + " ]";
    }
}
