
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
    "id",
    "title",
    "text",
    "code",
    "order",
    "module",
    "value",
    "total",
    "discounted"
})
public class Total {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("text")
    private Object text;
    @JsonProperty("code")
    private String code;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("module")
    private Object module;
    @JsonProperty("value")
    private Double value;
    @JsonProperty("total")
    private Object total;
    @JsonProperty("discounted")
    private Boolean discounted;
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

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("text")
    public Object getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Object text) {
        this.text = text;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("module")
    public Object getModule() {
        return module;
    }

    @JsonProperty("module")
    public void setModule(Object module) {
        this.module = module;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("total")
    public Object getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Object total) {
        this.total = total;
    }

    @JsonProperty("discounted")
    public Boolean getDiscounted() {
        return discounted;
    }

    @JsonProperty("discounted")
    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
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
