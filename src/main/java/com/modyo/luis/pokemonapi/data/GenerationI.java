
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
 * The generation-i schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "red-blue",
    "yellow"
})
public class GenerationI {

    /**
     * The red-blue schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("red-blue")
    private RedBlue redBlue;
    /**
     * The yellow schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("yellow")
    private Yellow yellow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The red-blue schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("red-blue")
    public RedBlue getRedBlue() {
        return redBlue;
    }

    /**
     * The red-blue schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("red-blue")
    public void setRedBlue(RedBlue redBlue) {
        this.redBlue = redBlue;
    }

    /**
     * The yellow schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("yellow")
    public Yellow getYellow() {
        return yellow;
    }

    /**
     * The yellow schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("yellow")
    public void setYellow(Yellow yellow) {
        this.yellow = yellow;
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
