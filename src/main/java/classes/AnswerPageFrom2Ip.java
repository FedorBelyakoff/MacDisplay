package classes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.util.NoSuchElementException;

public class AnswerPageFrom2Ip {

    private final String requestPageAddress;

    public AnswerPageFrom2Ip(String  requestPageAddress) {
        this.requestPageAddress = requestPageAddress;
    }

    public String manufacturer(MacAddress mac) throws IOException {
        Document answer = Jsoup.connect(requestPageAddress)
                .header("User-Agent",
                        "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:106.0) Gecko/20100101 Firefox/106.0")
                .header("accept", "application/json")
                .data("accept", mac.rawFormat())
                .post();
        Element resultContainer = answer.body().getElementById("resultcontainer");
        if (resultContainer == null) {
            throw new NoSuchElementException("Didn't find mac!");
        }

        Elements td = resultContainer.getElementsByTag("td");
        return td.get(0).data();
    }
}
