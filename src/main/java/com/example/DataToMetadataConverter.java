package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class DataToMetadataConverter {

    public List<Metadata> convertCsvToMetadata(String[] headers) {
        List<Metadata> metadataList = new ArrayList<>();

        for (String header : headers) {
            metadataList.add(new Metadata(header, "String")); // Default type: String
        }

        return metadataList;
    }

    public String metadataToJson(List<Metadata> metadataList) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(metadataList);
    }
}
