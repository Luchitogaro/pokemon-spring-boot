
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
 * The generation-vii schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icons",
    "ultra-sun-ultra-moon"
})
public class GenerationVii {

    /**
     * The icons schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("icons")
    private Icons icons;
    /**
     * The ultra-sun-ultra-moon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultra-sun-ultra-moon")
    private UltraSunUltraMoon ultraSunUltraMoon;
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
    public Icons getIcons() {
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
    public void setIcons(Icons icons) {
        this.icons = icons;
    }

    /**
     * The ultra-sun-ultra-moon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultra-sun-ultra-moon")
    public UltraSunUltraMoon getUltraSunUltraMoon() {
        return ultraSunUltraMoon;
    }

    /**
     * The ultra-sun-ultra-moon schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultra-sun-ultra-moon")
    public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon) {
        this.ultraSunUltraMoon = ultraSunUltraMoon;
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
