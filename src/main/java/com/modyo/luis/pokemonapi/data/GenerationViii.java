
package com.modyo.luis.pokemonapi.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The generation-viii schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icons"
})
public class GenerationViii {

    /**
     * The icons schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("icons")
    private Icons_ icons;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The icons schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("icons")
    public Icons_ getIcons() {
        return icons;
    }

    /**
     * The icons schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("icons")
    public void setIcons(Icons_ icons) {
        this.icons = icons;
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
