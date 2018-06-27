package hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BalanceController {
	
	@RequestMapping(value = {"/balance"}, method = RequestMethod.GET)
	public Balance balance(@RequestParam(value="id") long id, @RequestParam(value="username") String name) {
		return new Balance(id, name);
	}
	

	
}
