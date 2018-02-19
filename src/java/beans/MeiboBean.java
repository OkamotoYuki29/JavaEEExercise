package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MeiboBean {

	private Integer number;		//番号
	private String name;			//氏名
	public void toConsole(){
		System.out.println("number="+this.number+"/ name"+this.name);
	}
	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

}
