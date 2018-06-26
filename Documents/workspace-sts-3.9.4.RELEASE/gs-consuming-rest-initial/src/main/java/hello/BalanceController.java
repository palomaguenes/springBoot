package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BalanceController {

	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/balance")
	    public Balance balance(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Balance(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
	
}
