package com.abdurrouf.estore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "products")
public class ProductEntity {
    private long id;
    private String name;
    private String description;
    private String videoUrl;
    private double price;

    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {
        return id;
    }
    @ManyToMany
    private Set<CategoryEntity> categoryList;
}
