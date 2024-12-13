package com.example;

import java.util.List;

/**
 * A generic interface for converting data to metadata in various formats.
 */
public interface MetadataConverter {

    /**
     * Converts raw data headers to a list of metadata objects.
     *
     * @param headers The raw data headers.
     * @return A list of metadata objects.
     */
    List<Metadata> convertToMetadata(String[] headers);

    /**
     * Converts a list of metadata objects to a specific formatted string (e.g., JSON, XML).
     *
     * @param metadataList The list of metadata objects.
     * @return A formatted string representing the metadata.
     * @throws Exception If an error occurs during conversion.
     */
    String metadataToFormattedString(List<Metadata> metadataList) throws Exception;
}
