package com.entity.vo;

import com.entity.TuanduichengyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 团队成员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tuanduichengyuan")
public class TuanduichengyuanVO implements Serializable {
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
     * 成员名称
     */

    @TableField(value = "tuanduichengyuan_name")
    private String tuanduichengyuanName;


    /**
     * 头像
     */

    @TableField(value = "tuanduichengyuan_photo")
    private String tuanduichengyuanPhoto;


    /**
     * 奖项类型
     */

    @TableField(value = "tuanduichengyuan_types")
    private Integer tuanduichengyuanTypes;


    /**
     * 指导教师
     */

    @TableField(value = "tuanduichengyuan_zhidaojiaoshi")
    private String tuanduichengyuanZhidaojiaoshi;


    /**
     * 获得奖项
     */

    @TableField(value = "tuanduichengyuan_chengyuan")
    private String tuanduichengyuanChengyuan;


    /**
     * 参加项目
     */

    @TableField(value = "tuanduichengyuan_xiangmu")
    private String tuanduichengyuanXiangmu;


    /**
     * 就业情况
     */

    @TableField(value = "jiuye_types")
    private Integer jiuyeTypes;


    /**
     * 就业企业
     */

    @TableField(value = "tuanduichengyuan_qiye")
    private String tuanduichengyuanQiye;


    /**
     * 创建时间 photoShow
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
	 * 设置：成员名称
	 */
    public String getTuanduichengyuanName() {
        return tuanduichengyuanName;
    }


    /**
	 * 获取：成员名称
	 */

    public void setTuanduichengyuanName(String tuanduichengyuanName) {
        this.tuanduichengyuanName = tuanduichengyuanName;
    }
    /**
	 * 设置：头像
	 */
    public String getTuanduichengyuanPhoto() {
        return tuanduichengyuanPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setTuanduichengyuanPhoto(String tuanduichengyuanPhoto) {
        this.tuanduichengyuanPhoto = tuanduichengyuanPhoto;
    }
    /**
	 * 设置：奖项类型
	 */
    public Integer getTuanduichengyuanTypes() {
        return tuanduichengyuanTypes;
    }


    /**
	 * 获取：奖项类型
	 */

    public void setTuanduichengyuanTypes(Integer tuanduichengyuanTypes) {
        this.tuanduichengyuanTypes = tuanduichengyuanTypes;
    }
    /**
	 * 设置：指导教师
	 */
    public String getTuanduichengyuanZhidaojiaoshi() {
        return tuanduichengyuanZhidaojiaoshi;
    }


    /**
	 * 获取：指导教师
	 */

    public void setTuanduichengyuanZhidaojiaoshi(String tuanduichengyuanZhidaojiaoshi) {
        this.tuanduichengyuanZhidaojiaoshi = tuanduichengyuanZhidaojiaoshi;
    }
    /**
	 * 设置：获得奖项
	 */
    public String getTuanduichengyuanChengyuan() {
        return tuanduichengyuanChengyuan;
    }


    /**
	 * 获取：获得奖项
	 */

    public void setTuanduichengyuanChengyuan(String tuanduichengyuanChengyuan) {
        this.tuanduichengyuanChengyuan = tuanduichengyuanChengyuan;
    }
    /**
	 * 设置：参加项目
	 */
    public String getTuanduichengyuanXiangmu() {
        return tuanduichengyuanXiangmu;
    }


    /**
	 * 获取：参加项目
	 */

    public void setTuanduichengyuanXiangmu(String tuanduichengyuanXiangmu) {
        this.tuanduichengyuanXiangmu = tuanduichengyuanXiangmu;
    }
    /**
	 * 设置：就业情况
	 */
    public Integer getJiuyeTypes() {
        return jiuyeTypes;
    }


    /**
	 * 获取：就业情况
	 */

    public void setJiuyeTypes(Integer jiuyeTypes) {
        this.jiuyeTypes = jiuyeTypes;
    }
    /**
	 * 设置：就业企业
	 */
    public String getTuanduichengyuanQiye() {
        return tuanduichengyuanQiye;
    }


    /**
	 * 获取：就业企业
	 */

    public void setTuanduichengyuanQiye(String tuanduichengyuanQiye) {
        this.tuanduichengyuanQiye = tuanduichengyuanQiye;
    }
    /**
	 * 设置：创建时间 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
