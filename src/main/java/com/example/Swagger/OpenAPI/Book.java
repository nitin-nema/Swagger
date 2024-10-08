package com.example.Swagger.OpenAPI;

package com.example.bookapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Schema(description = "Book Entity representing a book in the library")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "The unique identifier of the book", example = "1")
    private Long id;

    @Schema(description = "The title of the book", example = "The Catcher in the Rye")
    private String title;

    @Schema(description = "The author of the book", example = "J.D. Salinger")
    private String author;

    @Schema(description = "The publication year of the book", example = "1951")
    private int publicationYear;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
