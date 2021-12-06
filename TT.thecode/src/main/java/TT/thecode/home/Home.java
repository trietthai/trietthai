package TT.thecode.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Home {
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@Controller
	public class entercode
	{	
		@RequestMapping(value = "/code", method = RequestMethod.POST)
		public String enter(@RequestParam(value ="code") String code, RedirectAttributes error)
		{
			if(code.equals("bushi")) 
			{
				return "code.jsp";
			}
			else
			{
				error.addFlashAttribute("error", "Try again");
				return "redirect:/";
			}
		}
		
	}

}
