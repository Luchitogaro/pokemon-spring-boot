
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
 * The versions schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "generation-i",
    "generation-ii",
    "generation-iii",
    "generation-iv",
    "generation-v",
    "generation-vi",
    "generation-vii",
    "generation-viii"
})
public class Versions {

    /**
     * The generation-i schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-i")
    private GenerationI generationI;
    /**
     * The generation-ii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-ii")
    private GenerationIi generationIi;
    /**
     * The generation-iii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iii")
    private GenerationIii generationIii;
    /**
     * The generation-iv schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iv")
    private GenerationIv generationIv;
    /**
     * The generation-v schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-v")
    private GenerationV generationV;
    /**
     * The generation-vi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vi")
    private GenerationVi generationVi;
    /**
     * The generation-vii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vii")
    private GenerationVii generationVii;
    /**
     * The generation-viii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-viii")
    private GenerationViii generationViii;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The generation-i schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-i")
    public GenerationI getGenerationI() {
        return generationI;
    }

    /**
     * The generation-i schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-i")
    public void setGenerationI(GenerationI generationI) {
        this.generationI = generationI;
    }

    /**
     * The generation-ii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-ii")
    public GenerationIi getGenerationIi() {
        return generationIi;
    }

    /**
     * The generation-ii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-ii")
    public void setGenerationIi(GenerationIi generationIi) {
        this.generationIi = generationIi;
    }

    /**
     * The generation-iii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iii")
    public GenerationIii getGenerationIii() {
        return generationIii;
    }

    /**
     * The generation-iii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iii")
    public void setGenerationIii(GenerationIii generationIii) {
        this.generationIii = generationIii;
    }

    /**
     * The generation-iv schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iv")
    public GenerationIv getGenerationIv() {
        return generationIv;
    }

    /**
     * The generation-iv schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-iv")
    public void setGenerationIv(GenerationIv generationIv) {
        this.generationIv = generationIv;
    }

    /**
     * The generation-v schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-v")
    public GenerationV getGenerationV() {
        return generationV;
    }

    /**
     * The generation-v schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-v")
    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    /**
     * The generation-vi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vi")
    public GenerationVi getGenerationVi() {
        return generationVi;
    }

    /**
     * The generation-vi schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vi")
    public void setGenerationVi(GenerationVi generationVi) {
        this.generationVi = generationVi;
    }

    /**
     * The generation-vii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vii")
    public GenerationVii getGenerationVii() {
        return generationVii;
    }

    /**
     * The generation-vii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-vii")
    public void setGenerationVii(GenerationVii generationVii) {
        this.generationVii = generationVii;
    }

    /**
     * The generation-viii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-viii")
    public GenerationViii getGenerationViii() {
        return generationViii;
    }

    /**
     * The generation-viii schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("generation-viii")
    public void setGenerationViii(GenerationViii generationViii) {
        this.generationViii = generationViii;
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
