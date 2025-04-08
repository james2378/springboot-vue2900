package com.dao;

import com.entity.ZuopinjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuopinjiView;

/**
 * 作品集 Dao 接口
 *
 * @author 
 */
public interface ZuopinjiDao extends BaseMapper<ZuopinjiEntity> {

   List<ZuopinjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
