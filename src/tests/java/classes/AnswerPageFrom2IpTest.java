package classes;

import classes.AnswerPageFrom2Ip.RequestStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static classes.AnswerPageFrom2Ip.RequestStatus.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class AnswerPageFrom2IpTest {
    private AnswerPageFrom2Ip answer;
    private AnswerPageFrom2Ip page;
    private MacAddress mac;


    @BeforeEach
    void setUp() {
        mac = mock(MacAddress.class);
        String address = "https://2ip.ua/ru/services/information-service/mac-find";
        page = new AnswerPageFrom2Ip(address);
    }


    @Test
    void shouldReturnCorrectTestPageWhenTestRequest() {
        AnswerPageFrom2Ip page = new AnswerPageFrom2Ip("https://httpbin.org/post");
        when(mac.rawFormat()).thenReturn("001201BB4ADD");
        assertEquals(test2ipAnswer(), page.answerPageStr(mac));
    }


    @Test
    void shouldReturnEmptyStringWhenIncorrectMacPutted() {
        when(mac.rawFormat()).thenReturn("aaaaaaa");
        page.doRequest(mac);
        assertEquals("", page.manufacturer());
    }


    @Test
    void shouldReturnEmptyStringWhenUnknownMacPutted() {
        when(mac.rawFormat()).thenReturn("009201BB4A00");
        page.doRequest(mac);
        assertEquals("", page.manufacturer());
    }


    @Test
    void shouldReturnCorrectManufacturerStringWhenCiscoMacPutted() {
        when(mac.rawFormat()).thenReturn("001201BB4ADD");
        page.doRequest(mac);
        assertEquals("Cisco Systems, Inc", page.manufacturer());
    }


    @Test
    void shouldReturnSuccessStatusWhenDlinkMacPutted() {
        when(mac.rawFormat()).thenReturn("001201BB4ADD");
        page.doRequest(mac);
        assertEquals(SUCCESS, page.requestStatus());
    }


    @Test
    void shouldReturnErrorStatusWhenIncorrectAddressPutted() {
        when(mac.rawFormat()).thenReturn("aaaaaaa");
        page.doRequest(mac);
        assertEquals(ERROR, page.requestStatus());
    }


    @Test
    void shouldReturnNotFindedStatusWhenUnkownMacPutted() {
        when(mac.rawFormat()).thenReturn("009201BB4A00");
        page.doRequest(mac);
        assertEquals(ERROR, page.requestStatus());
    }


    private String test2ipAnswer() {
        return """
                         {
                           "args": {},
                           "data": "",
                           "files": {},
                           "form": {
                             "a": "act",
                             "mac": "001201BB4ADD"
                           },
                           "headers": {
                             "Accept": "application/json",
                             "Content-Length": "10",
                             "Content-Type": "application/x-www-form-urlencoded",
                             "Host": "httpbin.org",
                             "User-Agent": "curl/7.85.0",
                             "X-Amzn-Trace-Id": "Root=1-63935ff9-45bdc8f26550181442cf34fc"
                           },
                           "json": null,
                           "origin": "217.79.4.44",
                           "url": "https://httpbin.org/post"
                         }
                         """;
    }
}