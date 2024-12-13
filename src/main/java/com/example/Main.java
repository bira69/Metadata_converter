package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV headers
        String[] headers = {"Name", "Age", "Email"};
        
        try {
            // Convert CSV headers to metadata
            MetadataConverter jsonConverter = new DataToMetadataConverter(); // JSON format converter
            List<Metadata> metadataList = jsonConverter.convertToMetadata(headers);

            // Print the generated metadata
            System.out.println("Generated Metadata:");
            for (Metadata metadata : metadataList) {
                System.out.println(metadata);
            }

            // Convert metadata to JSON and print it
            String metadataJson = jsonConverter.metadataToFormattedString(metadataList);
            System.out.println("\nMetadata in JSON format:");
            System.out.println(metadataJson);

            // Convert metadata to XML and print it
            MetadataConverter xmlConverter = new XMLMetadataConverter(); // XML format converter
            String metadataXml = xmlConverter.metadataToFormattedString(metadataList);
            System.out.println("\nMetadata in XML format:");
            System.out.println(metadataXml);

            // You can also implement YAML similarly:
            // MetadataConverter yamlConverter = new YAMLMetadataConverter();
            // String metadataYaml = yamlConverter.metadataToFormattedString(metadataList);
            // System.out.println("\nMetadata in YAML format:");
            // System.out.println(metadataYaml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
