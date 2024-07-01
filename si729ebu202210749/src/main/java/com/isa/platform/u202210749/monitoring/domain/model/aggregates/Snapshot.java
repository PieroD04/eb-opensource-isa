package com.isa.platform.u202210749.monitoring.domain.model.aggregates;

import com.isa.platform.u202210749.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;


@Entity
@Getter
public class Snapshot extends AuditableAbstractAggregateRoot<Snapshot> {
    @NotNull(message = "Snapshot ID is required")
    @NotBlank(message = "Snapshot ID cannot be blank")
    @Column(unique = true)
    private String snapshotId;

    @NotNull(message = "Product serial number is required")
    @NotBlank(message = "Product serial number cannot be blank")
    private String productSerialNumber;

    @NotNull(message = "Temperature is required")
    @NotBlank(message = "Temperature cannot be blank")
    private Double temperature;

    @NotNull(message = "Energy is required")
    @NotBlank(message = "Energy cannot be blank")
    private Double energy;

    private Integer leakage;
}
