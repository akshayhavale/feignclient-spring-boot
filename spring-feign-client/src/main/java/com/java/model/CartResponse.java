
package com.java.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "language",
    "code",
    "subtotal",
    "displaySubTotal",
    "total",
    "displayTotal",
    "quantity",
    "products",
    "totals",
    "customer"
})
public class CartResponse {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("code")
    private String code;
    @JsonProperty("subtotal")
    private Double subtotal;
    @JsonProperty("displaySubTotal")
    private String displaySubTotal;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("displayTotal")
    private String displayTotal;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("totals")
    private List<Total> totals = null;
    @JsonProperty("customer")
    private Integer customer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(Object language) {
        this.language = language;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("subtotal")
    public Double getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("displaySubTotal")
    public String getDisplaySubTotal() {
        return displaySubTotal;
    }

    @JsonProperty("displaySubTotal")
    public void setDisplaySubTotal(String displaySubTotal) {
        this.displaySubTotal = displaySubTotal;
    }

    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    @JsonProperty("displayTotal")
    public String getDisplayTotal() {
        return displayTotal;
    }

    @JsonProperty("displayTotal")
    public void setDisplayTotal(String displayTotal) {
        this.displayTotal = displayTotal;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("totals")
    public List<Total> getTotals() {
        return totals;
    }

    @JsonProperty("totals")
    public void setTotals(List<Total> totals) {
        this.totals = totals;
    }

    @JsonProperty("customer")
    public Integer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
