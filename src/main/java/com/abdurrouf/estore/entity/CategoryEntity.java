package com.abdurrouf.estore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToMany
    private Set<ProductEntity> productEntities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
