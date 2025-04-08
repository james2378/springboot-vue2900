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
 * 作品集
 *
 * @author 
 * @email
 */
@TableName("zuopinji")
public class ZuopinjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuopinjiEntity() {

	}

	public ZuopinjiEntity(T t) {
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
     * 团队
     */
    @TableField(value = "tuandui_id")

    private Integer tuanduiId;


    /**
     * 作品名称
     */
    @TableField(value = "zuopinji_name")

    private String zuopinjiName;


    /**
     * 作品图片
     */
    @TableField(value = "zuopinji_photo")

    private String zuopinjiPhoto;


    /**
     * 作品类型
     */
    @TableField(value = "zuopinji_types")

    private Integer zuopinjiTypes;


    /**
     * 指导教师
     */
    @TableField(value = "zuopinji_zhidaojiaoshi")

    private String zuopinjiZhidaojiaoshi;


    /**
     * 参加成员
     */
    @TableField(value = "zuopinji_chengyuan")

    private String zuopinjiChengyuan;


    /**
     * 详情
     */
    @TableField(value = "zuopinji_text")

    private String zuopinjiText;


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
	 * 设置：团队
	 */
    public Integer getTuanduiId() {
        return tuanduiId;
    }
    /**
	 * 获取：团队
	 */

    public void setTuanduiId(Integer tuanduiId) {
        this.tuanduiId = tuanduiId;
    }
    /**
	 * 设置：作品名称
	 */
    public String getZuopinjiName() {
        return zuopinjiName;
    }
    /**
	 * 获取：作品名称
	 */

    public void setZuopinjiName(String zuopinjiName) {
        this.zuopinjiName = zuopinjiName;
    }
    /**
	 * 设置：作品图片
	 */
    public String getZuopinjiPhoto() {
        return zuopinjiPhoto;
    }
    /**
	 * 获取：作品图片
	 */

    public void setZuopinjiPhoto(String zuopinjiPhoto) {
        this.zuopinjiPhoto = zuopinjiPhoto;
    }
    /**
	 * 设置：作品类型
	 */
    public Integer getZuopinjiTypes() {
        return zuopinjiTypes;
    }
    /**
	 * 获取：作品类型
	 */

    public void setZuopinjiTypes(Integer zuopinjiTypes) {
        this.zuopinjiTypes = zuopinjiTypes;
    }
    /**
	 * 设置：指导教师
	 */
    public String getZuopinjiZhidaojiaoshi() {
        return zuopinjiZhidaojiaoshi;
    }
    /**
	 * 获取：指导教师
	 */

    public void setZuopinjiZhidaojiaoshi(String zuopinjiZhidaojiaoshi) {
        this.zuopinjiZhidaojiaoshi = zuopinjiZhidaojiaoshi;
    }
    /**
	 * 设置：参加成员
	 */
    public String getZuopinjiChengyuan() {
        return zuopinjiChengyuan;
    }
    /**
	 * 获取：参加成员
	 */

    public void setZuopinjiChengyuan(String zuopinjiChengyuan) {
        this.zuopinjiChengyuan = zuopinjiChengyuan;
    }
    /**
	 * 设置：详情
	 */
    public String getZuopinjiText() {
        return zuopinjiText;
    }
    /**
	 * 获取：详情
	 */

    public void setZuopinjiText(String zuopinjiText) {
        this.zuopinjiText = zuopinjiText;
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
        return "Zuopinji{" +
            "id=" + id +
            ", tuanduiId=" + tuanduiId +
            ", zuopinjiName=" + zuopinjiName +
            ", zuopinjiPhoto=" + zuopinjiPhoto +
            ", zuopinjiTypes=" + zuopinjiTypes +
            ", zuopinjiZhidaojiaoshi=" + zuopinjiZhidaojiaoshi +
            ", zuopinjiChengyuan=" + zuopinjiChengyuan +
            ", zuopinjiText=" + zuopinjiText +
            ", createTime=" + createTime +
        "}";
    }
}
