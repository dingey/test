package json;

import java.util.List;

/**
 * @author di
 */
public class Man {
	private String name;
	private int age;
	private List<Boy> boys;

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

	public List<Boy> getBoys() {
		return boys;
	}

	public void setBoys(List<Boy> boys) {
		this.boys = boys;
	}

	public static class Boy {
		private String name;
		private int age;

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
}
