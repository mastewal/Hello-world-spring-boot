
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/hello")
@RestController
@EnableAutoConfiguration
public class Greetor {

	 private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();
	    
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }  
}
