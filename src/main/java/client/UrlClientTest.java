package client;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.di.toolkit.HttpClientUtil;
import com.di.toolkit.HttpURLConnectionUtil;

/**
 * @author di
 */
public class UrlClientTest {
	@Test
	public void test() {
		test1();
		// test2();
	}

	public void test1() {
		Map<String, Object> params = new HashMap<>();
		params.put("name", "annes");
		params.put("file", "C:/Users/Administrator/Desktop/QQ图片20161205133215.jpg");
		System.err.println(HttpURLConnectionUtil.postMultipart("http://localhost:8080/hello.json", params));
//		System.err.println(HttpURLConnectionUtil.post("http://localhost:8080/hello.json", params));
	}

	public void test2() {
		HashMap<String, String> params = new HashMap<>();
		params.put("name", "anne");
		System.err.println(HttpClientUtil.postForm("http://localhost:8090/hi.htm", params));
	}
}
