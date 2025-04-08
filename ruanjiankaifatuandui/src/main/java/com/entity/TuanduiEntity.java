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
 * 团队信息
 *
 * @author 
 * @email
 */
@TableName("tuandui")
public class TuanduiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TuanduiEntity() {

	}

	public TuanduiEntity(T t) {
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
     * 团队名称
     */
    @TableField(value = "tuandui_name")

    private String tuanduiName;


    /**
     * 团队类型
     */
    @TableField(value = "tuandui_types")

    private Integer tuanduiTypes;


    /**
     * 团队封面
     */
    @TableField(value = "tuandui_photo")

    private String tuanduiPhoto;


    /**
     * 组织结构
     */
    @TableField(value = "tuandui_zuzhi")

    private String tuanduiZuzhi;


    /**
     * 附件
     */
    @TableField(value = "tuandui_file")

    private String tuanduiFile;


    /**
     * 加入我们
     */
    @TableField(value = "tuandui_text")

    private String tuanduiText;


    /**
     * 团队介绍
     */
    @TableField(value = "tuandui_content")

    private String tuanduiContent;


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
	 * 设置：团队名称
	 */
    public String getTuanduiName() {
        return tuanduiName;
    }
    /**
	 * 获取：团队名称
	 */

    public void setTuanduiName(String tuanduiName) {
        this.tuanduiName = tuanduiName;
    }
    /**
	 * 设置：团队类型
	 */
    public Integer getTuanduiTypes() {
        return tuanduiTypes;
    }
    /**
	 * 获取：团队类型
	 */

    public void setTuanduiTypes(Integer tuanduiTypes) {
        this.tuanduiTypes = tuanduiTypes;
    }
    /**
	 * 设置：团队封面
	 */
    public String getTuanduiPhoto() {
        return tuanduiPhoto;
    }
    /**
	 * 获取：团队封面
	 */

    public void setTuanduiPhoto(String tuanduiPhoto) {
        this.tuanduiPhoto = tuanduiPhoto;
    }
    /**
	 * 设置：组织结构
	 */
    public String getTuanduiZuzhi() {
        return tuanduiZuzhi;
    }
    /**
	 * 获取：组织结构
	 */

    public void setTuanduiZuzhi(String tuanduiZuzhi) {
        this.tuanduiZuzhi = tuanduiZuzhi;
    }
    /**
	 * 设置：附件
	 */
    public String getTuanduiFile() {
        return tuanduiFile;
    }
    /**
	 * 获取：附件
	 */

    public void setTuanduiFile(String tuanduiFile) {
        this.tuanduiFile = tuanduiFile;
    }
    /**
	 * 设置：加入我们
	 */
    public String getTuanduiText() {
        return tuanduiText;
    }
    /**
	 * 获取：加入我们
	 */

    public void setTuanduiText(String tuanduiText) {
        this.tuanduiText = tuanduiText;
    }
    /**
	 * 设置：团队介绍
	 */
    public String getTuanduiContent() {
        return tuanduiContent;
    }
    /**
	 * 获取：团队介绍
	 */

    public void setTuanduiContent(String tuanduiContent) {
        this.tuanduiContent = tuanduiContent;
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
        return "Tuandui{" +
            "id=" + id +
            ", tuanduiName=" + tuanduiName +
            ", tuanduiTypes=" + tuanduiTypes +
            ", tuanduiPhoto=" + tuanduiPhoto +
            ", tuanduiZuzhi=" + tuanduiZuzhi +
            ", tuanduiFile=" + tuanduiFile +
            ", tuanduiText=" + tuanduiText +
            ", tuanduiContent=" + tuanduiContent +
            ", createTime=" + createTime +
        "}";
    }
}
