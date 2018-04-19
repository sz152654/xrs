package com.stone.cloud.codegenerate.entity;

/**
 * 列的属性
 * 
 * @author shizhen
 * @email shizhen@wulingd.com
 * @date 2018年01月28日 上午12:01:45
 */
public class CodeConfigEntity {
	private Long id;
	private String mainPath;
	private String packageName;
	private String moduleName;
	private String author;
	private String email;
	private String tablePrefix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMainPath() {
		return mainPath;
	}

	public void setMainPath(String mainPath) {
		this.mainPath = mainPath;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTablePrefix() {
		return tablePrefix;
	}

	public void setTablePrefix(String tablePrefix) {
		this.tablePrefix = tablePrefix;
	}

}
