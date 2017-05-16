package io.mere.mortal.api;

import io.mere.mortal.api.model.SimpleResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jw
 */
@RestController
public class Hello {

    @RequestMapping(method = RequestMethod.GET, value = "/simple")
    public SimpleResponse simple(@RequestParam(value = "id", defaultValue = "foo") String id) {
        return new SimpleResponse(id, "Hello");
    }
}
