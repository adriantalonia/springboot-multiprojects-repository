package com.ram.api.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles", schema = "public")
public class Role extends BaseEntity {

    private String name;
    private String description;
}
