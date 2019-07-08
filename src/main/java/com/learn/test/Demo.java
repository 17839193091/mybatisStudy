package com.learn.test;

import com.learn.chapter2.util.SqlSessionFactoryUtil;
import com.learn.chapter4.mapper.StudentMapper;
import com.learn.chapter4.po.StudentBean;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-01 11:04
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();

            //start...
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean student = mapper.getStudent(1);
            System.out.println(student);
            //end...

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
