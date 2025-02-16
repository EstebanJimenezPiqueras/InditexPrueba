package inditex.esteban.prueba.service;


import inditex.esteban.prueba.db.dao.PriceDAO;
import inditex.esteban.prueba.db.entity.Price;
import inditex.esteban.prueba.mapper.PriceMapper;
import inditex.esteban.prueba.model.PriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PriceService {

    @Autowired
    private PriceDAO priceDAO;

    @Autowired
    PriceMapper priceMapper;


    //Retornamos el objeto en vez de un ResponseEntity por si se quiere reutilizar en un futuro dentro del micro
    public PriceDTO getApplicablePrice(Integer productId, Integer brandId, LocalDateTime applicationDate) {

         Optional<Price> resultPrice = priceDAO.findApplicablePrice(productId, brandId, applicationDate);

         return resultPrice.isPresent()?priceMapper.priceToPriceResponseDTO(resultPrice.get(),applicationDate):null;

    }
}
