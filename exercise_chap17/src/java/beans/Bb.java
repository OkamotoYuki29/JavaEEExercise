package beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb {

    @EJB
    CommuteDb db;

    public String init() {
				Commute c = new Commute(Transportation.BUS, 15000, null);
				Employee e1 = new Employee("田中 宏", c);
				Employee e2 = new Employee("鈴木 一郎", c);
				List<Employee> ls = new ArrayList<>();
				ls.add(e1);
				ls.add(e2);
				c.setEmployees(ls);
				create(c);
				
				c = new Commute(Transportation.TRAM, 12000, null);
				Employee e3 = new Employee("山田 花子", c);
				Employee e4 = new Employee("中村 太郎", c);
				ls.clear();
				ls.add(e3);
				ls.add(e4);
				c.setEmployees(ls);
				create(c);
				
				c = new Commute(Transportation.CAR, 10000, null);
				Employee e5 = new Employee("佐藤 修", c);
				ls.clear();
				ls.add(e5);
				c.setEmployees(ls);
				create(c);
				
				
        return "output";

    }

    // Commuteエンティティをデータベースに登録する
    public void create(Commute c) {
        try {
            db.create(c);
        } catch (Exception e) {
        }
    }

    // 全データを取得する
    public List<Commute> getAllCommute() {
        return db.getAll();
    }
}
