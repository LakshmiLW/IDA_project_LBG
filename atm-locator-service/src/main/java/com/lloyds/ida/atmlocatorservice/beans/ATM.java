package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ATM {
    private String identification;
    @Override
	public String toString() {
		return "ATM [identification=" + identification + ", supportedCurrencies=" + supportedCurrencies + ", location="
				+ location + "]";
	}
	private List<SupportedCurrency> supportedCurrencies;
    private Location location;

    @JsonProperty("Identification")
    public String getIdentification() { return identification; }
    @JsonProperty("Identification")
    public void setIdentification(String value) { this.identification = value; }

    @JsonProperty("SupportedCurrencies")
    public List<SupportedCurrency> getSupportedCurrencies() { return supportedCurrencies; }
    @JsonProperty("SupportedCurrencies")
    public void setSupportedCurrencies(List<SupportedCurrency> value) { this.supportedCurrencies = value; }

    @JsonProperty("Location")
    public Location getLocation() { return location; }
    @JsonProperty("Location")
    public void setLocation(Location value) { this.location = value; }
}
