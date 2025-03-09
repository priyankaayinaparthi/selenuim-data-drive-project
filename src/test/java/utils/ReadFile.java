package utils;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ReadFile {
    public Map<String, Object> readYaml(String fileName) {
        org.yaml.snakeyaml.Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);
        Map<String, Object> map = yaml.load(inputStream);
        return map;
    }
}
