package beans;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
public class WeatherNews {

    @EJB
    WeatherFeed feed;

    @Inject
		private Event<String> event;
    @Schedule(hour = "*/6", persistent = false)
    public void send() {
			String str = feed.rss(13);
        event.fire(str);

        System.out.println("★タイマー実行");
    }
}
