package json;

import java.io.IOException;
import java.util.Date;
import org.junit.Test;
import com.alibaba.fastjson.JSON;
import com.di.toolkit.JsonUtil;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsoniter.JsonIterator;

/**
 * @author di
 */
public class JsonSpeedCompareTest {
	int count = 100000;

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		String json = "{\"name\":\"Bob\",\"age\":26,\"boys\":[{\"name\":\"dade\",\"age\":8},{\"name\":\"atr\",\"age\":6},{\"name\":\"carl\",\"age\":2}]}";
		// String json = "{\"name\":\"Bob\",\"age\":26}";
		jackson(json);
		fastjson(json);
		jsonutil(json);
		 jsoniter(json);
	}

	public void jackson(String json) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		long s1 = new Date().getTime();
		for (int i = 0; i < count; i++) {
			Man man = om.readValue(json, Man.class);
		}
		long s2 = new Date().getTime();
		System.out.println("jackson : " + (s2 - s1) + " ms.");
	}

	public void fastjson(String json) {
		long s1 = new Date().getTime();
		for (int i = 0; i < count; i++) {
			Man man = JSON.parseObject(json, Man.class);
		}
		long s2 = new Date().getTime();
		System.out.println("fastjson : " + (s2 - s1) + " ms.");
	}

	public void jsonutil(String json) {
		long s1 = new Date().getTime();
		for (int i = 0; i < count; i++) {
			Man man = JsonUtil.toObject(json, Man.class);
		}
		long s2 = new Date().getTime();
		System.out.println("JsonUtil : " + (s2 - s1) + " ms.");
	}

	public void jsoniter(String json) throws IOException {
		long s1 = new Date().getTime();
		for (int i = 0; i < count; i++) {
			JsonIterator parse = JsonIterator.parse(json);
			Man man = parse.read(Man.class);
		}
		long s2 = new Date().getTime();
		System.out.println("jsoniter  : " + (s2 - s1) + " ms.");
	}
}
