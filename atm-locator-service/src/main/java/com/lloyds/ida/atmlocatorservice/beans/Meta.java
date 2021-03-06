package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class Meta {
    private Date lastUpdated;
    private long totalResults;
    private String agreement;
    private String license;
    private String termsOfUse;

    @JsonProperty("LastUpdated")
    public Date getLastUpdated() { return lastUpdated; }
    @JsonProperty("LastUpdated")
    public void setLastUpdated(Date value) { this.lastUpdated = value; }

    @JsonProperty("TotalResults")
    public long getTotalResults() { return totalResults; }
    @JsonProperty("TotalResults")
    public void setTotalResults(long value) { this.totalResults = value; }

    @JsonProperty("Agreement")
    public String getAgreement() { return agreement; }
    @JsonProperty("Agreement")
    public void setAgreement(String value) { this.agreement = value; }

    @JsonProperty("License")
    public String getLicense() { return license; }
    @JsonProperty("License")
    public void setLicense(String value) { this.license = value; }

    @JsonProperty("TermsOfUse")
    public String getTermsOfUse() { return termsOfUse; }
    @JsonProperty("TermsOfUse")
    public void setTermsOfUse(String value) { this.termsOfUse = value; }
}
