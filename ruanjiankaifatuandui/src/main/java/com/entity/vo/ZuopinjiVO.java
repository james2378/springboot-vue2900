package com.entity.vo;

import com.entity.ZuopinjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 作品集
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zuopinji")
public class ZuopinjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show2 photoShow
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
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
