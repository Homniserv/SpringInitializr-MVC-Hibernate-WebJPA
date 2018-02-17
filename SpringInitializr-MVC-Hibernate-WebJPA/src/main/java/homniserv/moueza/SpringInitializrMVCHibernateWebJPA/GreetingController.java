package homniserv.moueza.SpringInitializrMVCHibernateWebJPA;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/** https://spring.io/guides/gs/serving-web-content/ */
@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/greeting2")
	public String greeting2(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting2";
	}

	/**
	 * http://www.baeldung.com/spring-mvc-model-model-map-model-view <BR>
	 * 3 types of RequestMapping <BR>
	 * Model<BR>
	 * ModelMap<BR>
	 * ModelAndView<BR>
	 */

	/** type 1 */
	//@GetMapping("/showViewPage")
	@GetMapping("/SpringInitializr-MVC-Hibernate-WebJPA/showViewPage")
	public String passParametersWithModel(Model model) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("spring", "mvc");
		model.addAttribute("message", "Baeldung");
		model.mergeAttributes(map);
		return "viewPage";
	}

	/** type 2 */
	@GetMapping("/printViewPage")
	public String passParametersWithModelMap(ModelMap map) {
		map.addAttribute("welcomeMessage", "welcome");
		map.addAttribute("message", "Baeldung");
		return "viewPage";
	}

	/** type 3 */
	@GetMapping("/goToViewPage")
	public ModelAndView passParametersWithModelAndView() {
		ModelAndView modelAndView = new ModelAndView("viewPage");
		modelAndView.addObject("message", "Baeldung");
		   org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
		    logger.debug("logger type 3");
		return modelAndView;
	}
}
