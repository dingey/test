package pojo;

import java.util.Date;

/**
 * @author dinglinbo
 * @date 2016��12��9��
 * @since 1.0.0
 */
public class Man {
	private String name;
	private int age;
	private Boolean del;
	private Date create;

	public Boolean getDel() {
		return del;
	}

	public void setDel(Boolean del) {
		this.del = del;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
