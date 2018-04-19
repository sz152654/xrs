package com.stone.cloud.codegenerate.service;


import java.util.List;
import java.util.Map;

import com.stone.cloud.codegenerate.entity.CodeConfigEntity;



/**
 * 代码自动生成配置
 * 
 * @author shizhen
 * @email shizhen@wulingd.com
 * @date 2018-01-29 19:50:45
 */
public interface CodeConfigService {
	
	CodeConfigEntity queryObject(Long id);
	
	List<CodeConfigEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CodeConfigEntity codeConfig);
	
	void update(CodeConfigEntity codeConfig);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
