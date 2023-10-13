package dev.zaeem.productservice.dtos;

import dev.zaeem.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
