package com.entity.model;

import com.entity.TuanduiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 团队信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TuanduiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 团队名称
     */
    private String tuanduiName;


    /**
     * 团队类型
     */
    private Integer tuanduiTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：团队名称
	 */
    public String getTuanduiName() {
        return tuanduiName;
    }


    /**
	 * 设置：团队名称
	 */
    public void setTuanduiName(String tuanduiName) {
        this.tuanduiName = tuanduiName;
    }
    /**
	 * 获取：团队类型
	 */
    public Integer getTuanduiTypes() {
        return tuanduiTypes;
    }


    /**
	 * 设置：团队类型
	 */
    public void setTuanduiTypes(Integer tuanduiTypes) {
        this.tuanduiTypes = tuanduiTypes;
    }
    /**
	 * 获取：团队封面
	 */
    public String getTuanduiPhoto() {
        return tuanduiPhoto;
    }


    /**
	 * 设置：团队封面
	 */
    public void setTuanduiPhoto(String tuanduiPhoto) {
        this.tuanduiPhoto = tuanduiPhoto;
    }
    /**
	 * 获取：组织结构
	 */
    public String getTuanduiZuzhi() {
        return tuanduiZuzhi;
    }


    /**
	 * 设置：组织结构
	 */
    public void setTuanduiZuzhi(String tuanduiZuzhi) {
        this.tuanduiZuzhi = tuanduiZuzhi;
    }
    /**
	 * 获取：附件
	 */
    public String getTuanduiFile() {
        return tuanduiFile;
    }


    /**
	 * 设置：附件
	 */
    public void setTuanduiFile(String tuanduiFile) {
        this.tuanduiFile = tuanduiFile;
    }
    /**
	 * 获取：加入我们
	 */
    public String getTuanduiText() {
        return tuanduiText;
    }


    /**
	 * 设置：加入我们
	 */
    public void setTuanduiText(String tuanduiText) {
        this.tuanduiText = tuanduiText;
    }
    /**
	 * 获取：团队介绍
	 */
    public String getTuanduiContent() {
        return tuanduiContent;
    }


    /**
	 * 设置：团队介绍
	 */
    public void setTuanduiContent(String tuanduiContent) {
        this.tuanduiContent = tuanduiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
