package inditex.esteban.prueba.mapper;

import inditex.esteban.prueba.db.entity.Price;
import inditex.esteban.prueba.model.PriceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface PriceMapper {



    @Mapping(target = "applicationDate", source = "appDateTime")
    @Mapping(target = "productId", source = "price.productId")
    @Mapping(target = "brandId", source = "price.brandId")
    @Mapping(target = "priceList", source = "price.priceList")
    @Mapping(target = "price", source = "price.price")
    @Mapping(target = "currency", source = "price.currency")
    PriceDTO priceToPriceResponseDTO(Price price, LocalDateTime appDateTime);
}
