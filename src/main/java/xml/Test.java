package xml;

import java.util.List;
import java.util.Map;

import com.di.toolkit.XmlUtil;

/**
 * @author di
 */
public class Test {
	@org.junit.Test
	public void test() {
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
