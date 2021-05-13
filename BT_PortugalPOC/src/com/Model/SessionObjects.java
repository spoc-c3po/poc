package com.Model;
import java.util.List;

public class SessionObjects {

	private String httpsessionId;
	private String socketid;
	private String moduleAccessed;
	private String socketCount;
	private java.util.Date date;
	private java.util.Date dCDate;
	private ConnectionType connType;
	private List<String>Session;

	public SessionObjects(String httpsessionId, String socketid, String moduleAccessed, String socketCount,
			java.util.Date date, ConnectionType connType) {
		super();
		this.httpsessionId = httpsessionId;
		this.socketid = socketid;
		this.moduleAccessed = moduleAccessed;
		this.socketCount = socketCount;
		this.date = date;
		this.connType = connType;
	}

	// Hash code & Equals with "connType" , "httpsessionId" , "socketid"

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connType == null) ? 0 : connType.hashCode());
		result = prime * result + ((httpsessionId == null) ? 0 : httpsessionId.hashCode());
		result = prime * result + ((socketid == null) ? 0 : socketid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SessionObjects other = (SessionObjects) obj;
		if (connType != other.connType)
			return false;
		if (httpsessionId == null) {
			if (other.httpsessionId != null)
				return false;
		} else if (!httpsessionId.equals(other.httpsessionId))
			return false;
		if (socketid == null) {
			if (other.socketid != null)
				return false;
		} else if (!socketid.equals(other.socketid))
			return false;
		return true;
	}

}
