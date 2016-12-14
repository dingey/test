package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.di.toolkit.JsonUtil;

import xml.Person;
import xml.Person.Attributes;
import xml.Person.Wife;

/**
 * @author di
 */
public class XmlTest {
	@Test
	public void test() {
		Person p = new Person();
		Attributes attributes = new Person.Attributes();
		attributes.setNs("alice");
		p.setAttributes(attributes);
		Wife w = new Person.Wife();
		w.setName("Alice");
		xml.Person.Wife.Attributes attributes2 = new Person.Wife.Attributes();
		attributes2.setNick("tom");
		w.setAttributes(attributes2);
		p.setWife(w);
//		System.out.println(JsonUtil.toJson(p));
		Map<String, String> m = new HashMap<>();
		m.put("a", "aa");
		System.out.println(JsonUtil.toJson(m));
	}
}
