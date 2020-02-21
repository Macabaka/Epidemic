package com.scs.jdbc.dao;

import com.scs.jdbc.domain.vo.NewsVo;
import com.scs.jdbc.entity.News;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 12:47
 * @Description:
 */
public interface NewsDao {
    List<NewsVo> getAllNewsVo() throws SQLException;
    List<News> getAllNew() throws SQLException;
}
