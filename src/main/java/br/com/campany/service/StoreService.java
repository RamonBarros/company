package br.com.campany.service;

import br.com.campany.domain.Store;

public interface StoreService {
    
    Iterable <Store> listAllStore();
    
    Store getStoreById(Long id);
    
    Store saveStore(Store store);
    
    void deleteStore(Long id);
}
