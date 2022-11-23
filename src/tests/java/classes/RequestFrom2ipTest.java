package classes;

import jdk.internal.net.http.RequestPublishers;
import jdk.internal.net.http.RequestPublishers.StringPublisher;
import org.junit.jupiter.api.BeforeEach;

import java.net.http.HttpRequest;

import static org.junit.jupiter.api.Assertions.*;


class RequestFrom2ipTest {
    @BeforeEach
    void setUp() {
        StringPublisher publisher = new StringPublisher();
        HttpRequest.newBuilder().uri()
                         .POST(publisher)
                         .build();

    }
}