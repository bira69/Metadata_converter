package com.example;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.List;

public class YAMLMetadataConverter implements MetadataConverter {

    @Override
    public List<Metadata> convertToMetadata(String[] headers) {
        // Convert headers to metadata objects
        return new DataToMetadataConverter().convertToMetadata(headers);
    }

    @Override
    public String metadataToFormattedString(List<Metadata> metadataList) {
        // Use SnakeYAML to convert metadata list to YAML
        DumperOptions options = new DumperOptions();
        options.setPrettyFlow(true);
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);

        Yaml yaml = new Yaml(new Constructor(), options);
        return yaml.dump(metadataList);
    }
}
