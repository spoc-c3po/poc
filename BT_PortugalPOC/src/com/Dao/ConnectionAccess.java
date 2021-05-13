package com.Dao;

import java.util.List;

import com.Model.SessionObjects;

public interface ConnectionAccess {

	public void updateList(List<SessionObjects> l1);
	public void purgeDatabase(String fromDate , String toDate);

}
