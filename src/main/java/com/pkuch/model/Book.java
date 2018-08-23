package com.pkuch.model;

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
        "cat",
        "name",
        "author",
        "series_t",
        "sequence_i",
        "genre_s",
        "inStock",
        "price",
        "pages_i"
})
public class Book {

    @JsonProperty("id")
    private String id;
    @JsonProperty("cat")
    private List<String> cat = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("author")
    private String author;
    @JsonProperty("series_t")
    private String seriesT;
    @JsonProperty("sequence_i")
    private Integer sequenceI;
    @JsonProperty("genre_s")
    private String genreS;
    @JsonProperty("inStock")
    private Boolean inStock;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("pages_i")
    private Integer pagesI;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("cat")
    public List<String> getCat() {
        return cat;
    }

    @JsonProperty("cat")
    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("series_t")
    public String getSeriesT() {
        return seriesT;
    }

    @JsonProperty("series_t")
    public void setSeriesT(String seriesT) {
        this.seriesT = seriesT;
    }

    @JsonProperty("sequence_i")
    public Integer getSequenceI() {
        return sequenceI;
    }

    @JsonProperty("sequence_i")
    public void setSequenceI(Integer sequenceI) {
        this.sequenceI = sequenceI;
    }

    @JsonProperty("genre_s")
    public String getGenreS() {
        return genreS;
    }

    @JsonProperty("genre_s")
    public void setGenreS(String genreS) {
        this.genreS = genreS;
    }

    @JsonProperty("inStock")
    public Boolean getInStock() {
        return inStock;
    }

    @JsonProperty("inStock")
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("pages_i")
    public Integer getPagesI() {
        return pagesI;
    }

    @JsonProperty("pages_i")
    public void setPagesI(Integer pagesI) {
        this.pagesI = pagesI;
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
