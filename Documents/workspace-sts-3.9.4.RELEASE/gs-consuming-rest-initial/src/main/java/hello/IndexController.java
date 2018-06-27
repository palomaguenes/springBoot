package hello;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{
	
	 private static final String PATH = "/error";

	    @RequestMapping(value = PATH)
	    public String error() {
	        return "Please, provide an 'id' and 'username' in the url as 'localhost:8080/balance?id=10&username=Paf'.";
	    }

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }
}


