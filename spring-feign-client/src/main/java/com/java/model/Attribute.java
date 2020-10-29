
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
    "optionCode",
    "optionId",
    "type",
    "readOnly",
    "attributeDefault",
    "language",
    "attributeOptionValues"
})
public class Attribute {

    @JsonProperty("optionCode")
    private String optionCode;
    @JsonProperty("optionId")
    private Integer optionId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("readOnly")
    private Boolean readOnly;
    @JsonProperty("attributeDefault")
    private Boolean attributeDefault;
    @JsonProperty("language")
    private String language;
    @JsonProperty("attributeOptionValues")
    private List<AttributeOptionValue> attributeOptionValues = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("optionCode")
    public String getOptionCode() {
        return optionCode;
    }

    @JsonProperty("optionCode")
    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    @JsonProperty("optionId")
    public Integer getOptionId() {
        return optionId;
    }

    @JsonProperty("optionId")
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonProperty("attributeDefault")
    public Boolean getAttributeDefault() {
        return attributeDefault;
    }

    @JsonProperty("attributeDefault")
    public void setAttributeDefault(Boolean attributeDefault) {
        this.attributeDefault = attributeDefault;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("attributeOptionValues")
    public List<AttributeOptionValue> getAttributeOptionValues() {
        return attributeOptionValues;
    }

    @JsonProperty("attributeOptionValues")
    public void setAttributeOptionValues(List<AttributeOptionValue> attributeOptionValues) {
        this.attributeOptionValues = attributeOptionValues;
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
