
package com.modyo.luis.pokemonapi.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The root schema
 * <p>
 * The root schema comprises the entire JSON document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "base_experience",
    "height",
    "is_default",
    "order",
    "weight",
    "abilities",
    "forms",
    "game_indices",
    "held_items",
    "location_area_encounters",
    "moves",
    "species",
    "sprites",
    "stats",
    "types"
})
public class PokemonDetail {

    /**
     * The id schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id = 0;
    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name = "";
    /**
     * The base_experience schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_experience")
    private Integer baseExperience = 0;
    /**
     * The height schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    private Integer height = 0;
    /**
     * The is_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    private Boolean isDefault = false;
    /**
     * The order schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    private Integer order = 0;
    /**
     * The weight schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("weight")
    private Integer weight = 0;
    /**
     * The abilities schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("abilities")
    private List<Object> abilities = null;
    /**
     * The forms schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms")
    private List<Object> forms = null;
    /**
     * The game_indices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_indices")
    private List<Object> gameIndices = null;
    /**
     * The held_items schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("held_items")
    private List<Object> heldItems = null;
    /**
     * The location_area_encounters schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters = "";
    /**
     * The moves schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("moves")
    private List<Object> moves = null;
    /**
     * The species schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("species")
    private Species species;
    /**
     * The sprites schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sprites")
    private Sprites sprites;
    /**
     * The stats schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    private List<Object> stats = null;
    /**
     * The types schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("types")
    private List<Object> types = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The id schema
     * <p>
     * 
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The base_experience schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_experience")
    public Integer getBaseExperience() {
        return baseExperience;
    }

    /**
     * The base_experience schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_experience")
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * The height schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * The height schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The is_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The is_default schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * The order schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    /**
     * The order schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * The weight schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * The weight schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * The abilities schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("abilities")
    public List<Object> getAbilities() {
        return abilities;
    }

    /**
     * The abilities schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("abilities")
    public void setAbilities(List<Object> abilities) {
        this.abilities = abilities;
    }

    /**
     * The forms schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms")
    public List<Object> getForms() {
        return forms;
    }

    /**
     * The forms schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("forms")
    public void setForms(List<Object> forms) {
        this.forms = forms;
    }

    /**
     * The game_indices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_indices")
    public List<Object> getGameIndices() {
        return gameIndices;
    }

    /**
     * The game_indices schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_indices")
    public void setGameIndices(List<Object> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * The held_items schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("held_items")
    public List<Object> getHeldItems() {
        return heldItems;
    }

    /**
     * The held_items schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("held_items")
    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * The location_area_encounters schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location_area_encounters")
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * The location_area_encounters schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location_area_encounters")
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * The moves schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("moves")
    public List<Object> getMoves() {
        return moves;
    }

    /**
     * The moves schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("moves")
    public void setMoves(List<Object> moves) {
        this.moves = moves;
    }

    /**
     * The species schema
     * <p>
     * 
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * The sprites schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sprites")
    public Sprites getSprites() {
        return sprites;
    }

    /**
     * The sprites schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sprites")
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    /**
     * The stats schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public List<Object> getStats() {
        return stats;
    }

    /**
     * The stats schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public void setStats(List<Object> stats) {
        this.stats = stats;
    }

    /**
     * The types schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    /**
     * The types schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
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
