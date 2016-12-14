package xml;

import java.util.List;

import com.di.toolkit.data.annotation.Alias;

/**
 * @author di
 */
@Alias(xml = "人", json = "person")
public class Person {
	private String name;
	private Attributes attributes;
	@Alias("cs")
	private List<Child> childs;
	private Wife wife;

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public static class Attributes {
		@Alias("xml:ns")
		private String ns;

		public String getNs() {
			return ns;
		}

		public void setNs(String ns) {
			this.ns = ns;
		}

	}

	public static class Child {
		private String name;
		private Integer age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

	}

	public static class Wife {
		private String name;
		private Attributes attributes;

		public Wife() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Attributes getAttributes() {
			return attributes;
		}

		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}

		public static class Attributes {
			private String nick;

			public String getNick() {
				return nick;
			}

			public void setNick(String nick) {
				this.nick = nick;
			}

		}
	}
}
