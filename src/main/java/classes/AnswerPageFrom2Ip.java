package classes;

import org.jsoup.Jsoup;

import java.net.URI;

public class AnswerPageFrom2Ip {

    public AnswerPageFrom2Ip(String  requestPageAddress) {
        Jsoup.connect(requestPageAddress)
                .header()
                .header()
    }
}
