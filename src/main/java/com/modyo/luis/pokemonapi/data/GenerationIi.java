
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
 * The generation-ii schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "crystal",
    "gold",
    "silver"
})
public class GenerationIi {

    /**
     * The crystal schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crystal")
    private Crystal crystal;
    /**
     * The gold schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gold")
    private Gold gold;
    /**
     * The silver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("silver")
    private Silver silver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The crystal schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crystal")
    public Crystal getCrystal() {
        return crystal;
    }

    /**
     * The crystal schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("crystal")
    public void setCrystal(Crystal crystal) {
        this.crystal = crystal;
    }

    /**
     * The gold schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gold")
    public Gold getGold() {
        return gold;
    }

    /**
     * The gold schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("gold")
    public void setGold(Gold gold) {
        this.gold = gold;
    }

    /**
     * The silver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("silver")
    public Silver getSilver() {
        return silver;
    }

    /**
     * The silver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("silver")
    public void setSilver(Silver silver) {
        this.silver = silver;
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
