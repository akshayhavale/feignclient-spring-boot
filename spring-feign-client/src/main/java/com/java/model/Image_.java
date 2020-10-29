
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
    "imageName",
    "imageUrl",
    "externalUrl",
    "videoUrl",
    "imageType",
    "defaultImage"
})
public class Image_ {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("imageName")
    private String imageName;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("externalUrl")
    private Object externalUrl;
    @JsonProperty("videoUrl")
    private Object videoUrl;
    @JsonProperty("imageType")
    private Integer imageType;
    @JsonProperty("defaultImage")
    private Boolean defaultImage;
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

    @JsonProperty("imageName")
    public String getImageName() {
        return imageName;
    }

    @JsonProperty("imageName")
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("externalUrl")
    public Object getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty("externalUrl")
    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonProperty("videoUrl")
    public Object getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("videoUrl")
    public void setVideoUrl(Object videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("imageType")
    public Integer getImageType() {
        return imageType;
    }

    @JsonProperty("imageType")
    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

    @JsonProperty("defaultImage")
    public Boolean getDefaultImage() {
        return defaultImage;
    }

    @JsonProperty("defaultImage")
    public void setDefaultImage(Boolean defaultImage) {
        this.defaultImage = defaultImage;
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
