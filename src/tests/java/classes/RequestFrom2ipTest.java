package classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class RequestFrom2ipTest {

    private RequestFrom2ip request;
    private URI testUrl;
    private MacAddress mac;

    @BeforeEach
    void setUp() throws MalformedURLException, URISyntaxException {
        mac = mock(MacAddress.class);
        when(mac.rawFormat()).thenReturn("234234234");
        testUrl = new URI("https://httpbin.org/post/");
        request = new RequestFrom2ip(testUrl);
    }

    @Test
    void shouldReturnCorrectPageStrWhenTestMacPutted() {
        String  actual = request.pageStr(mac);
        assertEquals(testHttpsAnswer(), actual);
    }

    private String testHttpsAnswer() {
        return """
                {
                  "args": {},
                  "data": "",
                  "files": {},
                  "form": {},
                  "headers": {
                    "Accept": "application/json",
                    "Accept-Encoding": "gzip, deflate, br",
                    "Accept-Language": "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3",
                    "Content-Length": "0",
                    "Host": "httpbin.org",
                    "Origin": "https://httpbin.org",
                    "Referer": "https://httpbin.org/",
                    "Sec-Fetch-Dest": "empty",
                    "Sec-Fetch-Mode": "cors",
                    "Sec-Fetch-Site": "same-origin",
                    "User-Agent": "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:107.0) Gecko/20100101 Firefox/107.0",
                    "X-Amzn-Trace-Id": "Root=1-637e478b-4002dbb27f3e19bf1a819ae9"
                  },
                  "json": null,
                  "origin": "185.77.150.130",
                  "url": "https://httpbin.org/post"
                }
                """;
    }

}