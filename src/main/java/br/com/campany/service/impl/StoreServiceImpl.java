package br.com.campany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.campany.domain.Store;
import br.com.campany.integration.StoreRepository;
import br.com.campany.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {
    
    @Autowired
    private StoreRepository storeRepository;
    
    @Override
    public Iterable<Store> listAllStore() {
        
        return storeRepository.findAll();
    }

    @Override
    public Store getStoreById(Long id) {
        
        return storeRepository.findOne(id);
    }

    @Override
    public Store saveStore(Store store) {
        
        return storeRepository.save(store);
    }

    @Override
    public void deleteStore(Long id) {
        
        storeRepository.delete(id);
    }

}
