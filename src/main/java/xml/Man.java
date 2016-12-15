package xml;

import com.di.toolkit.data.annotation.Alias;

/**
 * @author di create by toolkit
 */
@Alias("man")
public class Man {
	@Alias("wife_a")
	private WifeA wifeA;

	public WifeA getWifeA() {
		return wifeA;
	}

	public void setWifeA(WifeA wifeA) {
		this.wifeA = wifeA;
	}

	@Alias("wife_a")
	public static class WifeA {
		private java.util.List<Ch> cs;

		public java.util.List<Ch> getCs() {
			return cs;
		}

		public void setCs(java.util.List<Ch> cs) {
			this.cs = cs;
		}

		@Alias("ch")
		public static class Ch {
			private String id;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}
}
