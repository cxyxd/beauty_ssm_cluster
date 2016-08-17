package com.yingjun.ssm.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author yingjun
 * 
 *         ajax 请求的返回类型封装JSON结果
 * 
 *         主要用于bootstrap table
 */
public class BootStrapTableResult<T> implements Serializable {

	private static final long serialVersionUID = -4185151304730685014L;

	private List<T> rows;
	private int total;

	public BootStrapTableResult(List<T> data) {
		super();
		this.rows = data;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> data) {
		this.rows = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
