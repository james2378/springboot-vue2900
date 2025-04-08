package com.entity.view;

import com.entity.XianshangkechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 线上课程
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xianshangkecheng")
public class XianshangkechengView extends XianshangkechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String xianshangkechengValue;



	public XianshangkechengView() {

	}

	public XianshangkechengView(XianshangkechengEntity xianshangkechengEntity) {
		try {
			BeanUtils.copyProperties(this, xianshangkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课程类型的值
			*/
			public String getXianshangkechengValue() {
				return xianshangkechengValue;
			}
			/**
			* 设置： 课程类型的值
			*/
			public void setXianshangkechengValue(String xianshangkechengValue) {
				this.xianshangkechengValue = xianshangkechengValue;
			}












}
