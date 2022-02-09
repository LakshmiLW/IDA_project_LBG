package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class PostalAddress {
    private List<String> addressLine;
    private String streetName;
    private String townName;
    private List<String> countrySubDivision;
    private Country country;
    private String postCode;

    @JsonProperty("AddressLine")
    public List<String> getAddressLine() { return addressLine; }
    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> value) { this.addressLine = value; }

    @JsonProperty("StreetName")
    public String getStreetName() { return streetName; }
    @JsonProperty("StreetName")
    public void setStreetName(String value) { this.streetName = value; }

    @JsonProperty("TownName")
    public String getTownName() { return townName; }
    @JsonProperty("TownName")
    public void setTownName(String value) { this.townName = value; }

    @JsonProperty("CountrySubDivision")
    public List<String> getCountrySubDivision() { return countrySubDivision; }
    @JsonProperty("CountrySubDivision")
    public void setCountrySubDivision(List<String> value) { this.countrySubDivision = value; }

    @JsonProperty("Country")
    public Country getCountry() { return country; }
    @JsonProperty("Country")
    public void setCountry(Country value) { this.country = value; }

    @JsonProperty("PostCode")
    public String getPostCode() { return postCode; }
    @JsonProperty("PostCode")
    public void setPostCode(String value) { this.postCode = value; }
}
