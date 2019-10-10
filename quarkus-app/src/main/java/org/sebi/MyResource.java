package org.sebi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class MyResource {

    @GET
    public String hello(){
        return "hello";
    }
}