package br.com.campany.integration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.campany.domain.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long>{

}
