package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

// Wrapper class for JAXB XML serialization
@XmlRootElement(name = "MetadataList")
public class MetadataWrapper {
    private List<Metadata> metadataList;

    public MetadataWrapper() {
    }

    public MetadataWrapper(List<Metadata> metadataList) {
        this.metadataList = metadataList;
    }

    @XmlElement(name = "Metadata")
    public List<Metadata> getMetadataList() {
        return metadataList;
    }

    public void setMetadataList(List<Metadata> metadataList) {
        this.metadataList = metadataList;
    }
}
