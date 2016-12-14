package pojo;

import java.util.List;

/**
 * @author dinglinbo
 * @date 2016Äê12ÔÂ9ÈÕ
 * @since 1.0.0
 */
public class Boat {
	private int id;
	private Man man;
	private Female female;
	private List<Child> childs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Female getFemale() {
		return female;
	}

	public void setFemale(Female female) {
		this.female = female;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

}
