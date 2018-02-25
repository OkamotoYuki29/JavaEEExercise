package beans;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class WeatherNews {
	
	@EJB
	private WeatherFeed feed;
	
	@EJB
	private MailSender sender;

	@Schedule(hour = "*/6", persistent = false)
    public void send() { 
			sender.send("10buchooo@gmail.com", "東京の天気情報", feed.rss(13));

    }
}
