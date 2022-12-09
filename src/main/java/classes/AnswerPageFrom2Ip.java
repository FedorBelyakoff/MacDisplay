package classes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.NoSuchElementException;

import static classes.AnswerPageFrom2Ip.RequestStatus.*;


public class AnswerPageFrom2Ip {

    private final String requestPageAddress;
    private String manufacturer;
    private RequestStatus status;
    private boolean wasRequest;


    public AnswerPageFrom2Ip(String requestPageAddress) {
        this.requestPageAddress = requestPageAddress;
    }

    public void doRequest(MacAddress mac) {
        wasRequest = true;
        Element answer = requestsBody(mac);
        Element resultContainer = answer.getElementById("resultcontainer");
        Element warning = answer.getElementsByClass("alert-warning text-center").first();

        if (resultContainer != null) {
            status = SUCCESS;
            Elements td = resultContainer.getElementsByTag("td");
            manufacturer = td.get(0).data();
        } else if (warning != null) {
            status = NOT_FINDED;
        } else {
            status = ERROR;
        }
    }


    private Element requestsBody(MacAddress mac)  {
        try {
            return Jsoup.connect(requestPageAddress)
                             .header("User-Agent",
                                              "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:106.0) Gecko/20100101 Firefox/106.0")
                             .header("accept", "application/json")
                             .data("a", "act")
                             .data("accept", mac.rawFormat())
                             .post()
                             .body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public RequestStatus requestStatus() {
        if (!wasRequest) {
            throw new IllegalStateException("A request wasn't earlier.");
        }
        return status;
    }


    public String manufacturer() {
        if (!wasRequest) {
            throw new IllegalStateException("A request wasn't earlier.");
        }
        if (SUCCESS == status) {
            return manufacturer;
        } else {
            return "";
        }
    }


    public String answerPageStr(MacAddress macAddress) {
        return requestsBody(macAddress).data();
    }

    public enum RequestStatus {
        SUCCESS, NOT_FINDED, ERROR
    }
}