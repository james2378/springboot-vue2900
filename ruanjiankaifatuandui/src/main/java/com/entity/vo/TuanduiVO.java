package com.entity.vo;

import com.entity.TuanduiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 团队信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tuandui")
public class TuanduiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
