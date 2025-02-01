package pl.pawlak.pawel.codewars.kata.countipaddresses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountIPAddressesTest {

    @Test
    public void test() {
        assertEquals(CountIPAddresses.ipsBetween("1.1.1.1", "5.5.5.5"), 67372036L);
        assertEquals(CountIPAddresses.ipsBetween("10.0.0.0", "10.0.0.50"), 50L);
        assertEquals(CountIPAddresses.ipsBetween("10.0.0.10", "10.0.1.50"), 296L);
        assertEquals(CountIPAddresses.ipsBetween("0.0.0.0", "0.0.255.255"), 65535L);
    }

}
