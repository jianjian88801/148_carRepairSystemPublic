package com.entity.model;

import com.entity.QichexiulitaizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 汽车修理台账
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-16 22:17:14
 */
public class QichexiulitaizhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆名称
	 */
	
	private String cheliangmingcheng;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 维修项目
	 */
	
	private String weixiuxiangmu;
		
	/**
	 * 零件
	 */
	
	private String lingjian;
		
	/**
	 * 维修总额
	 */
	
	private Integer weixiuzonge;
		
	/**
	 * 零件费
	 */
	
	private Integer lingjianfei;
		
	/**
	 * 总计
	 */
	
	private Integer zongji;
		
	/**
	 * 维修账号
	 */
	
	private String weixiuzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：零件
	 */
	 
	public void setLingjian(String lingjian) {
		this.lingjian = lingjian;
	}
	
	/**
	 * 获取：零件
	 */
	public String getLingjian() {
		return lingjian;
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
	 * 设置：零件费
	 */
	 
	public void setLingjianfei(Integer lingjianfei) {
		this.lingjianfei = lingjianfei;
	}
	
	/**
	 * 获取：零件费
	 */
	public Integer getLingjianfei() {
		return lingjianfei;
	}
				
	
	/**
	 * 设置：总计
	 */
	 
	public void setZongji(Integer zongji) {
		this.zongji = zongji;
	}
	
	/**
	 * 获取：总计
	 */
	public Integer getZongji() {
		return zongji;
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
			
}
