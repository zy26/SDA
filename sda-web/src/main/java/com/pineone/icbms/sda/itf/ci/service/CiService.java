package com.pineone.icbms.sda.itf.ci.service;

import java.util.List;
import java.util.Map;

import com.pineone.icbms.sda.itf.ci.dto.CiDTO;
import com.pineone.icbms.sda.itf.cm.dto.CmDTO;

public interface CiService {

//	List<Map<String, Object>> selectList(Map<String, Object> map) throws Exception;
	String selectOne(String idx) throws Exception;
	int insert(Map<String, Object> map) throws Exception;
	int update(String ciid) throws Exception;
	int update(CiDTO[] ciDTO) throws Exception;
	int update(Map<String, Object> map) throws Exception;
	int delete(Map<String, Object> map) throws Exception;
	int delete(CiDTO[] ciDTO) throws Exception;
	List<CiDTO> selectList(Map<String, Object> commandMap) throws Exception;
	public CiDTO selectOne(Map<String, Object> commandMap) throws Exception;
	int checkId(String ciid) throws Exception;

}
