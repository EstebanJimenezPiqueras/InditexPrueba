package inditex.esteban.prueba.db.dao;

import inditex.esteban.prueba.db.entity.Price;
import inditex.esteban.prueba.db.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class PriceDAO {

    @Autowired
    private PriceRepository priceRepository;


    public Optional<Price> findApplicablePrice(Integer productId, Integer brandId, LocalDateTime applicationDate) {
        return priceRepository.findFirstByProductIdAndBrandIdAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(
                productId, brandId, applicationDate, applicationDate);
    }
}
