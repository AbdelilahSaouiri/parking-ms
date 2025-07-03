package net.ensah.parkingms;

import org.springframework.boot.SpringApplication;

public class TestParkingMsApplication {

    public static void main(String[] args) {
        SpringApplication.from(ParkingMsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
