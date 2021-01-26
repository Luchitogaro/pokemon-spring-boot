
package com.modyo.luis.pokemonapi.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The root schema
 * <p>
 * The root schema comprises the entire JSON document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_happiness",
    "capture_rate",
    "color",
    "egg_groups",
    "evolution_chain"
})
public class PokemonSpecie {

    /**
     * The base_happiness schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer baseHappiness = 0;
    /**
     * The capture_rate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer captureRate = 0;
    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Color color;
    /**
     * The egg_groups schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Object> eggGroups = null;
    /**
     * The evolution_chain schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private EvolutionChain evolutionChain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The base_happiness schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    /**
     * The base_happiness schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("base_happiness")
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    /**
     * The capture_rate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    public Integer getCaptureRate() {
        return captureRate;
    }

    /**
     * The capture_rate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("capture_rate")
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    public Color getColor() {
        return color;
    }

    /**
     * The color schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("color")
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * The egg_groups schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    public List<Object> getEggGroups() {
        return eggGroups;
    }

    /**
     * The egg_groups schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("egg_groups")
    public void setEggGroups(List<Object> eggGroups) {
        this.eggGroups = eggGroups;
    }

    /**
     * The evolution_chain schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    public EvolutionChain getEvolutionChain() {
        return evolutionChain;
    }

    /**
     * The evolution_chain schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("evolution_chain")
    public void setEvolutionChain(EvolutionChain evolutionChain) {
        this.evolutionChain = evolutionChain;
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
