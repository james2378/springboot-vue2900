package com.entity.view;

import com.entity.ZuopinjiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 作品集
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuopinji")
public class ZuopinjiView extends ZuopinjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 作品类型的值
		*/
		private String zuopinjiValue;



		//级联表 tuandui
			/**
			* 团队名称
			*/
			private String tuanduiName;
			/**
			* 团队类型
			*/
			private Integer tuanduiTypes;
				/**
				* 团队类型的值
				*/
				private String tuanduiValue;
			/**
			* 团队封面
			*/
			private String tuanduiPhoto;
			/**
			* 组织结构
			*/
			private String tuanduiZuzhi;
			/**
			* 附件
			*/
			private String tuanduiFile;
			/**
			* 加入我们
			*/
			private String tuanduiText;
			/**
			* 团队介绍
			*/
			private String tuanduiContent;

	public ZuopinjiView() {

	}

	public ZuopinjiView(ZuopinjiEntity zuopinjiEntity) {
		try {
			BeanUtils.copyProperties(this, zuopinjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 作品类型的值
			*/
			public String getZuopinjiValue() {
				return zuopinjiValue;
			}
			/**
			* 设置： 作品类型的值
			*/
			public void setZuopinjiValue(String zuopinjiValue) {
				this.zuopinjiValue = zuopinjiValue;
			}










				//级联表的get和set tuandui

					/**
					* 获取： 团队名称
					*/
					public String getTuanduiName() {
						return tuanduiName;
					}
					/**
					* 设置： 团队名称
					*/
					public void setTuanduiName(String tuanduiName) {
						this.tuanduiName = tuanduiName;
					}

					/**
					* 获取： 团队类型
					*/
					public Integer getTuanduiTypes() {
						return tuanduiTypes;
					}
					/**
					* 设置： 团队类型
					*/
					public void setTuanduiTypes(Integer tuanduiTypes) {
						this.tuanduiTypes = tuanduiTypes;
					}


						/**
						* 获取： 团队类型的值
						*/
						public String getTuanduiValue() {
							return tuanduiValue;
						}
						/**
						* 设置： 团队类型的值
						*/
						public void setTuanduiValue(String tuanduiValue) {
							this.tuanduiValue = tuanduiValue;
						}

					/**
					* 获取： 团队封面
					*/
					public String getTuanduiPhoto() {
						return tuanduiPhoto;
					}
					/**
					* 设置： 团队封面
					*/
					public void setTuanduiPhoto(String tuanduiPhoto) {
						this.tuanduiPhoto = tuanduiPhoto;
					}

					/**
					* 获取： 组织结构
					*/
					public String getTuanduiZuzhi() {
						return tuanduiZuzhi;
					}
					/**
					* 设置： 组织结构
					*/
					public void setTuanduiZuzhi(String tuanduiZuzhi) {
						this.tuanduiZuzhi = tuanduiZuzhi;
					}

					/**
					* 获取： 附件
					*/
					public String getTuanduiFile() {
						return tuanduiFile;
					}
					/**
					* 设置： 附件
					*/
					public void setTuanduiFile(String tuanduiFile) {
						this.tuanduiFile = tuanduiFile;
					}

					/**
					* 获取： 加入我们
					*/
					public String getTuanduiText() {
						return tuanduiText;
					}
					/**
					* 设置： 加入我们
					*/
					public void setTuanduiText(String tuanduiText) {
						this.tuanduiText = tuanduiText;
					}

					/**
					* 获取： 团队介绍
					*/
					public String getTuanduiContent() {
						return tuanduiContent;
					}
					/**
					* 设置： 团队介绍
					*/
					public void setTuanduiContent(String tuanduiContent) {
						this.tuanduiContent = tuanduiContent;
					}












}
