package outside;

import beans.MailSender;
import beans.WeatherFeed;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;

@RequestScoped
public class ReaderB {
	
	@EJB
	private MailSender sender;
	
	public void read(@Observes String feed){
		sender.send("10buchooo@gmail.com", "東京の天気情報", feed);
	}
}
