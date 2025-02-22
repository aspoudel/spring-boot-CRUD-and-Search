package com.example.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("category")
    private String category;

    @JsonProperty("releaseDate")
    private Date releaseDate;

    @JsonProperty("available")
    private boolean available;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty
    private String imageName;

    @JsonProperty
    private String imageType;

    @JsonProperty
    @Lob
    private byte[] imageData;

    public byte[] getImageData() {
        return this.imageData;
    }

    public void setImageName(String originalFilename) {
        this.imageName = originalFilename;
    }

    public void setImageType(String contentType) {
        this.imageType = contentType;
    }

    public void setImageData(byte[] bytes) {
        this.imageData = bytes;
    }

    public String getImageType() {
        return this.imageType;
    }

//    public void setImageName(String originalFilename) {
//    }
//
//    public void setImageData(byte[] bytes) {
//        this.imageData = bytes;
//    }
//
//    public void setImageType(String contentType) {
//    }

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", brand='" + brand + '\'' +
//                ", price=" + price +
//                ", category='" + category + '\'' +
//                ", releaseDate=" + releaseDate +
//                ", available=" + available +
//                ", quantity=" + quantity +
//                '}';
//    }
}
