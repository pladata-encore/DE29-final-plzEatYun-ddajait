package com.web.ddajait.model.dto.CertificateInfo.Elibility;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElibilityJsonWrapper {
    @JsonProperty("standard")
    private List<ElibilityStandard> standard = null;

    @JsonProperty("Simplestandard")
    private String Simplestandard;

}
