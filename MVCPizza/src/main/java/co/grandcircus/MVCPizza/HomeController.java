package co.grandcircus.MVCPizza;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	
	@RequestMapping("/specialty")
		public String specialty(@RequestParam String name, @RequestParam String price, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "specialty";	
		}
	
	
	@RequestMapping("/Reviews")
	public String reviews() {
		return "Reviews";
	}
	
	@RequestMapping("/results")
	public String results(@RequestParam String name, @RequestParam String subject, @RequestParam String rating, Model model) {
		model.addAttribute("subject", subject);
		model.addAttribute("rating", rating);
		model.addAttribute("name", name);
		return "results";
		
	}
	
	@RequestMapping("/custom")
	public String custom() {
		return "custom";
	}

	@RequestMapping("/customresults")
	public String customresults(@RequestParam String size, @RequestParam int toppings, @RequestParam boolean gf, @RequestParam String instructions, Model model) {
		model.addAttribute("toppings", toppings);
		model.addAttribute("size",size);
		model.addAttribute("gf", gf);
		model.addAttribute("instructions", instructions);
		double price=0;
		if(size.equalsIgnoreCase("small")){
			price = 7+toppings*.50;
		}else if(size.equalsIgnoreCase("medium")) {
			price = 10 + toppings*1;
		}else if(size.equalsIgnoreCase("large")) {
			price = 12 + toppings*1.25;
		}
		if(gf==true) {
			price+=2;	
			}
		model.addAttribute("price", price);
		return "customresults";
	}
}
