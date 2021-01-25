
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
 * The sprites schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_female",
    "back_shiny_female",
    "back_default",
    "front_female",
    "front_shiny_female",
    "back_shiny",
    "front_default",
    "front_shiny",
    "other",
    "versions"
})
public class Sprites {

    /**
     * The back_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_female")
    private String backFemale = "";
    /**
     * The back_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny_female")
    private String backShinyFemale = "";
    /**
     * The back_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_default")
    private String backDefault = "";
    /**
     * The front_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_female")
    private String frontFemale = "";
    /**
     * The front_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale = "";
    /**
     * The back_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny")
    private String backShiny = "";
    /**
     * The front_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_default")
    private String frontDefault;
    /**
     * The front_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny")
    private String frontShiny;
    /**
     * The other schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other")
    private Other other;
    /**
     * The versions schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    private Versions versions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The back_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_female")
    public String getBackFemale() {
        return backFemale;
    }

    /**
     * The back_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_female")
    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * The back_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny_female")
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    /**
     * The back_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny_female")
    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * The back_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    /**
     * The back_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * The front_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_female")
    public String getFrontFemale() {
        return frontFemale;
    }

    /**
     * The front_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_female")
    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * The front_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny_female")
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    /**
     * The front_shiny_female schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny_female")
    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * The back_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny")
    public String getBackShiny() {
        return backShiny;
    }

    /**
     * The back_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("back_shiny")
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * The front_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    /**
     * The front_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The front_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    /**
     * The front_shiny schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("front_shiny")
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * The other schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other")
    public Other getOther() {
        return other;
    }

    /**
     * The other schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other")
    public void setOther(Other other) {
        this.other = other;
    }

    /**
     * The versions schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    public Versions getVersions() {
        return versions;
    }

    /**
     * The versions schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("versions")
    public void setVersions(Versions versions) {
        this.versions = versions;
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
