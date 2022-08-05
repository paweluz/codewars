package pl.pawlak.pawel.codewars.kata.countipaddresses;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        return ip2Number(end) - ip2Number(start);
    }

    private static long ip2Number(String ipAddress) {
        String binaryRepresentation = Arrays.stream(ipAddress.split("\\."))
                .map(Long::parseLong)
                .map(Long::toBinaryString)
                .map(elem -> String.format("%08d", Integer.parseInt(elem)))
                .collect(Collectors.joining(""));
        return Long.parseLong(binaryRepresentation, 2);
    }

    public static void main(String[] args) {
        System.out.println(CountIPAddresses.ipsBetween("0.0.0.0", "0.0.255.255"));
    }

}

