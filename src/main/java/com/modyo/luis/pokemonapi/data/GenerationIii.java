
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
 * The generation-iii schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
public class GenerationIii {

    /**
     * The emerald schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("emerald")
    private Emerald emerald;
    /**
     * The firered-leafgreen schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("firered-leafgreen")
    private FireredLeafgreen fireredLeafgreen;
    /**
     * The ruby-sapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ruby-sapphire")
    private RubySapphire rubySapphire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The emerald schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("emerald")
    public Emerald getEmerald() {
        return emerald;
    }

    /**
     * The emerald schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("emerald")
    public void setEmerald(Emerald emerald) {
        this.emerald = emerald;
    }

    /**
     * The firered-leafgreen schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    /**
     * The firered-leafgreen schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("firered-leafgreen")
    public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    /**
     * The ruby-sapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ruby-sapphire")
    public RubySapphire getRubySapphire() {
        return rubySapphire;
    }

    /**
     * The ruby-sapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ruby-sapphire")
    public void setRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
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
