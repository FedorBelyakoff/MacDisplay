package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MacAddressTest {

    private MacAddress mac;

    @BeforeEach
    void setUp() {
        mac = new MacAddress("50-46-5D-6E-8C-20");
    }

    @Test
    void shouldReturnCorrectWhenMacWithSpacesPutted() {
        MacAddress mac = new MacAddress(" 5046.5d6e.8c20   ");
        assertTrue(mac.isCorrect());
    }

    @Test
    void shouldReturnIncorrectWhenIncorrectMacPutted() {
        MacAddress mac = new MacAddress("50:46:5D65E-8C:20");
        assertFalse(mac.isCorrect());
    }

    @Test
    void shouldReturnCorrectWhenCiscoMacPutted() {
        MacAddress mac = new MacAddress("5046.5d6e.8c20");
        assertTrue(mac.isCorrect());
    }

    @Test
    void shouldReturnCorrectWhenLinuxMacPutted() {
        MacAddress mac = new MacAddress("50:46:5D:6E:8C:20");
        assertTrue(mac.isCorrect());
    }

    @Test
    void shouldReturnCorrectWhenDlinkMacPutted() {
        MacAddress mac = new MacAddress("50-46-5D-6E-8C-20");
        assertTrue(mac.isCorrect());
    }

    @Test
    void shouldReturnCorrectWhenRawMacPutted() {
        MacAddress mac = new MacAddress("50465D6E8C20");
        assertTrue(mac.isCorrect());
    }

    @Test
    void shouldReturnLinuxFormat() {
        String actual = mac.linuxFormat();
        String expected = "50:46:5D:6E:8C:20";
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCiscoFormat() {
        String actual = mac.ciscoFormat();
        String expected = "5046.5d6e.8c20";
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnRawFormat() {
        String actual = mac.rawFormat();
        String expected = "50465D6E8C20";
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnDlinkFormat() {
        String actual = mac.dlinkFormat();
        String expected = "50-46-5D-6E-8C-20";
        assertEquals(expected, actual);
    }
}