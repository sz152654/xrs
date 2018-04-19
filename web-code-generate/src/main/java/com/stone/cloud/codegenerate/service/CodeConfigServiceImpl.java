package com.stone.cloud.codegenerate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.cloud.codegenerate.dao.CodeConfigDao;
import com.stone.cloud.codegenerate.entity.CodeConfigEntity;

import java.util.List;
import java.util.Map;




@Service("codeConfigService")
public class CodeConfigServiceImpl implements CodeConfigService {
	@Autowired
	private CodeConfigDao codeConfigDao;
	
	@Override
	public CodeConfigEntity queryObject(Long id){
		return codeConfigDao.queryObject(id);
	}
	
	@Override
	public List<CodeConfigEntity> queryList(Map<String, Object> map){
		return codeConfigDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return codeConfigDao.queryTotal(map);
	}
	
	@Override
	public void save(CodeConfigEntity codeConfig){
		codeConfigDao.save(codeConfig);
	}
	
	@Override
	public void update(CodeConfigEntity codeConfig){
		codeConfigDao.update(codeConfig);
	}
	
	@Override
	public void delete(Long id){
		codeConfigDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		codeConfigDao.deleteBatch(ids);
	}
	
}
