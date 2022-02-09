package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;

public class Location {
    private PostalAddress postalAddress;

    @JsonProperty("PostalAddress")
    public PostalAddress getPostalAddress() { return postalAddress; }
    @JsonProperty("PostalAddress")
    public void setPostalAddress(PostalAddress value) { this.postalAddress = value; }
}
