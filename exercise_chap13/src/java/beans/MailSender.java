package beans;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import net.tkxtools.JmSender;

@Stateless
public class MailSender {

    String mail_id = "Okamoto.macho@gmail.com"; 
    String mail_pw = "secret"; 
    String from    = "Okamoto.macho@gmail.com"; 
    
    String host = "smtp.gmail.com";
    int port = 587;

    @Asynchronous
    public void send(String c_mail, String subject, String body) {
        try {
            JmSender.send(mail_id, mail_pw, host, port, c_mail, from, subject, body);
        } catch (Exception e) {
        }
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public void setMail_pw(String mail_pw) {
        this.mail_pw = mail_pw;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
