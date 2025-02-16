package inditex.esteban.prueba.controller;

import inditex.esteban.prueba.exception.ErrorCode;
import inditex.esteban.prueba.exception.ErrorResponse;
import inditex.esteban.prueba.model.PriceDTO;
import inditex.esteban.prueba.service.PriceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/prices")
public class PriceController implements PriceControllerInterface {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }


    @Override
    @GetMapping("/getPrice")
    public ResponseEntity<?> getPrice(
            @RequestParam Integer productId,
            @RequestParam Integer brandId,
            @RequestParam("applicationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate) {

        PriceDTO price = priceService.getApplicablePrice(productId, brandId, applicationDate);

        if (price!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(price);
        } else {
            ErrorResponse errorResponse = new ErrorResponse(ErrorCode.PRICE_NOT_FOUND);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

    }
}
