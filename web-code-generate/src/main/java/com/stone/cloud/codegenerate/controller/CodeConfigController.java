package com.stone.cloud.codegenerate.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stone.cloud.codegenerate.entity.CodeConfigEntity;
import com.stone.cloud.codegenerate.service.CodeConfigService;
import com.stone.cloud.codegenerate.utils.PageUtils;
import com.stone.cloud.codegenerate.utils.Query;
import com.stone.cloud.codegenerate.utils.R;







/**
 * 代码自动生成配置
 * 
 * @author shizhen
 * @email shizhen@wulingd.com
 * @date 2018-01-29 19:50:45
 */
@RestController
@RequestMapping("/generator/codeconfig")
public class CodeConfigController {
	@Autowired
	private CodeConfigService codeConfigService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CodeConfigEntity> codeConfigList = codeConfigService.queryList(query);
		int total = codeConfigService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(codeConfigList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		CodeConfigEntity codeConfig = codeConfigService.queryObject(id);
		
		return R.ok().put("codeConfig", codeConfig);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody CodeConfigEntity codeConfig){
		codeConfigService.save(codeConfig);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody CodeConfigEntity codeConfig){
		codeConfigService.update(codeConfig);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Long[] ids){
		codeConfigService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
