package xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.di.toolkit.ClassCreate;
import com.di.toolkit.JsonUtil;
import com.di.toolkit.XmlUtil;

import xml.Man.WifeA;
import xml.Man.WifeA.Ch;
import xml.Person.Attributes;
import xml.Person.Child;
import xml.Person.Wife;

/**
 * @author di
 */
public class Test {
	@org.junit.Test
	public void test() {
		 serialize();
		 deserialize();
		 createFromXml();
//		createFromJson();
	}

	public void createFromXml() {
		String xml = "<man id=\"a\"><wife_a><c_l><ch><id>1</id></ch><ch><id>2</id></ch></c_l></wife_a></man>";
		ClassCreate.createFromXml(xml, "com.xml", "man");
	}

	public void createFromJson() {
		String json = "{\"wife_a\":{\"cL\":[{\"id\":\"1\"},{\"id\":\"2\"}]}}";
		ClassCreate.createFromJson(json, "", "");
	}

	public void testMan() {
		Man m = new Man();
		WifeA w = new Man.WifeA();
		List<Ch> chs = new ArrayList<>();
		Ch ch = new Ch();
		ch.setId("1");
		chs.add(ch);
		Ch ch1 = new Ch();
		ch1.setId("2");
		chs.add(ch1);
		w.setCL(chs);
		m.setWifeA(w);
		System.out.println(JsonUtil.toJson(m));
		System.out.println(XmlUtil.toXml(m));
	}

	public void serialize() {
		Person p = new Person();
		p.setName("Alice");
		Attributes atts = new Person.Attributes();
		atts.setNs("45878");
		p.setAttributes(atts);
		Wife w = new Person.Wife();
		w.setName("Alice");
		p.setWife(w);
		List<Child> cs = new ArrayList<>();
		Child c = new Child();
		cs.add(c);
		p.setChilds(cs);
		System.out.println(XmlUtil.toXml(p));
	}

	public void deserialize() {
		String xml = "<person ns=\"arj\"><name>sasd</name><wife nick=\"ali\"><name><![CDATA[<xml>alice</xml>]]></name></wife><cs><child><name>bob</name><age>16</age></child><child><name>anne</name><age>12</age></child></cs></person>";
		Map<?, ?> map = XmlUtil.toObject(xml, Map.class);
		Map<?, ?> w = (Map<?, ?>) map.get("wife");
		Map<?, ?> we = (Map<?, ?>) w.get("attributes");
		System.out.println(we.get("nick"));
		System.out.println(w.get("name"));
		Person person = XmlUtil.toObject(xml, Person.class);
		System.out.println(person.getAttributes().getNs());
		// System.out.println(xml.indexOf(XmlUtil.start, xml.indexOf("<", 2)));
		// System.out.println(xml.substring(xml.indexOf(XmlUtil.start,
		// xml.indexOf("<", 2))));
		// List<String> list = XmlUtil.split(xml);
		// for (String s : list) {
		// System.out.println(s);
		// }

	}
}
