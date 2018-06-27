package hello;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{
	
	 private static final String PATH = "/error";

	    @RequestMapping(value = PATH)
	    public String error() {
	        return "Please, provide 'id' and 'username' int the url.";
	    }

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }
}


