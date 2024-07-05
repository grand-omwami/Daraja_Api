package com.emtechhouse.daraja_api.Utility;

import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class HelperUtility {
    public static String toBase64String(String value) {
        byte[] data = value.getBytes(StandardCharsets.ISO_8859_1);
        return Arrays.toString(Base64Coder.encode(data));
    }
}
