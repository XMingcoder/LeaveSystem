package com.leavesystem.service;

import java.util.List;

import com.leavesystem.model.LeaveTable;

public interface LeaveTableService {
	//增加请假单
	void addLeaveTable(LeaveTable leavetable);

	//查询所有请假单
	LeaveTable queryByName(String uname);

	//根据任务ID查询请假单
	List<LeaveTable> queryByProcessInstanceId(String ProcessInstanceId);

	LeaveTable queryById(Integer id);

	//根据模糊条件查询请假单
	List<LeaveTable> queryByStr(String leavetype, String reason);

	List<LeaveTable> queryByLikeReason(String reason);

	//修改请假单
	public void updateLeaveTable(Integer id, LeaveTable leavetable);

	//删除请假单
	void deleteLeaveTable(Integer id);

	void deleteLeaveTableByUname(String uname);

}
