package models;

import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by An on 2/9/2017.
 */
@Entity
public class Product {
    @Id
    @Constraints.Required
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "manufacturer")
    private Manufacturer manufacturer;
    @Column(name="short_description")
    private String shortDescription;
    private Integer price;
    @Column(name="information_detail")
    private String informationDetail;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;
    private String warranty;
    private String pictures;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getInformationDetail() {
        return informationDetail;
    }

    public void setInformationDetail(String informationDetail) {
        this.informationDetail = informationDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
}
