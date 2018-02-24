package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb {
    //フィールド変数を作成する
	private String name;			//お名前
	private Double weight;		//体重
	private Double height;		//身長
	private String msg;				//特記事項

    public String next() {
        return "output.xhtml";
    }

    public double getBmi() {
			double bmi = weight / Math.pow(height, 2);
			return bmi;
    }

    public String getBmiMessage() {
			double bmi = getBmi();
			if(bmi < 20){
				return "やせ気味";
			} else if(bmi < 24){
				return "普通";
			} else if(bmi < 26.5){
				return "太り気味";
			} else
				return "太りすぎ";
		}
    
	// ゲッターとセッターを作成する

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
		
}
