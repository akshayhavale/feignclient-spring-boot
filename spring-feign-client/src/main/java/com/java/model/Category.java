
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
    "code",
    "sortOrder",
    "visible",
    "featured",
    "lineage",
    "depth",
    "parent",
    "description",
    "productCount",
    "children"
})
public class Category {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("sortOrder")
    private Integer sortOrder;
    @JsonProperty("visible")
    private Boolean visible;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("lineage")
    private String lineage;
    @JsonProperty("depth")
    private Integer depth;
    @JsonProperty("parent")
    private Object parent;
    @JsonProperty("description")
    private Description__ description;
    @JsonProperty("productCount")
    private Integer productCount;
    @JsonProperty("children")
    private List<Object> children = null;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("sortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonProperty("lineage")
    public String getLineage() {
        return lineage;
    }

    @JsonProperty("lineage")
    public void setLineage(String lineage) {
        this.lineage = lineage;
    }

    @JsonProperty("depth")
    public Integer getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @JsonProperty("parent")
    public Object getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Object parent) {
        this.parent = parent;
    }

    @JsonProperty("description")
    public Description__ getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description__ description) {
        this.description = description;
    }

    @JsonProperty("productCount")
    public Integer getProductCount() {
        return productCount;
    }

    @JsonProperty("productCount")
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @JsonProperty("children")
    public List<Object> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Object> children) {
        this.children = children;
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
