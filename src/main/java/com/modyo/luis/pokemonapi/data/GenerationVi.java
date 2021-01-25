
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
 * The generation-vi schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omegaruby-alphasapphire",
    "x-y"
})
public class GenerationVi {

    /**
     * The omegaruby-alphasapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("omegaruby-alphasapphire")
    private OmegarubyAlphasapphire omegarubyAlphasapphire;
    /**
     * The x-y schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("x-y")
    private XY xY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The omegaruby-alphasapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("omegaruby-alphasapphire")
    public OmegarubyAlphasapphire getOmegarubyAlphasapphire() {
        return omegarubyAlphasapphire;
    }

    /**
     * The omegaruby-alphasapphire schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("omegaruby-alphasapphire")
    public void setOmegarubyAlphasapphire(OmegarubyAlphasapphire omegarubyAlphasapphire) {
        this.omegarubyAlphasapphire = omegarubyAlphasapphire;
    }

    /**
     * The x-y schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("x-y")
    public XY getXY() {
        return xY;
    }

    /**
     * The x-y schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("x-y")
    public void setXY(XY xY) {
        this.xY = xY;
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
