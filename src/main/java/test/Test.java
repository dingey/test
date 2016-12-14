package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.di.toolkit.FastjsonUtil;
import com.di.toolkit.JacksonUtil;
import com.di.toolkit.JsonUtil;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Boat;
import pojo.Child;
import pojo.Man;

/**
 * @author di
 */
public class Test {
	@org.junit.Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		// jackson();
		// fast();
		my1();
		// my();
		String json = "{\"id\":1,\"man\":{\"name\":\"Bush\",\"age\":36,\"del\":true},\"childs\":[{\"name\":\"alice\"},{\"name\":\"bob\",\"age\":16}]}";
		tes(json);
		my1();
	}

	public void my1() {
		Boat b = new Boat();
		b.setId(1);
		Man m = new Man();
		m.setAge(18);
		m.setName("bob");
		m.setCreate(new Date());
		b.setMan(m);
		List<Child> cs = new ArrayList<Child>();
		Child c = new Child();
		c.setName("alen");
		c.setAge(16);
		cs.add(c);
		b.setChilds(cs);
		long s1 = new Date().getTime();
		String s = JsonUtil.toJson(b);
		long s2 = new Date().getTime();
		System.out.println("jsonutil spend : " + (s2 - s1) + " ms");
		long s3 = new Date().getTime();
		s = JacksonUtil.pojoToJson(b);
		long s4 = new Date().getTime();
		System.out.println("jackson spend : " + (s4 - s3) + " ms");
		long s5 = new Date().getTime();
		s = FastjsonUtil.toJSONString(b);
		long s6 = new Date().getTime();
		System.out.println("fastjson spend : " + (s6 - s5) + " ms");
	}

	public void my() {
		String json = "{\"id\":1,\"man\":{\"name\":\"Bush\",\"age\":36,\"del\":true},\"childs\":[{\"name\":\"alice\"},{\"name\":\"bob\",\"age\":16}]}";
		long s1 = new Date().getTime();
		Boat boat = JsonUtil.toObject(json, Boat.class);
		long s2 = new Date().getTime();
		System.out.println(boat.getChilds().get(0).getName());
		System.out.println("my spend : " + (s2 - s1) + " ms");
	}

	public void jackson() throws JsonParseException, JsonMappingException, IOException {
		String json = "{\"id\":1,\"man\":{\"name\":\"Bush\",\"age\":36,\"del\":true},\"childs\":[{\"name\":\"alice\"},{\"name\":\"bob\",\"age\":16}]}";
		long s1 = new Date().getTime();
		Boat boat = new ObjectMapper().readValue(json, Boat.class);
		long s2 = new Date().getTime();
		System.out.println("jackson spend : " + (s2 - s1) + " ms");
	}

	public void fast() {
		String json = "{\"id\":1,\"man\":{\"name\":\"Bush\",\"age\":36,\"del\":true},\"childs\":[{\"name\":\"alice\"},{\"name\":\"bob\",\"age\":16}]}";
		long s1 = new Date().getTime();
		Boat boat = FastjsonUtil.parseObject(json, Boat.class);
		long s2 = new Date().getTime();
		System.out.println("fast spend : " + (s2 - s1) + " ms");
	}

	public void tes(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		long s1 = new Date().getTime();
		@SuppressWarnings("unused")
		Map<?, ?> m = om.readValue(json, Map.class);
		long s2 = new Date().getTime();
		System.out.println("jackson :" + (s2 - s1) + " ms");
		long s3 = new Date().getTime();
		m = FastjsonUtil.parseObject(json, Map.class);
		long s4 = new Date().getTime();
		System.out.println("fast :" + (s4 - s3) + " ms");
		long s5 = new Date().getTime();
		m = JsonUtil.toObject(json, Map.class);
		long s6 = new Date().getTime();
		System.out.println("jsonutil :" + (s6 - s5) + " ms");
	}

}
