package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            MetadataConverter converter = new DataToMetadataConverter(); // Using the interface

            // Sample CSV headers
            String[] headers = {"Name", "Age", "Email"};

            // Convert CSV headers to metadata
            List<Metadata> metadataList = converter.convertToMetadata(headers);

            // Print the generated metadata
            System.out.println("Generated Metadata:");
            for (Metadata metadata : metadataList) {
                System.out.println(metadata);
            }

            // Convert metadata to JSON and print it
            String metadataJson = converter.metadataToFormattedString(metadataList);
            System.out.println("\nMetadata in JSON format:");
            System.out.println(metadataJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
