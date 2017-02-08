package br.com.campany.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
    
    private static final long serialVersionUID = -6332748512915369097L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private Long idEmployee;
    
    @Column(name="employee_name")
    private String nameEmployee;
    
    @Column(name="employee_department")
    private String departmentEmployee;
    
    @Column(name="employee_number")
    private String numberEmployee;
    
    @Column(name="employee_post")
    private String postEmployee;
    
    @ManyToOne
    @JoinColumn(name="store_id", nullable=false)
    private Store store;

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(String departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public String getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(String numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public String getPostEmployee() {
        return postEmployee;
    }

    public void setPostEmployee(String postEmployee) {
        this.postEmployee = postEmployee;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Employee [idEmployee=" + idEmployee + ", nameEmployee=" + nameEmployee + ", departmentEmployee="
                + departmentEmployee + ", numberEmployee=" + numberEmployee + ", postEmployee=" + postEmployee
                + ", store=" + store + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((departmentEmployee == null) ? 0 : departmentEmployee.hashCode());
        result = prime * result + ((idEmployee == null) ? 0 : idEmployee.hashCode());
        result = prime * result + ((nameEmployee == null) ? 0 : nameEmployee.hashCode());
        result = prime * result + ((numberEmployee == null) ? 0 : numberEmployee.hashCode());
        result = prime * result + ((postEmployee == null) ? 0 : postEmployee.hashCode());
        result = prime * result + ((store == null) ? 0 : store.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (departmentEmployee == null) {
            if (other.departmentEmployee != null)
                return false;
        } else if (!departmentEmployee.equals(other.departmentEmployee))
            return false;
        if (idEmployee == null) {
            if (other.idEmployee != null)
                return false;
        } else if (!idEmployee.equals(other.idEmployee))
            return false;
        if (nameEmployee == null) {
            if (other.nameEmployee != null)
                return false;
        } else if (!nameEmployee.equals(other.nameEmployee))
            return false;
        if (numberEmployee == null) {
            if (other.numberEmployee != null)
                return false;
        } else if (!numberEmployee.equals(other.numberEmployee))
            return false;
        if (postEmployee == null) {
            if (other.postEmployee != null)
                return false;
        } else if (!postEmployee.equals(other.postEmployee))
            return false;
        if (store == null) {
            if (other.store != null)
                return false;
        } else if (!store.equals(other.store))
            return false;
        return true;
    }
}
