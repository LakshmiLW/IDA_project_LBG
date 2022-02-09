package com.lloyds.ida.atmlocatorservice.beans;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Country {
    GB;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GB: return "GB";
        }
        return null;
    }

    @JsonCreator
    public static Country forValue(String value) throws IOException {
        if (value.equals("GB")) return GB;
        throw new IOException("Cannot deserialize Country");
    }
}
