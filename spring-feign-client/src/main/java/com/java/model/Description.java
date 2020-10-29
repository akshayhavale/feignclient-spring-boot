
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
    "name",
    "description",
    "friendlyUrl",
    "keyWords",
    "highlights",
    "metaDescription",
    "title"
})
public class Description {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("language")
    private String language;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("friendlyUrl")
    private String friendlyUrl;
    @JsonProperty("keyWords")
    private String keyWords;
    @JsonProperty("highlights")
    private String highlights;
    @JsonProperty("metaDescription")
    private String metaDescription;
    @JsonProperty("title")
    private String title;
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
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("friendlyUrl")
    public String getFriendlyUrl() {
        return friendlyUrl;
    }

    @JsonProperty("friendlyUrl")
    public void setFriendlyUrl(String friendlyUrl) {
        this.friendlyUrl = friendlyUrl;
    }

    @JsonProperty("keyWords")
    public String getKeyWords() {
        return keyWords;
    }

    @JsonProperty("keyWords")
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    @JsonProperty("highlights")
    public String getHighlights() {
        return highlights;
    }

    @JsonProperty("highlights")
    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    @JsonProperty("metaDescription")
    public String getMetaDescription() {
        return metaDescription;
    }

    @JsonProperty("metaDescription")
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
