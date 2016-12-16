package wx;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.di.toolkit.ClassCreate;
import com.di.toolkit.JsonUtil;
import com.di.toolkit.XmlUtil;

import wx.AutoReplyRole.KeywordAutoreplyInfo;
import wx.AutoReplyRole.KeywordAutoreplyInfo.Listo;

/**
 * @author di
 */
public class WxTest {
	@Test
	public void test() {
		// json();
		ser();
	}

	public void xml() {
		String xml = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]></FromUserName><CreateTime>1348831860</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[this is a test]]></Content><MsgId>1234567890123456</MsgId></xml>";
		ClassCreate.createFromXml(xml, "", "");
	}

	public void json() {
		String json = "{\"keyword_autoreply_info\": {\"listo\":[{\"rule_name\": \"autoreply-news\" }]}}"; // "");
		ClassCreate.createFromJson(json, "", "");
	}

	public void ser() {
		AutoReplyRole r = new AutoReplyRole();
		KeywordAutoreplyInfo k = new KeywordAutoreplyInfo();
		List<Listo> ls = new ArrayList<>();
		Listo l = new Listo();
		l.setRuleName("autoreply-news");
		ls.add(l);
		k.setListo(ls);
		r.setKeywordAutoreplyInfo(k);
		System.out.println(JsonUtil.toJson(r));
		System.out.println(XmlUtil.toXml(r));
	}
}
