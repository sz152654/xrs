package com.stone.cloud.codegenerate.dao;

import org.apache.ibatis.annotations.Mapper;

import com.stone.cloud.codegenerate.entity.CodeConfigEntity;



/**
 * 代码自动生成配置
 * 
 * @author shizhen
 * @email shizhen@wulingd.com
 * @date 2018-01-29 19:50:45
 */
@Mapper
public interface CodeConfigDao extends BaseDao<CodeConfigEntity> {
	CodeConfigEntity codeConfig();
}
