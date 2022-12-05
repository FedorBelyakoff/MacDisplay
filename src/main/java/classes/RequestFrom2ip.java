package classes;

import annotations.ManufacturerRequest;

import java.io.IOException;
import java.net.URI;
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
        HttpRequest.BodyPublisher publisher1 = HttpRequest.BodyPublishers.ofString(mac.rawFormat());
        HttpRequest request = HttpRequest.newBuilder(url2Ip)
                .POST(publisher1)
                .build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient()
                    .send(request, BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}
