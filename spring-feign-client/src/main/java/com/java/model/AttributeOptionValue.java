
package com.java.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "optionValueCode",
    "optionValueId",
    "attributePrice",
    "attributeQuantity",
    "image",
    "optionValueDefault",
    "attributeId",
    "productWithAttrPrice"
})
public class AttributeOptionValue {

    @JsonProperty("optionValueCode")
    private String optionValueCode;
    @JsonProperty("optionValueId")
    private Integer optionValueId;
    @JsonProperty("attributePrice")
    private String attributePrice;
    @JsonProperty("attributeQuantity")
    private Integer attributeQuantity;
    @JsonProperty("image")
    private String image;
    @JsonProperty("optionValueDefault")
    private Boolean optionValueDefault;
    @JsonProperty("attributeId")
    private Integer attributeId;
    @JsonProperty("productWithAttrPrice")
    private Double productWithAttrPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("optionValueCode")
    public String getOptionValueCode() {
        return optionValueCode;
    }

    @JsonProperty("optionValueCode")
    public void setOptionValueCode(String optionValueCode) {
        this.optionValueCode = optionValueCode;
    }

    @JsonProperty("optionValueId")
    public Integer getOptionValueId() {
        return optionValueId;
    }

    @JsonProperty("optionValueId")
    public void setOptionValueId(Integer optionValueId) {
        this.optionValueId = optionValueId;
    }

    @JsonProperty("attributePrice")
    public String getAttributePrice() {
        return attributePrice;
    }

    @JsonProperty("attributePrice")
    public void setAttributePrice(String attributePrice) {
        this.attributePrice = attributePrice;
    }

    @JsonProperty("attributeQuantity")
    public Integer getAttributeQuantity() {
        return attributeQuantity;
    }

    @JsonProperty("attributeQuantity")
    public void setAttributeQuantity(Integer attributeQuantity) {
        this.attributeQuantity = attributeQuantity;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("optionValueDefault")
    public Boolean getOptionValueDefault() {
        return optionValueDefault;
    }

    @JsonProperty("optionValueDefault")
    public void setOptionValueDefault(Boolean optionValueDefault) {
        this.optionValueDefault = optionValueDefault;
    }

    @JsonProperty("attributeId")
    public Integer getAttributeId() {
        return attributeId;
    }

    @JsonProperty("attributeId")
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    @JsonProperty("productWithAttrPrice")
    public Double getProductWithAttrPrice() {
        return productWithAttrPrice;
    }

    @JsonProperty("productWithAttrPrice")
    public void setProductWithAttrPrice(Double productWithAttrPrice) {
        this.productWithAttrPrice = productWithAttrPrice;
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
