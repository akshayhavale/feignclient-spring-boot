
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
    "height",
    "weight",
    "length",
    "width",
    "model",
    "manufacturer",
    "dimensionUnitOfMeasure",
    "weightUnitOfMeasure"
})
public class ProductSpecifications {

    @JsonProperty("height")
    private Double height;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("length")
    private Double length;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("model")
    private Object model;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("dimensionUnitOfMeasure")
    private String dimensionUnitOfMeasure;
    @JsonProperty("weightUnitOfMeasure")
    private String weightUnitOfMeasure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    @JsonProperty("model")
    public Object getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(Object model) {
        this.model = model;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("dimensionUnitOfMeasure")
    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    @JsonProperty("dimensionUnitOfMeasure")
    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    @JsonProperty("weightUnitOfMeasure")
    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    @JsonProperty("weightUnitOfMeasure")
    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
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
