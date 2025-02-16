package inditex.esteban.prueba.controller;

import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;


public interface PriceControllerInterface {

    ResponseEntity<?> getPrice(Integer productId, Integer brandId, LocalDateTime applicationDate);
}
