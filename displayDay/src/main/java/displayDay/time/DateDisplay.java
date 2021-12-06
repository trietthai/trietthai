package displayDay.time;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.SimpleTimeZone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateDisplay {
	private Date getDate()
	{
		Date now = new Date();
		return now;
	}
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model display)
	{
		display.addAttribute("date", getDate());
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model display)
	{
		display.addAttribute("time", getDate());
		return "time.jsp";
	}

}
