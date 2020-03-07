package cm.chen.datasource;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class c3poDemo {
    public static void main(String[] args) throws Exception {
        DataSource ds = new ComboPooledDataSource();
        Connection conn = ds.getConnection();
        System.out.print(conn);

        Properties pro = new Properties();
        InputStream inputStream = c3poDemo.class.getClassLoader().getResourceAsStream("cm/chen/datasource/druid.properties");
        pro.load(inputStream);
        DataSource ds2 = DruidDataSourceFactory.createDataSource(pro);
        Connection conn2 = ds2.getConnection();
    }
}
