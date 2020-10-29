
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
    "language",
    "option",
    "optionValue"
})
public class CartItemattribute {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("language")
    private Object language;
    @JsonProperty("option")
    private Option option;
    @JsonProperty("optionValue")
    private OptionValue optionValue;
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

    @JsonProperty("option")
    public Option getOption() {
        return option;
    }

    @JsonProperty("option")
    public void setOption(Option option) {
        this.option = option;
    }

    @JsonProperty("optionValue")
    public OptionValue getOptionValue() {
        return optionValue;
    }

    @JsonProperty("optionValue")
    public void setOptionValue(OptionValue optionValue) {
        this.optionValue = optionValue;
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
