package com.university.contractors.model;

import javax.persistence.*;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private Long id;

    @Column(name = "country_name_ua")
    private String countryNameUa;

    @Column(name = "country_name_eng")
    private String countryNameEng;

    @Column(name = "country_name_ru")
    private String getCountryNameRu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryNameUa() {
        return countryNameUa;
    }

    public void setCountryNameUa(String countryNameUa) {
        this.countryNameUa = countryNameUa;
    }

    public String getCountryNameEng() {
        return countryNameEng;
    }

    public void setCountryNameEng(String countryNameEng) {
        this.countryNameEng = countryNameEng;
    }

    public String getGetCountryNameRu() {
        return getCountryNameRu;
    }

    public void setGetCountryNameRu(String getCountryNameRu) {
        this.getCountryNameRu = getCountryNameRu;
    }
}
