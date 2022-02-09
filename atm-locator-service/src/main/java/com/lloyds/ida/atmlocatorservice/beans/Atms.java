package com.lloyds.ida.atmlocatorservice.beans;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Atms {

	private Meta meta;
    private List<Datum> data;

    @JsonProperty("meta")
    public Meta getMeta() { return meta; }
    @JsonProperty("meta")
    public void setMeta(Meta value) { this.meta = value; }

    @JsonProperty("data")
    public List<Datum> getData() { return data; }
    @JsonProperty("data")
    public void setData(List<Datum> value) { this.data = value; }
}
