package inditex.esteban.prueba.db.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRAND_ID", nullable = false)
    private Integer brandId;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "END_DATE", nullable = false)
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST", nullable = false)
    private Integer priceList;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productId;

    @Column(name = "PRIORITY", nullable = false)
    private Integer priority;

    @Column(name = "PRICE", nullable = false, length = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "CURR", nullable = false)
    private String currency;


    public Price() {
    }

    public Price(Long id, Integer brandId, LocalDateTime startDate, LocalDateTime endDate, Integer priceList, Integer productId, Integer priority, BigDecimal price, String currency) {
        this.id = id;
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
