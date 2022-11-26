package classes;

import java.util.regex.Pattern;

public class MacAddress {
    private final String mac;

    public MacAddress(String allFormatsMac) {
        mac = allFormatsMac;
    }


    public boolean isCorrect() {
        if (mac == null) {
            return false;
        }
        Pattern normalizedPattern = Pattern.compile("^[0-9a-fA-F]{12}$");
        return normalizedPattern
                .matcher(normalizedMac())
                .matches();
    }

    public String ciscoFormat() {
        checkMacIsCorrect();
        return new StringBuilder(normalizedMac())
                .insert(4, '.')
                .insert(9, '.')
                .toString()
                .toLowerCase();
    }


    public String linuxFormat() {
        checkMacIsCorrect();
        return new StringBuilder(normalizedMac())
                .insert(2, ':')
                .insert(5, ':')
                .insert(8, ":")
                .insert(11, ":")
                .insert(14, ":")
                .toString();
    }


    public String dlinkFormat() {
        checkMacIsCorrect();
        return new StringBuilder(normalizedMac())
                .insert(2, '-')
                .insert(5, '-')
                .insert(8, "-")
                .insert(11, "-")
                .insert(14, "-")
                .toString();
    }


    public String rawFormat() {
        checkMacIsCorrect();
        return normalizedMac();
    }

    private  String normalizedMac() {
        return mac.replaceAll("[.:-]", "")
                .trim()
                .toUpperCase();
    }

    private void checkMacIsCorrect() {
        if (!isCorrect()) {
            throw new IllegalStateException("Mac isn't correct!");
        }
    }
}
