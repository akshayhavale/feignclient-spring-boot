
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
    "price",
    "quantity",
    "sku",
    "productShipeable",
    "preOrder",
    "productVirtual",
    "quantityOrderMaximum",
    "quantityOrderMinimum",
    "productIsFree",
    "available",
    "visible",
    "productSpecifications",
    "rating",
    "ratingCount",
    "sortOrder",
    "dateAvailable",
    "dateOfNotAvailable",
    "refSku",
    "condition",
    "creationDate",
    "rentalDuration",
    "rentalPeriod",
    "rentalStatus",
    "bargain",
    "sellItFaster",
    "description",
    "finalPrice",
    "originalPrice",
    "discounted",
    "image",
    "images",
    "manufacturer",
    "categories",
    "type",
    "canBePurchased",
    "owner",
    "productUserDetail",
    "attributes",
    "subTotal",
    "displaySubTotal",
    "cartItemattributes"
})
public class Product {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("productShipeable")
    private Boolean productShipeable;
    @JsonProperty("preOrder")
    private Boolean preOrder;
    @JsonProperty("productVirtual")
    private Boolean productVirtual;
    @JsonProperty("quantityOrderMaximum")
    private Integer quantityOrderMaximum;
    @JsonProperty("quantityOrderMinimum")
    private Integer quantityOrderMinimum;
    @JsonProperty("productIsFree")
    private Boolean productIsFree;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("visible")
    private Boolean visible;
    @JsonProperty("productSpecifications")
    private ProductSpecifications productSpecifications;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("ratingCount")
    private Integer ratingCount;
    @JsonProperty("sortOrder")
    private Integer sortOrder;
    @JsonProperty("dateAvailable")
    private String dateAvailable;
    @JsonProperty("dateOfNotAvailable")
    private String dateOfNotAvailable;
    @JsonProperty("refSku")
    private Object refSku;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("rentalDuration")
    private Integer rentalDuration;
    @JsonProperty("rentalPeriod")
    private Integer rentalPeriod;
    @JsonProperty("rentalStatus")
    private Object rentalStatus;
    @JsonProperty("bargain")
    private String bargain;
    @JsonProperty("sellItFaster")
    private String sellItFaster;
    @JsonProperty("description")
    private Description description;
    @JsonProperty("finalPrice")
    private String finalPrice;
    @JsonProperty("originalPrice")
    private String originalPrice;
    @JsonProperty("discounted")
    private Boolean discounted;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("images")
    private List<Image_> images = null;
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("canBePurchased")
    private Boolean canBePurchased;
    @JsonProperty("owner")
    private Object owner;
    @JsonProperty("productUserDetail")
    private ProductUserDetail productUserDetail;
    @JsonProperty("attributes")
    private List<Attribute> attributes = null;
    @JsonProperty("subTotal")
    private Double subTotal;
    @JsonProperty("displaySubTotal")
    private String displaySubTotal;
    @JsonProperty("cartItemattributes")
    private List<CartItemattribute> cartItemattributes = null;
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

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("productShipeable")
    public Boolean getProductShipeable() {
        return productShipeable;
    }

    @JsonProperty("productShipeable")
    public void setProductShipeable(Boolean productShipeable) {
        this.productShipeable = productShipeable;
    }

    @JsonProperty("preOrder")
    public Boolean getPreOrder() {
        return preOrder;
    }

    @JsonProperty("preOrder")
    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    @JsonProperty("productVirtual")
    public Boolean getProductVirtual() {
        return productVirtual;
    }

    @JsonProperty("productVirtual")
    public void setProductVirtual(Boolean productVirtual) {
        this.productVirtual = productVirtual;
    }

    @JsonProperty("quantityOrderMaximum")
    public Integer getQuantityOrderMaximum() {
        return quantityOrderMaximum;
    }

    @JsonProperty("quantityOrderMaximum")
    public void setQuantityOrderMaximum(Integer quantityOrderMaximum) {
        this.quantityOrderMaximum = quantityOrderMaximum;
    }

    @JsonProperty("quantityOrderMinimum")
    public Integer getQuantityOrderMinimum() {
        return quantityOrderMinimum;
    }

    @JsonProperty("quantityOrderMinimum")
    public void setQuantityOrderMinimum(Integer quantityOrderMinimum) {
        this.quantityOrderMinimum = quantityOrderMinimum;
    }

    @JsonProperty("productIsFree")
    public Boolean getProductIsFree() {
        return productIsFree;
    }

    @JsonProperty("productIsFree")
    public void setProductIsFree(Boolean productIsFree) {
        this.productIsFree = productIsFree;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @JsonProperty("productSpecifications")
    public ProductSpecifications getProductSpecifications() {
        return productSpecifications;
    }

    @JsonProperty("productSpecifications")
    public void setProductSpecifications(ProductSpecifications productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @JsonProperty("ratingCount")
    public Integer getRatingCount() {
        return ratingCount;
    }

    @JsonProperty("ratingCount")
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    @JsonProperty("sortOrder")
    public Integer getSortOrder() {
        return sortOrder;
    }

    @JsonProperty("sortOrder")
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @JsonProperty("dateAvailable")
    public String getDateAvailable() {
        return dateAvailable;
    }

    @JsonProperty("dateAvailable")
    public void setDateAvailable(String dateAvailable) {
        this.dateAvailable = dateAvailable;
    }

    @JsonProperty("dateOfNotAvailable")
    public String getDateOfNotAvailable() {
        return dateOfNotAvailable;
    }

    @JsonProperty("dateOfNotAvailable")
    public void setDateOfNotAvailable(String dateOfNotAvailable) {
        this.dateOfNotAvailable = dateOfNotAvailable;
    }

    @JsonProperty("refSku")
    public Object getRefSku() {
        return refSku;
    }

    @JsonProperty("refSku")
    public void setRefSku(Object refSku) {
        this.refSku = refSku;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("rentalDuration")
    public Integer getRentalDuration() {
        return rentalDuration;
    }

    @JsonProperty("rentalDuration")
    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @JsonProperty("rentalPeriod")
    public Integer getRentalPeriod() {
        return rentalPeriod;
    }

    @JsonProperty("rentalPeriod")
    public void setRentalPeriod(Integer rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    @JsonProperty("rentalStatus")
    public Object getRentalStatus() {
        return rentalStatus;
    }

    @JsonProperty("rentalStatus")
    public void setRentalStatus(Object rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    @JsonProperty("bargain")
    public String getBargain() {
        return bargain;
    }

    @JsonProperty("bargain")
    public void setBargain(String bargain) {
        this.bargain = bargain;
    }

    @JsonProperty("sellItFaster")
    public String getSellItFaster() {
        return sellItFaster;
    }

    @JsonProperty("sellItFaster")
    public void setSellItFaster(String sellItFaster) {
        this.sellItFaster = sellItFaster;
    }

    @JsonProperty("description")
    public Description getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    @JsonProperty("finalPrice")
    public String getFinalPrice() {
        return finalPrice;
    }

    @JsonProperty("finalPrice")
    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    @JsonProperty("originalPrice")
    public String getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("originalPrice")
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("discounted")
    public Boolean getDiscounted() {
        return discounted;
    }

    @JsonProperty("discounted")
    public void setDiscounted(Boolean discounted) {
        this.discounted = discounted;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("images")
    public List<Image_> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image_> images) {
        this.images = images;
    }

    @JsonProperty("manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("canBePurchased")
    public Boolean getCanBePurchased() {
        return canBePurchased;
    }

    @JsonProperty("canBePurchased")
    public void setCanBePurchased(Boolean canBePurchased) {
        this.canBePurchased = canBePurchased;
    }

    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    @JsonProperty("productUserDetail")
    public ProductUserDetail getProductUserDetail() {
        return productUserDetail;
    }

    @JsonProperty("productUserDetail")
    public void setProductUserDetail(ProductUserDetail productUserDetail) {
        this.productUserDetail = productUserDetail;
    }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("subTotal")
    public Double getSubTotal() {
        return subTotal;
    }

    @JsonProperty("subTotal")
    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    @JsonProperty("displaySubTotal")
    public String getDisplaySubTotal() {
        return displaySubTotal;
    }

    @JsonProperty("displaySubTotal")
    public void setDisplaySubTotal(String displaySubTotal) {
        this.displaySubTotal = displaySubTotal;
    }

    @JsonProperty("cartItemattributes")
    public List<CartItemattribute> getCartItemattributes() {
        return cartItemattributes;
    }

    @JsonProperty("cartItemattributes")
    public void setCartItemattributes(List<CartItemattribute> cartItemattributes) {
        this.cartItemattributes = cartItemattributes;
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
