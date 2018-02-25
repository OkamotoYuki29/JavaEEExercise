package outside;

import beans.WeatherFeed;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@RequestScoped
public class ReaderA {
	@Inject
	transient private Logger log;
	public void read(@Observes String feed){
		log.fine(feed);
	}
}
