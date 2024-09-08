package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 汽车修理单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
@TableName("qichexiulidan")
public class QichexiulidanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichexiulidanEntity() {
		
	}
	
	public QichexiulidanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 修理单号
	 */
					
	private String xiulidanhao;
	
	/**
	 * 车辆名称
	 */
					
	private String cheliangmingcheng;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 维修项目
	 */
					
	private String weixiuxiangmu;
	
	/**
	 * 配件名称
	 */
					
	private String peijianmingcheng;
	
	/**
	 * 修理费
	 */
					
	private Integer xiulifei;
	
	/**
	 * 修理小时
	 */
					
	private Integer xiulixiaoshi;
	
	/**
	 * 维修总额
	 */
					
	private Integer weixiuzonge;
	
	/**
	 * 维修账号
	 */
					
	private String weixiuzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 送修日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date songxiuriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：修理单号
	 */
	public void setXiulidanhao(String xiulidanhao) {
		this.xiulidanhao = xiulidanhao;
	}
	/**
	 * 获取：修理单号
	 */
	public String getXiulidanhao() {
		return xiulidanhao;
	}
	/**
	 * 设置：车辆名称
	 */
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	/**
	 * 获取：车辆名称
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：维修项目
	 */
	public void setWeixiuxiangmu(String weixiuxiangmu) {
		this.weixiuxiangmu = weixiuxiangmu;
	}
	/**
	 * 获取：维修项目
	 */
	public String getWeixiuxiangmu() {
		return weixiuxiangmu;
	}
	/**
	 * 设置：配件名称
	 */
	public void setPeijianmingcheng(String peijianmingcheng) {
		this.peijianmingcheng = peijianmingcheng;
	}
	/**
	 * 获取：配件名称
	 */
	public String getPeijianmingcheng() {
		return peijianmingcheng;
	}
	/**
	 * 设置：修理费
	 */
	public void setXiulifei(Integer xiulifei) {
		this.xiulifei = xiulifei;
	}
	/**
	 * 获取：修理费
	 */
	public Integer getXiulifei() {
		return xiulifei;
	}
	/**
	 * 设置：修理小时
	 */
	public void setXiulixiaoshi(Integer xiulixiaoshi) {
		this.xiulixiaoshi = xiulixiaoshi;
	}
	/**
	 * 获取：修理小时
	 */
	public Integer getXiulixiaoshi() {
		return xiulixiaoshi;
	}
	/**
	 * 设置：维修总额
	 */
	public void setWeixiuzonge(Integer weixiuzonge) {
		this.weixiuzonge = weixiuzonge;
	}
	/**
	 * 获取：维修总额
	 */
	public Integer getWeixiuzonge() {
		return weixiuzonge;
	}
	/**
	 * 设置：维修账号
	 */
	public void setWeixiuzhanghao(String weixiuzhanghao) {
		this.weixiuzhanghao = weixiuzhanghao;
	}
	/**
	 * 获取：维修账号
	 */
	public String getWeixiuzhanghao() {
		return weixiuzhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：送修日期
	 */
	public void setSongxiuriqi(Date songxiuriqi) {
		this.songxiuriqi = songxiuriqi;
	}
	/**
	 * 获取：送修日期
	 */
	public Date getSongxiuriqi() {
		return songxiuriqi;
	}

}
