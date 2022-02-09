package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Datum {
    private List<Brand> brand;

    @JsonProperty("Brand")
    public List<Brand> getBrand() { return brand; }
    @JsonProperty("Brand")
    public void setBrand(List<Brand> value) { this.brand = value; }
}
