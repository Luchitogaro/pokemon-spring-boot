
package com.modyo.luis.pokemonapi.data;

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
    "count",
    "next",
    "previous",
    "results"
})
public class PokemonList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    private String next;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    private String previous;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
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
