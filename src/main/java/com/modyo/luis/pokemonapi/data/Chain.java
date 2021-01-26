
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
 * The chain schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "evolution_details",
    "evolves_to",
    "is_baby",
    "species"
})
public class Chain {

    /**
     * The evolution_details schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_details")
    private List<Object> evolutionDetails = null;
    /**
     * The evolves_to schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_to")
    private List<Object> evolvesTo = null;
    /**
     * The is_baby schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    private Boolean isBaby;
    /**
     * The species schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("species")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Species species;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The evolution_details schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_details")
    public List<Object> getEvolutionDetails() {
        return evolutionDetails;
    }

    /**
     * The evolution_details schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolution_details")
    public void setEvolutionDetails(List<Object> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    /**
     * The evolves_to schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_to")
    public List<Object> getEvolvesTo() {
        return evolvesTo;
    }

    /**
     * The evolves_to schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("evolves_to")
    public void setEvolvesTo(List<Object> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    /**
     * The is_baby schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    public Boolean getIsBaby() {
        return isBaby;
    }

    /**
     * The is_baby schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_baby")
    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    /**
     * The species schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public Species getSpecies() {
        return species;
    }

    /**
     * The species schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
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
