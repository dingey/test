package wx;

import com.di.toolkit.data.annotation.Alias;

/**
 * @author di create by toolkit
 */
@Alias(xml = "Doc")
public class AutoReplyRole {
	@Alias("keyword_autoreply_info")
	private KeywordAutoreplyInfo keywordAutoreplyInfo;

	public KeywordAutoreplyInfo getKeywordAutoreplyInfo() {
		return keywordAutoreplyInfo;
	}

	public void setKeywordAutoreplyInfo(KeywordAutoreplyInfo keywordAutoreplyInfo) {
		this.keywordAutoreplyInfo = keywordAutoreplyInfo;
	}

	@Alias("keywordAutoreplyInfo")
	public static class KeywordAutoreplyInfo {
		private java.util.List<Listo> list;

		public java.util.List<Listo> getListo() {
			return list;
		}

		public void setListo(java.util.List<Listo> list) {
			this.list = list;
		}

		@Alias("info")
		public static class Listo {
			@Alias("rule_name")
			private String ruleName;

			public String getRuleName() {
				return ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}
}
