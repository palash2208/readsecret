package com.pal.sample.readsecret.controller;

import com.pal.sample.readsecret.configuration.ReadEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    ReadEnvironmentVariable readEnvironmentVariable;

    @GetMapping("/config1")
    public String getConfig1() {
        return readEnvironmentVariable.getConfig1();
    }

    @GetMapping("/secret1")
    public String getPalEnvironment() {
        return readEnvironmentVariable.getSecret1();
    }

}
