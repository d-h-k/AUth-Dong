package net.pirates.Service;

import net.pirates.Domain.Store;
import net.pirates.Repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> storeList() {
        return storeRepository.findAll();
    }
}
