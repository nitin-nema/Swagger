package com.example.Swagger.Swagger.productapi;

package com.example.productapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Schema(description = "Product Entity representing items in the e-commerce platform")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Name of the product", example = "Laptop")
    private String name;

    @Schema(description = "Description of the product", example = "A high-end gaming laptop")
    private String description;

    @Schema(description = "Price of the product", example = "1500.00")
    private double price;

    // Getters and setters...


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
