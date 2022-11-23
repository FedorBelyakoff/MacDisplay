package annotations;

import classes.MacAddress;

import javax.crypto.Mac;


public interface ManufacturerRequest {
    String manufacturer(MacAddress mac);
}
