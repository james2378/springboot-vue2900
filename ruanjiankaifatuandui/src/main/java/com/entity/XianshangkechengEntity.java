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
 * 线上课程
 *
 * @author 
 * @email
 */
@TableName("xianshangkecheng")
public class XianshangkechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XianshangkechengEntity() {

	}

	public XianshangkechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 课程标题
     */
    @TableField(value = "xianshangkecheng_name")

    private String xianshangkechengName;


    /**
     * 课程封面
     */
    @TableField(value = "xianshangkecheng_photo")

    private String xianshangkechengPhoto;


    /**
     * 课程类型
     */
    @TableField(value = "xianshangkecheng_types")

    private Integer xianshangkechengTypes;


    /**
     * 视频
     */
    @TableField(value = "xianshangkecheng_video")

    private String xianshangkechengVideo;


    /**
     * 课程详情
     */
    @TableField(value = "xianshangkecheng_text")

    private String xianshangkechengText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程标题
	 */
    public String getXianshangkechengName() {
        return xianshangkechengName;
    }
    /**
	 * 获取：课程标题
	 */

    public void setXianshangkechengName(String xianshangkechengName) {
        this.xianshangkechengName = xianshangkechengName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getXianshangkechengPhoto() {
        return xianshangkechengPhoto;
    }
    /**
	 * 获取：课程封面
	 */

    public void setXianshangkechengPhoto(String xianshangkechengPhoto) {
        this.xianshangkechengPhoto = xianshangkechengPhoto;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getXianshangkechengTypes() {
        return xianshangkechengTypes;
    }
    /**
	 * 获取：课程类型
	 */

    public void setXianshangkechengTypes(Integer xianshangkechengTypes) {
        this.xianshangkechengTypes = xianshangkechengTypes;
    }
    /**
	 * 设置：视频
	 */
    public String getXianshangkechengVideo() {
        return xianshangkechengVideo;
    }
    /**
	 * 获取：视频
	 */

    public void setXianshangkechengVideo(String xianshangkechengVideo) {
        this.xianshangkechengVideo = xianshangkechengVideo;
    }
    /**
	 * 设置：课程详情
	 */
    public String getXianshangkechengText() {
        return xianshangkechengText;
    }
    /**
	 * 获取：课程详情
	 */

    public void setXianshangkechengText(String xianshangkechengText) {
        this.xianshangkechengText = xianshangkechengText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xianshangkecheng{" +
            "id=" + id +
            ", xianshangkechengName=" + xianshangkechengName +
            ", xianshangkechengPhoto=" + xianshangkechengPhoto +
            ", xianshangkechengTypes=" + xianshangkechengTypes +
            ", xianshangkechengVideo=" + xianshangkechengVideo +
            ", xianshangkechengText=" + xianshangkechengText +
            ", createTime=" + createTime +
        "}";
    }
}
