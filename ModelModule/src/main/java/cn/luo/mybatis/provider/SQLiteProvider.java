package cn.luo.mybatis.provider;

import cn.luo.mybatis.base.BaseProvider;
import cn.luo.utils.StringUtils;

import javax.naming.InvalidNameException;

public class SQLiteProvider implements BaseProvider {

    @Override
    public String selectAll(String tableName) throws InvalidNameException {
        return select(null, tableName, null, 0, 0);
    }

    @Override
    public String select(String selectStr, String tableName, String whereStr, int limit, int offset) throws InvalidNameException {
        StringBuilder builder = new StringBuilder();

        builder.append("SELECT ");
        if (StringUtils.stringIsEmpty(selectStr)) {
            builder.append("*");
        } else {
            builder.append(selectStr);
        }

        builder.append(" FROM ");
        if (StringUtils.stringIsEmpty(tableName)) {
            throw new InvalidNameException("The table name '" + tableName + "' is not invalid");
        } else {
            builder.append(tableName);
        }

        if (!StringUtils.stringIsEmpty(whereStr)) {
            builder.append(" WHERE ");
            builder.append(whereStr);
        }

        if (limit > 0) {
            builder.append(" LIMIT ");
            builder.append(limit);
            if (offset > 0) {
                builder.append(" OFFSET ");
                builder.append(offset);
            }
        }

        return builder.toString();
    }
}
