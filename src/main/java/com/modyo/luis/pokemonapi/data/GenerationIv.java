
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
 * The generation-iv schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})
public class GenerationIv {

    /**
     * The diamond-pearl schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("diamond-pearl")
    private DiamondPearl diamondPearl;
    /**
     * The heartgold-soulsilver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("heartgold-soulsilver")
    private HeartgoldSoulsilver heartgoldSoulsilver;
    /**
     * The platinum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("platinum")
    private Platinum platinum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The diamond-pearl schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("diamond-pearl")
    public DiamondPearl getDiamondPearl() {
        return diamondPearl;
    }

    /**
     * The diamond-pearl schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("diamond-pearl")
    public void setDiamondPearl(DiamondPearl diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    /**
     * The heartgold-soulsilver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    /**
     * The heartgold-soulsilver schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("heartgold-soulsilver")
    public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    /**
     * The platinum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("platinum")
    public Platinum getPlatinum() {
        return platinum;
    }

    /**
     * The platinum schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("platinum")
    public void setPlatinum(Platinum platinum) {
        this.platinum = platinum;
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
