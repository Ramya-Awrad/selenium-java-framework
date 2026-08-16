package com.framework.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonReader {

    public static Map<String, String> readJson(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(
        new File(filePath),
        new TypeReference<Map<String, String>>() {}
);
    }
}
