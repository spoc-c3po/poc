package com.Model;

public final class SessionObjectbuilder {
	private String httpsessionId;
	private String socketid ;
	private String moduleAccessed;
	private String socketCount;
	private java.util.Date date;
	private ConnectionType connType;

	public static SessionObjectbuilder builder() {
		return new SessionObjectbuilder();
	}

	public SessionObjectbuilder setHttpsessionId(String httpsessionId) {
		this.httpsessionId = httpsessionId;
		return this;
	}

	public SessionObjectbuilder setSocketid(String socketid) {
		this.socketid = socketid;
		return this;
	}

	public SessionObjectbuilder setModuleAccessed(String moduleAccessed) {
		this.moduleAccessed = moduleAccessed;
		return this;
	}

	public SessionObjectbuilder setSocketCount(String socketCount) {
		this.socketCount = socketCount;
		return this;
	}

	public SessionObjectbuilder setDate(java.util.Date date) {
		this.date = date;
		return this;
	}

	public SessionObjectbuilder setConnType(ConnectionType connType) {
		this.connType = connType;
		return this;
	}

	public SessionObjects build() {
		return new SessionObjects(httpsessionId, socketid, moduleAccessed, socketCount, date, connType);
	}
}
