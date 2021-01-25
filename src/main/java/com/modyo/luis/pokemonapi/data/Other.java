
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
 * The other schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dream_world",
    "official-artwork"
})
public class Other {

    /**
     * The dream_world schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dream_world")
    private DreamWorld dreamWorld;
    /**
     * The official-artwork schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("official-artwork")
    private OfficialArtwork officialArtwork;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The dream_world schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dream_world")
    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    /**
     * The dream_world schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dream_world")
    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    /**
     * The official-artwork schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("official-artwork")
    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    /**
     * The official-artwork schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("official-artwork")
    public void setOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
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
