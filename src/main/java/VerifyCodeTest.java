import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.di.toolkit.VerifyCodeUtils;

/**
 * @author di
 */
public class VerifyCodeTest {
	@Test
	public void main() throws IOException {
		File dir = new File("d:/tmp/");
		int w = 200, h = 80;
		for (int i = 0; i < 1; i++) {
			String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
			File file = new File(dir, verifyCode + ".jpg");
			VerifyCodeUtils.outputImage(w, h, file, verifyCode);
		}
	}
}
