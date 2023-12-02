package io.camunda.example.dto;

import io.camunda.connector.generator.java.annotation.TemplateProperty;
import io.camunda.connector.generator.java.annotation.TemplateProperty.PropertyType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record MyConnectorRequest(
    @TemplateProperty(group = "compose", type = PropertyType.Text, label = "date_debut") Date date_debut,
    @TemplateProperty(group = "compose", type = PropertyType.Text, label = "date_fin") Date date_fin,
    @TemplateProperty(group = "compose", type = PropertyType.Text, label = "type_conge") String type_conge,
    @Valid Authentication authentication) {}
