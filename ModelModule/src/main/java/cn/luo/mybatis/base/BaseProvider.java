package cn.luo.mybatis.base;

import javax.naming.InvalidNameException;

public interface BaseProvider {
    String selectAll(String tableName) throws InvalidNameException;

    String select(String selectStr, String tableName, String whereStr, int limit, int offset) throws InvalidNameException;
}
