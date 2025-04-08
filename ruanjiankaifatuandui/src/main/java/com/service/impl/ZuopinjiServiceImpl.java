package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.ZuopinjiDao;
import com.entity.ZuopinjiEntity;
import com.service.ZuopinjiService;
import com.entity.view.ZuopinjiView;

/**
 * 作品集 服务实现类
 */
@Service("zuopinjiService")
@Transactional
public class ZuopinjiServiceImpl extends ServiceImpl<ZuopinjiDao, ZuopinjiEntity> implements ZuopinjiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZuopinjiView> page =new Query<ZuopinjiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
