package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

// Updated DataToMetadataConverter class implementing MetadataConverter
public class DataToMetadataConverter implements MetadataConverter {

    @Override
    public List<Metadata> convertToMetadata(String[] headers) {
        List<Metadata> metadataList = new ArrayList<>();
        for (String header : headers) {
            metadataList.add(new Metadata(header, "String")); // Default type: String
        }
        return metadataList;
    }

    @Override
    public String metadataToFormattedString(List<Metadata> metadataList) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(metadataList); // Converts metadata to JSON format
    }
}
