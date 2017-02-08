package br.com.campany.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.campany.domain.Store;
import br.com.campany.service.StoreService;

@RestController
public class StoreController {
    
    @Autowired
    private StoreService storeService;
    
    @RequestMapping(value = "/stores", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Store>> list() {
       
       return new ResponseEntity<List<Store>>((List<Store>) storeService.listAllStore(), HttpStatus.FOUND);
    }
    
    @RequestMapping(value = "store/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Store> showStore(@PathVariable Long id) {
        
        //extends HttpEntity and adds additional information of HTTP method and uri to the request.
        return new ResponseEntity<Store>(storeService.getStoreById(id), HttpStatus.FOUND);
    }
    
    @RequestMapping(value = "store", method = RequestMethod.POST,  consumes = "application/json")
    public String saveEmployee(@RequestBody  Store store) {
        
        storeService.saveStore(store);
        return "redirect:/store/" + store.getIdStore();
    }
    
    @RequestMapping(value = "store/update", method = RequestMethod.PUT,  consumes = "application/json")
    public String updateStore(@RequestBody  Store store) {

        Store newStore = new Store();
        newStore = storeService.getStoreById(store.getIdStore());
        if (store.getAddressStore() != null){
            newStore.setAddressStore(store.getAddressStore());
        }
        if (store.getNumberStore() != null){
            newStore.setNumberStore(store.getNumberStore());
        }
        if (store.getCityStore() != null){
            newStore.setCityStore(store.getCityStore());
        }
        if (store.getStateStore() != null){
            newStore.setStateStore(store.getStateStore());
        }
        if (store.getEmployee() != null) {
            newStore.setEmployee(store.getEmployee());
        }
        storeService.saveStore(newStore);
        return "redirect:/employee/update" + store.getIdStore();
    }
    
    @RequestMapping("store/delete/{id}")
    public String deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
        return "redirect:/employees";
    }
}
