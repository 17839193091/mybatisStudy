package com.learn.chapter3.objectFactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

/**
 * 描述:
 *      大部分情况下，并不需要使用自定义的ObjectFactory
 * @author hudongfei
 * @create 2019-07-02 11:43
 */
public class MyObjectFactory extends DefaultObjectFactory {
    Logger logger = LoggerFactory.getLogger(MyObjectFactory.class);

    @Override
    public <T> T create(Class<T> type) {
        logger.info("使用定制对象工厂的crate方法构建单个对象：" + type);
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        logger.info("使用定制对象工厂的crate方法构建列表对象：");
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        logger.info("定制属性：" + properties);
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
