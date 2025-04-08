package com.entity.model;

import com.entity.ZuopinjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作品集
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuopinjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 团队
     */
    private Integer tuanduiId;


    /**
     * 作品名称
     */
    private String zuopinjiName;


    /**
     * 作品图片
     */
    private String zuopinjiPhoto;


    /**
     * 作品类型
     */
    private Integer zuopinjiTypes;


    /**
     * 指导教师
     */
    private String zuopinjiZhidaojiaoshi;


    /**
     * 参加成员
     */
    private String zuopinjiChengyuan;


    /**
     * 详情
     */
    private String zuopinjiText;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：团队
	 */
    public Integer getTuanduiId() {
        return tuanduiId;
    }


    /**
	 * 设置：团队
	 */
    public void setTuanduiId(Integer tuanduiId) {
        this.tuanduiId = tuanduiId;
    }
    /**
	 * 获取：作品名称
	 */
    public String getZuopinjiName() {
        return zuopinjiName;
    }


    /**
	 * 设置：作品名称
	 */
    public void setZuopinjiName(String zuopinjiName) {
        this.zuopinjiName = zuopinjiName;
    }
    /**
	 * 获取：作品图片
	 */
    public String getZuopinjiPhoto() {
        return zuopinjiPhoto;
    }


    /**
	 * 设置：作品图片
	 */
    public void setZuopinjiPhoto(String zuopinjiPhoto) {
        this.zuopinjiPhoto = zuopinjiPhoto;
    }
    /**
	 * 获取：作品类型
	 */
    public Integer getZuopinjiTypes() {
        return zuopinjiTypes;
    }


    /**
	 * 设置：作品类型
	 */
    public void setZuopinjiTypes(Integer zuopinjiTypes) {
        this.zuopinjiTypes = zuopinjiTypes;
    }
    /**
	 * 获取：指导教师
	 */
    public String getZuopinjiZhidaojiaoshi() {
        return zuopinjiZhidaojiaoshi;
    }


    /**
	 * 设置：指导教师
	 */
    public void setZuopinjiZhidaojiaoshi(String zuopinjiZhidaojiaoshi) {
        this.zuopinjiZhidaojiaoshi = zuopinjiZhidaojiaoshi;
    }
    /**
	 * 获取：参加成员
	 */
    public String getZuopinjiChengyuan() {
        return zuopinjiChengyuan;
    }


    /**
	 * 设置：参加成员
	 */
    public void setZuopinjiChengyuan(String zuopinjiChengyuan) {
        this.zuopinjiChengyuan = zuopinjiChengyuan;
    }
    /**
	 * 获取：详情
	 */
    public String getZuopinjiText() {
        return zuopinjiText;
    }


    /**
	 * 设置：详情
	 */
    public void setZuopinjiText(String zuopinjiText) {
        this.zuopinjiText = zuopinjiText;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
