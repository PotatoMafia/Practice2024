package com.programmingtechie.inventory_service.service;
import com.programmingtechie.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;
@Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        log.info("Checking Inventory");
         return inventoryRepository.findBySkuCode(skuCode).isPresent();

    }
}
