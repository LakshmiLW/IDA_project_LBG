package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Brand {
    private String brandName;
    private List<ATM> atm;

    @JsonProperty("BrandName")
    public String getBrandName() { return brandName; }
    @JsonProperty("BrandName")
    public void setBrandName(String value) { this.brandName = value; }

    @JsonProperty("ATM")
    public List<ATM> getATM() { return atm; }
    @JsonProperty("ATM")
    public void setATM(List<ATM> value) { this.atm = value; }
}
