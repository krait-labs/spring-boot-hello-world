package com.testing;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.cat.CatBase;
import com.testing.cat.CatBreed;
import com.testing.cat.CatName;
import com.testing.service.AbstractGreetingService;


/**
 * A very basic Hello World controller which returns the hostname.
 *
 * @author kim
 *
 */
@RestController
public class HelloWorldController {

    // Private inner class extending private base

    private static final Logger LOG = getLogger(HelloWorldController.class.getName());

    public static final String MESSAGE_KEY = "message";
    public static final String HOSTNAME_KEY = "hostname";
    public static final String IP_KEY = "ip";

    private final AbstractGreetingService greetingService;

    public HelloWorldController(AbstractGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, String> helloWorld() throws UnknownHostException {
        return getResponse();
    }

    private Map<String, String> getResponse() throws UnknownHostException {

        String message = greetingService.greet("World");

        CatBase breed = new CatBreed();
        breed.meow();

        CatBase name = new CatName();
        name.meow();

        String host = InetAddress.getLocalHost().getHostName();
        String ip = InetAddress.getLocalHost().getHostAddress();
        Map<String, String> response = new HashMap<>();
        response.put(MESSAGE_KEY, "Hello World!");
        response.put(HOSTNAME_KEY, host);
        response.put(IP_KEY, ip);
        LOG.info("Returning {}", response);
        return response;
    }

}
