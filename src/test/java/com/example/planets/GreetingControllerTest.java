package com.example.planets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class GreetingControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port = 8080;

    @Test
    public void indexShouldContainText() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port, String.class))
                .contains("Planets of the Solar System are:");
    }

    @Test
    public void mercuryShouldContainText() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/mercury", String.class))
                .contains("The first planet");
    }

    @Test
    public void venusShouldContainText() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/venus", String.class))
                .contains("The second planet");
    }

    @Test
    public void earthShouldContainText() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/earth", String.class))
                .contains("I'm sure you live here");
    }

    @Test
    public void marsShouldContainText() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/mars", String.class))
                .contains("It is inhabited by robots");
    }
}