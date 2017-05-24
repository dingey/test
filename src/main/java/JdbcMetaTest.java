import java.sql.SQLException;

import org.junit.Test;

import com.di.toolkit.JdbcMetaUtil;
import com.di.toolkit.JdbcMetaUtil.Table;

/**
* @author di
*/
public class JdbcMetaTest {
	@Test
	public void test() throws SQLException{
		Table table = JdbcMetaUtil.getTable("person_1");
	}
}
