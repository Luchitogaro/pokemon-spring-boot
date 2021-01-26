
package com.modyo.luis.pokemonapi.data;

import java.util.HashMap;
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
    "baby_trigger_item",
    "chain",
    "id"
})
public class Evolution {

    /**
     * The baby_trigger_item schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("baby_trigger_item")
    private Object babyTriggerItem;
    /**
     * The chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain")
    private Chain chain;
    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer id = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The baby_trigger_item schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("baby_trigger_item")
    public Object getBabyTriggerItem() {
        return babyTriggerItem;
    }

    /**
     * The baby_trigger_item schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("baby_trigger_item")
    public void setBabyTriggerItem(Object babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    /**
     * The chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain")
    public Chain getChain() {
        return chain;
    }

    /**
     * The chain schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("chain")
    public void setChain(Chain chain) {
        this.chain = chain;
    }

    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * The id schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
