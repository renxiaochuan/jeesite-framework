/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.salespoint.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * InnoDB free: 5120 kBEntity
 * @author 任晓川
 * @version 2018-05-02
 */
@Table(name="t_sales_points", alias="a", columns={
		@Column(name="point_id", attrName="pointId", label="网点主键", isPK=true),
		@Column(name="point_name", attrName="pointName", label="网点名称", queryType=QueryType.LIKE),
		@Column(name="point_short_name", attrName="pointShortName", label="网点简称", queryType=QueryType.LIKE),
		@Column(name="longitude", attrName="longitude", label="网点经度"),
		@Column(name="latitude", attrName="latitude", label="网点纬度"),
		@Column(name="manage_type", attrName="manageType", label="经营类别", comment="经营类别:managementType"),
		@Column(name="product_type", attrName="productType", label="主要产品类别", comment="主要产品类别:productType"),
		@Column(name="header_name", attrName="headerName", label="负责人姓名", queryType=QueryType.LIKE),
		@Column(name="header_phone", attrName="headerPhone", label="负责人电话"),
		@Column(name="opened_date", attrName="openedDate", label="网点开业时间"),
		@Column(includeEntity=DataEntity.class),
	}, orderBy="a.update_date DESC"
)
public class SalesPoints extends DataEntity<SalesPoints> {
	
	private static final long serialVersionUID = 1L;
	private String pointId;		// 网点主键
	private String pointName;		// 网点名称
	private String pointShortName;		// 网点简称
	private String longitude;		// 网点经度
	private String latitude;		// 网点纬度
	private String manageType;		// 经营类别:managementType
	private String productType;		// 主要产品类别:productType
	private String headerName;		// 负责人姓名
	private String headerPhone;		// 负责人电话
	private Date openedDate;		// 网点开业时间
	
	public SalesPoints() {
		this(null);
	}

	public SalesPoints(String id){
		super(id);
	}
	
	public String getPointId() {
		return pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
	
	@Length(min=0, max=32, message="网点名称长度不能超过 32 个字符")
	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	
	@Length(min=0, max=32, message="网点简称长度不能超过 32 个字符")
	public String getPointShortName() {
		return pointShortName;
	}

	public void setPointShortName(String pointShortName) {
		this.pointShortName = pointShortName;
	}
	
	@Length(min=0, max=32, message="网点经度长度不能超过 32 个字符")
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	@Length(min=0, max=32, message="网点纬度长度不能超过 32 个字符")
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	@Length(min=0, max=32, message="经营类别长度不能超过 32 个字符")
	public String getManageType() {
		return manageType;
	}

	public void setManageType(String manageType) {
		this.manageType = manageType;
	}
	
	@Length(min=0, max=32, message="主要产品类别长度不能超过 32 个字符")
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	@Length(min=0, max=32, message="负责人姓名长度不能超过 32 个字符")
	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	
	@Length(min=0, max=32, message="负责人电话长度不能超过 32 个字符")
	public String getHeaderPhone() {
		return headerPhone;
	}

	public void setHeaderPhone(String headerPhone) {
		this.headerPhone = headerPhone;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}
	
}