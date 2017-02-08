package br.com.campany.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store implements Serializable {
    
    private static final long serialVersionUID = 4716944663914290157L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="store_id")
    private Long idStore;
    
    @Column(name="store_address")
    private String addressStore;
    
    @Column(name="store_number")
    private String numberStore;
    
    @Column(name="store_city")
    private String cityStore;
    
    @Column(name="storeState")
    private String stateStore;
    
    @OneToMany(mappedBy="store")
    private Set<Employee> employee;

    public Long getIdStore() {
        return idStore;
    }

    public void setIdStore(Long idStore) {
        this.idStore = idStore;
    }

    public String getAddressStore() {
        return addressStore;
    }

    public void setAddressStore(String addressStore) {
        this.addressStore = addressStore;
    }

    public String getNumberStore() {
        return numberStore;
    }

    public void setNumberStore(String numberStore) {
        this.numberStore = numberStore;
    }

    public String getCityStore() {
        return cityStore;
    }

    public void setCityStore(String cityStore) {
        this.cityStore = cityStore;
    }

    public String getStateStore() {
        return stateStore;
    }

    public void setStateStore(String stateStore) {
        this.stateStore = stateStore;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Store [idStore=" + idStore + ", addressStore=" + addressStore + ", numberStore=" + numberStore
                + ", cityStore=" + cityStore + ", stateStore=" + stateStore + ", employee=" + employee + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addressStore == null) ? 0 : addressStore.hashCode());
        result = prime * result + ((cityStore == null) ? 0 : cityStore.hashCode());
        result = prime * result + ((employee == null) ? 0 : employee.hashCode());
        result = prime * result + ((idStore == null) ? 0 : idStore.hashCode());
        result = prime * result + ((numberStore == null) ? 0 : numberStore.hashCode());
        result = prime * result + ((stateStore == null) ? 0 : stateStore.hashCode());
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
        Store other = (Store) obj;
        if (addressStore == null) {
            if (other.addressStore != null)
                return false;
        } else if (!addressStore.equals(other.addressStore))
            return false;
        if (cityStore == null) {
            if (other.cityStore != null)
                return false;
        } else if (!cityStore.equals(other.cityStore))
            return false;
        if (employee == null) {
            if (other.employee != null)
                return false;
        } else if (!employee.equals(other.employee))
            return false;
        if (idStore == null) {
            if (other.idStore != null)
                return false;
        } else if (!idStore.equals(other.idStore))
            return false;
        if (numberStore == null) {
            if (other.numberStore != null)
                return false;
        } else if (!numberStore.equals(other.numberStore))
            return false;
        if (stateStore == null) {
            if (other.stateStore != null)
                return false;
        } else if (!stateStore.equals(other.stateStore))
            return false;
        return true;
    }
}
