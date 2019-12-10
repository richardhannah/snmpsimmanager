package com.richard.snmpsimmanager.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * FooResource controller
 */
@RestController
@RequestMapping("/api/foo")
public class FooResource {

    private final Logger log = LoggerFactory.getLogger(FooResource.class);

    /**
    * GET test
    */
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/snmprec/{fileName}")
    public String getSnmpRec(@PathVariable String fileName) {

        String windowsPath = "C:\\usr\\snmpsim\\data\\public.snmprec";
        String linuxPath = "/usr/snmpsim/data/" + fileName + ".snmprec";

        try{
            return new String(
                Files.readAllBytes(Paths.get(linuxPath)));
        }
        catch (Exception ex){
            ex.printStackTrace();
            return "failed to retreive " + ex.getMessage();
        }

    }

    @PostMapping(path="/snmprec/{fileName}", consumes="text/html")
    public String postSnmpRec(@PathVariable String fileName, @RequestBody String walk) throws IOException {

        System.out.println(fileName);
        System.out.println(walk);

        String filepath = "/usr/snmpsim/data/" + fileName + ".snmprec";

        Path path = Paths.get(filepath);
        byte[] strToBytes = walk.getBytes();

        Files.write(path, strToBytes);

        return filepath + " written";

    }

}
