package com.example;

import java.io.StringWriter;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLMetadataConverter implements MetadataConverter {

    @Override
    public List<Metadata> convertToMetadata(String[] headers) {
        // Convert headers to metadata objects
        return new DataToMetadataConverter().convertToMetadata(headers);
    }

    @Override
    public String metadataToFormattedString(List<Metadata> metadataList) throws Exception {
        // Use JAXB to convert metadata list to XML
        JAXBContext context = JAXBContext.newInstance(MetadataWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Wrap metadata list in a container class
        MetadataWrapper wrapper = new MetadataWrapper(metadataList);

        StringWriter writer = new StringWriter();
        marshaller.marshal(wrapper, writer);
        return writer.toString();
    }
}
