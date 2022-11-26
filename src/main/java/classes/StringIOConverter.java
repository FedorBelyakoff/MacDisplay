package classes;

import java.io.*;


public class StringIOConverter {
    private static final String DEFAULT_CMD_CHARSET = "IBM866";

    public void write(String text, OutputStream out) {
        try (OutputStreamWriter writer = new OutputStreamWriter(out,
                DEFAULT_CMD_CHARSET)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read(InputStream in) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(in, DEFAULT_CMD_CHARSET))) {
            return reader.lines()
                    .reduce((str1, str2) -> str1 + "\n" + str2)
                    .orElse("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
