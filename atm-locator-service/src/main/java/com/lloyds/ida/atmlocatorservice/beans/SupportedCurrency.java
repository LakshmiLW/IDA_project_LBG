package com.lloyds.ida.atmlocatorservice.beans;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SupportedCurrency {
    GBP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GBP: return "GBP";
        }
        return null;
    }

    @JsonCreator
    public static SupportedCurrency forValue(String value) throws IOException {
        if (value.equals("GBP")) return GBP;
        throw new IOException("Cannot deserialize SupportedCurrency");
    }
}
