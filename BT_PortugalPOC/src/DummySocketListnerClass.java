import java.sql.Date;
import java.util.HashSet;

import com.Model.ConnectionType;
import com.Model.SessionObjectbuilder;
import com.Model.SessionObjects;

public class DummySocketListnerClass {

	private static HashSet<SessionObjects> connectionList = new HashSet<SessionObjects>();

	public boolean createConnection(String session, String Socket, String param) {

		SessionObjects builder = SessionObjectbuilder.builder().setConnType(ConnectionType.Connect)
				.setDate(new java.util.Date()).setHttpsessionId(session).setModuleAccessed(param).setSocketid(Socket)
				.setSocketCount("1").build();

		// return false for a duplicate entry
		boolean flag =  connectionList.add(builder);
		
		
		return true;
	}
	public void disconnect(String session, String Socket) {
		SessionObjects builder = SessionObjectbuilder.builder().setConnType(ConnectionType.Disconnect)
				.setDate(new java.util.Date()).setHttpsessionId(session).setSocketid(Socket)
				.setSocketCount("1").build();
		boolean flag =  connectionList.add(builder);

	}
	public static HashSet<SessionObjects> getConnectionList(){
		return connectionList;
	}
	public static void clearConnectionList() {
		connectionList.clear();
	}

}
