package classes;

import annotations.ManufacturerRequest;
import com.google.common.base.Charsets;
import jdk.internal.net.http.RequestPublishers;
import jdk.internal.net.http.ResponseBodyHandlers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class RequestFrom2ip implements ManufacturerRequest {

    private final URI url2Ip;

    public RequestFrom2ip(URI url2Ip) {
        this.url2Ip = url2Ip;
    }


    public String pageStr(MacAddress mac) {
        RequestPublishers.StringPublisher publisher = new RequestPublishers
                .StringPublisher(mac.rawFormat(), Charsets.UTF_8);
        HttpRequest request = HttpRequest.newBuilder(url2Ip)
                .POST(publisher)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient()
                    .send(request, BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}
