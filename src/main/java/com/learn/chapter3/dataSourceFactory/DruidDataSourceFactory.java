package com.learn.chapter3.dataSourceFactory;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-02 11:59
 */
public class DruidDataSourceFactory implements DataSourceFactory {
    Logger logger = LoggerFactory.getLogger(DruidDataSourceFactory.class);

    private Properties prop;

    @Override
    public void setProperties(Properties props) {
        this.prop = props;
    }

    @Override
    public DataSource getDataSource() {
        logger.info("自定义的数据库连接池");
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(this.prop.getProperty("driver"));
        dds.setUrl(this.prop.getProperty("url"));
        dds.setUsername(this.prop.getProperty("username"));
        dds.setPassword(this.prop.getProperty("password"));
        return dds;
    }
}
