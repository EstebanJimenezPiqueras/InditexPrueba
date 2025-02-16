package inditex.esteban.prueba.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public class PriceDTO implements Serializable {

        private Integer productId;
        private Integer brandId;
        private Integer priceList;
        private LocalDateTime applicationDate;
        private BigDecimal price;
        private String currency;


        public PriceDTO() {
        }

        public PriceDTO(Integer productId, Integer brandId, Integer priceList, LocalDateTime applicationDate, BigDecimal price, String currency) {
                this.productId = productId;
                this.brandId = brandId;
                this.priceList = priceList;
                this.applicationDate = applicationDate;
                this.price = price;
                this.currency = currency;
        }

        public Integer getProductId() {
                return productId;
        }

        public void setProductId(Integer productId) {
                this.productId = productId;
        }

        public Integer getBrandId() {
                return brandId;
        }

        public void setBrandId(Integer brandId) {
                this.brandId = brandId;
        }

        public Integer getPriceList() {
                return priceList;
        }

        public void setPriceList(Integer priceList) {
                this.priceList = priceList;
        }

        public LocalDateTime getApplicationDate() {
                return applicationDate;
        }

        public void setApplicationDate(LocalDateTime applicationDate) {
                this.applicationDate = applicationDate;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public String getCurrency() {
                return currency;
        }

        public void setCurrency(String currency) {
                this.currency = currency;
        }
}
