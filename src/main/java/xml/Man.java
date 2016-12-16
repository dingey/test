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
		@Alias("c_l")
		private java.util.List<Ch> cL;

		public java.util.List<Ch> getCL() {
			return cL;
		}

		public void setCL(java.util.List<Ch> cL) {
			this.cL = cL;
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