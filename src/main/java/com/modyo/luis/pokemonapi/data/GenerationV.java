
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
 * The generation-v schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "black-white"
})
public class GenerationV {

    /**
     * The black-white schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("black-white")
    private BlackWhite blackWhite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The black-white schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("black-white")
    public BlackWhite getBlackWhite() {
        return blackWhite;
    }

    /**
     * The black-white schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("black-white")
    public void setBlackWhite(BlackWhite blackWhite) {
        this.blackWhite = blackWhite;
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
