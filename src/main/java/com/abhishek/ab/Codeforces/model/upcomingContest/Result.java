package com.abhishek.ab.Codeforces.model.upcomingContest;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "type",
        "phase",
        "frozen",
        "durationSeconds",
        "startTimeSeconds",
        "relativeTimeSeconds"
})
public class Result {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("phase")
    private String phase;
    @JsonProperty("frozen")
    private Boolean frozen;
    @JsonProperty("durationSeconds")
    private Integer durationSeconds;
    @JsonProperty("startTimeSeconds")
    private Integer startTimeSeconds;
    @JsonProperty("relativeTimeSeconds")
    private Integer relativeTimeSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @JsonProperty("frozen")
    public Boolean getFrozen() {
        return frozen;
    }

    @JsonProperty("frozen")
    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    @JsonProperty("durationSeconds")
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    @JsonProperty("durationSeconds")
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    @JsonProperty("startTimeSeconds")
    public Integer getStartTimeSeconds() {
        return startTimeSeconds;
    }

    @JsonProperty("startTimeSeconds")
    public void setStartTimeSeconds(Integer startTimeSeconds) {
        this.startTimeSeconds = startTimeSeconds;
    }

    @JsonProperty("relativeTimeSeconds")
    public Integer getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    @JsonProperty("relativeTimeSeconds")
    public void setRelativeTimeSeconds(Integer relativeTimeSeconds) {
        this.relativeTimeSeconds = relativeTimeSeconds;
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
