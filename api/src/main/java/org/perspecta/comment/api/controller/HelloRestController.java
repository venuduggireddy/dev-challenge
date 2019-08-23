/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perspecta.comment.api.controller;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 500540
 */
@RestController
@RequestMapping("/home")
public class HelloRestController {

    @CrossOrigin
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity redirect() throws URISyntaxException {
        URI spa = new URI("http://localhost:62302/?auth=123123");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(spa);
        httpHeaders.add("MY-JWT-HEADER", "TESTING REDIRECT");
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }
}
