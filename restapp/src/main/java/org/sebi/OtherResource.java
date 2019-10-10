package org.sebi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/other")
public class OtherResource {

    @GET
    public String other(){
        return "other";
    }
}
